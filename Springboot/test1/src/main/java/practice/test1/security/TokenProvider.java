package practice.test1.security;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import practice.test1.model.User;

@Slf4j
@Service
public class TokenProvider {

	private static final String SECRET_KEY ="eyJhbGciOiJIUzUxMiJ9eyJzdWIiOiI0MDI4ODA5Mzc4NDkxNWQyMDE3ODQ5MTZhNDBjMDAwMSIsImlzcyI6InRlc3QgYXBwIiwiaWF0IjoxNTk1NzMzNjU3LCJleHAiOjE1OTY1OTc2NTd9A4y4UKNJebpz2LURtpWRGuI0TKs2h7dhlCNEdDgmeTXQ9tCwmO6UuWbgCqXHCaUUrskKxhtwhU8AZuffXkg";
	
	public String create(User entity) {
		Date expiryDate = Date.from(
				Instant.now()
				.plus(1,ChronoUnit.DAYS));
		
		return Jwts.builder()
				.signWith(SignatureAlgorithm.HS512,SECRET_KEY)
				// header에 들어갈 내용 및 서명을하기위한 SECRET_KEY
				.setSubject(entity.getId()) // sub
				//payload에 들어갈 내용
				.setIssuer("test app") // iss
				.setIssuedAt(new Date()) // lat
				.setExpiration(expiryDate) //exp
				.compact() ;
	}
	
	public String validateAndGetuserName(String token) {
		Claims claims = Jwts.parser()
				.setSigningKey(SECRET_KEY)
				.parseClaimsJws(token)
				.getBody() ;
		return claims.getSubject() ;
	}
	
	
	
	
}
