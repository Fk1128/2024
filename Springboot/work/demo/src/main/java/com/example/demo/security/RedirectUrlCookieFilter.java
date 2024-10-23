package com.example.demo.security;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RedirectUrlCookieFilter  extends OncePerRequestFilter {
	public static final String REDIRECT_URI_PARAM="redirect_url" ;
	private static final int MAX_AGE = 180 ;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		if(request.getRequestURI().startsWith("/auth/authorize")) {
			try {
				log.info("request url {} " , request.getRequestURI()) ;
				// 요청 파라미터에서 redirect_url 
				String redirectUrl = request.getParameter(REDIRECT_URI_PARAM) ; 
				
				//key 와 value 를 가진 쿠키를 생성
				Cookie cookie = new Cookie(REDIRECT_URI_PARAM, redirectUrl) ;
				cookie.setPath("/") ;
				//setPath : 쿠키가 어느경로에서 유효한가 
				// root 경로로 설정해 놓으면 어플리케이션의 모든페이지
				cookie.setHttpOnly(true) ; //httpOnly 옵션은 자바스크립트로 브라우저의 쿠키에 접근하는 것을 막기 위한 옵션이다 .
				cookie.setMaxAge(MAX_AGE) ;  // 쿠키의 유효시간 MaxAge
				//쿠키가 유지되는 시간(초)을 정의한다. 이 값은 현재 시간에서 더해져서 쿠키의 만료 시간이 계산된다.
			
			} catch (Exception e) {
				logger.error("Could not set user authentication in security context ",e) ;
				log.info("Unauthorized request") ;
			}	
		} // if e
		
		filterChain.doFilter(request, response) ;
		
		
	}
	
	
}

