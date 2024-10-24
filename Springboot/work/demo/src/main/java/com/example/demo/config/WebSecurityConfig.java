//package com.example.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.web.filter.CorsFilter;
//
//import com.example.demo.security.JwtAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity // 웹 보안을 활성화 하는데 사용한다 .
//// 스프링 시큐리티설정을 활성화 하는 역할 .
//public class WebSecurityConfig {
//
//	@Autowired
//	private JwtAuthenticationFilter jwtAtuhenticationFilter;
//
//	@Autowired
//	private WebMvcConfig webMvcConfig;
//
//	@Bean // Bean을 직접만드는 어노테이션 / 어노테이션을 사용해 직접객체를 만든다 .
//	protected DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//		// HttpSecurity 설정
//		// 웹 보안을 설정하는데 사용되는 클래스 .
//		// HttpSecurity를 통해서 인증 권한부여 , csrf ,세션관리 등등 다 처리할 수 있다 .
//		http
//				// WebMvcConfig 에서 cors 설정을 했으므로 시큐리티에서는 비활성화한다 .
//				.cors(corsConfigurer -> corsConfigurer.disable())
//				// csrf : 사용자가 인증된 상태에서 공격자가 악의적으로 요청을 보내 사용자의 권한을 악용하는 공격기법 .
//				// API 서버가 클라이언트에서 Rest요청을 받을 때 CSRF보호가 불필요할 수 있다 .
//				.csrf(csrfConfigurer -> csrfConfigurer.disable())
//				// JWT를 사용하므로 Basic인증은 비활성화
//				.httpBasic(httpBasicConfigurer -> httpBasicConfigurer.disable())
//				// 세션을 사용하지않는다.
//				// sessionCreationPolicy() : 세션정책을 설정하는 메서드
//				// SessionCreationPolicy.STATELESS : 세션을 생성하지않고 stateless 방식으로 동작하도록 설정 .
//				.sessionManagement(sessionManagementConfigurer -> sessionManagementConfigurer
//						.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				// 요청에대한 인증/ 인가 설정
//				.authorizeHttpRequests(authorizeRequestsConfigurer ->
//				// 특정 경로는 인증없이 허용
//				authorizeRequestsConfigurer.requestMatchers("/", "/auth/**").permitAll()
//						// 그 외의 요청은 인증필요
//						.anyRequest().authenticated());
//		// filter등록
//		http.addFilterAfter(jwtAtuhenticationFilter, CorsFilter.class);
//
//		return http.build();
//	}
//
//}

package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestRedirectFilter;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestResolver;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.demo.security.JwtAuthenticationFilter;
import com.example.demo.security.OAUthUserServiceImpl;
import com.example.demo.security.OAuthSuccessHadler;
import com.example.demo.security.RedirectUrlCookieFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	
	@Autowired
	private RedirectUrlCookieFilter redirectUrlCookieFilter ;
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	@Autowired
	private OAUthUserServiceImpl oAuthUserService;

	@Autowired
	private OAuthSuccessHadler oAuthSuccessHandler;

	@Bean
	protected DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.cors(corsConfigurer -> corsConfigurer.configurationSource(corsConfigurationSource()))
				.csrf(csrfConfigurer -> csrfConfigurer.disable())
				.httpBasic(httpBasicConfigurer -> httpBasicConfigurer.disable())
				.sessionManagement(sessionManagementConfigurer -> sessionManagementConfigurer
						.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

				.authorizeHttpRequests(authorizeRequestsConfigurer -> authorizeRequestsConfigurer
						.requestMatchers("/", "/auth/**", "/oauth2/**").permitAll().anyRequest().authenticated())
				.oauth2Login()
				// oauth2로그인 설정 //security 자동으로 설정
				.redirectionEndpoint()
				// 아무주소도 넣지 않았다면 베이스URL인 http: // localhost:5000으로 리다이렉트 한다 .
				.baseUri("/oauth2/callback/*")
				// 인증이 성공하면 리다이렉트할 엔드포인트의 URI
				// OAuth 제공자로부터 사용자 정보를 가져올 때 사용하는 엔드포인트를 설정한다 .
				// 이부분은 OAuth 인증이 성공 한 후 , 사용자 프로필데이터를 가져오는 역할
				.and().authorizationEndpoint()
				// OAuth2 인증의 흐름에서 권한부여 엔드포인트를 설정하기 위한것이다 .
				// OAuth2 에서 클라이언트 애플리케이션이 사용자를 대신해 권한을 요청할 때 사용되는 엔드포인트가 권한부여 엔드포인트이다 .
				// 사용자는 이엔드포인트로 리다이렉션되어 권한을 승인하는 과정을 거친다
				.baseUri("/auth/authorize")
				// OAuth2 권한부여 요청을 처리하는 엔드포인트의 기본 URI를 설정하는 것이다.
				// 즉 어플리케이션은 사용자가 로그인을 시도할 때 이 엔드포인트를 통해 OAuth 권한 요청을 수행한다 .
				.and().userInfoEndpoint()

				// 사용자 정보를 처리하는 서비스를 지정하는 메서드
				.userService(oAuthUserService)// oauth2 로그인 설정
				.and().successHandler(oAuthSuccessHandler)
				.and().exceptionHandling()
				// exceptionHandling() 시큐리티에서 발생하는 예외상황, 예를들어 인증되지 않은 사용자가
				// 자원에 접근하려고 할 때 어떤 동작을 할지 정의할 수 있다 .
				.authenticationEntryPoint(new Http403ForbiddenEntryPoint());
				// oauth2 인증이 성공한 뒤 실행될 동작을 정의하는 메서드
				//.authenticationEntryPoint(new Http403ForbiddenEntryPoint());
				// 인증이 필요한 자원에 대해 인증되지않은 사용자가 접근할 때 403응답을 반환하도록 설정하는것 .

		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		http.addFilterAfter(redirectUrlCookieFilter,OAuth2AuthorizationRequestRedirectFilter.class) ;

		return http.build();
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		// React 애플리케이션이 실행되는 출처에서 오는 요청을 허용
		configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000")); // 프론트엔드 주소
				//"http://react-developer-env.eba-bfip8yjb.ap-northeast-2.elasticbeanstalk.com/", "http://app.foo1.shop/",
				//"https://app.foo1.shop/"
				
		// HTTP 메서드 허용 get,post,put,delete,options
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		// 모든 헤더를 허용
		configuration.setAllowedHeaders(Arrays.asList("*"));
		// 쿠키나 인증 정보를 포함한 요청을 허용
		configuration.setAllowCredentials(true);
		
		
		// 모든 경로에 대해 CORS 설정을 적용 
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}
