package Test.TodoApp.security;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import org.springframework.stereotype.Service;

import Test.TodoApp.model.UserEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TokenProvider {

	private static final String SECRET_KEY_STRING = "YXNkanNhbGtkamFzbGpkYXNrbmRzYWprbmNhc3p4b2NqYXNjbmtseHpuY2tsc2FzZGphc2tsamRrbGF3aG5kcXdpZG5hc2RuYXNrbGRucXdrbGRuYXNrbGNuem1hc2RqaWFzb2RuYQ==";
	private static final byte[] SECRET_KEY = Base64.getDecoder().decode(SECRET_KEY_STRING);
	private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY);

	public String create(UserEntity entity) {
		Date expiryDate = Date.from(Instant.now().plus(1, ChronoUnit.DAYS));

		String token = Jwts.builder().signWith(key, SignatureAlgorithm.HS512).setSubject(entity.getUserId())
				.setIssuer("test app").setIssuedAt(new Date()).setExpiration(expiryDate).compact();
		log.info("Token created for user: {}", entity.getUserId());

		return token;
	}

	public String validateAndGetUserId(String token) {

		Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
		String userId = claims.getSubject();
		log.info("Token validated for user: {}", userId);
		return userId;

	}
}
