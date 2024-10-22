package com.example.demo.security;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
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
	//토큰을 생성하고 , 반환하는 기능
	@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
				Authentication authentication) throws IOException, ServletException {
			// TODO Auto-generated method stub
			TokenProvider tokenprovider = new TokenProvider();
			String token = tokenprovider.create(authentication);
		}

}
