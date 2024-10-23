package com.example.demo.security;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//SimpleUrlAuthenticationSuccessHandler 
//인증 성공 후 사용자를 처리하는 데 사용되는 클래스
//

@Slf4j
@Component
@AllArgsConstructor
public class OAuthSuccessHadler  extends SimpleUrlAuthenticationSuccessHandler{
	
	private static final String LOCAL_REDIRECT_URL = "http://localhost:3000";	
	
	
	//토큰을 생성하고 , 반환하는 기능
	@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
				Authentication authentication) throws IOException, ServletException {
			TokenProvider tokenprovider = new TokenProvider();
			String token = tokenprovider.create(authentication);
			
			
			
			// response.getWriter().write(token);
			log.info("token {} ",token) ;
			
			// 쿠키를 불러와서 사용하기 
			Optional<Cookie> oCookie = Arrays.stream(request.getCookies())
										.filter(cookie -> cookie.getName()
										.equals("redirect_url")).findFirst(); 
			Optional<String> redirectUri = oCookie.map(Cookie::getValue) ;
			
			// 강제로 리다이렉트를 함 
			//O
			response.sendRedirect(redirectUri.orElseGet(() -> LOCAL_REDIRECT_URL)+"/socialLogin?token" +token);
			
			
		}
		
}
