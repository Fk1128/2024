package kkk.kakaka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	private final long MAX_AGE_SECS = 3600; // 브라우저가 CORS 요청 결과를 캐싱하는 최대 시간(초) 설정

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// addMapping("/**"): 모든 경로에 대해 CORS 설정을 적용
		registry.addMapping("/**")
				// allowedOrigins("http://localhost:3000"): React 애플리케이션이 실행되는 도메인(출처)에서 오는 요청을
				// 허용
				.allowedOrigins("http://localhost:3000")
				// allowedMethods("GET", "POST", "PUT", "DELETE"): HTTP 메서드(GET, POST, PUT,
				// DELETE)를 허용
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				// allowedHeaders("*"): 모든 헤더를 허용
				.allowedHeaders("*")
				// allowCredentials(true): 쿠키나 인증 정보를 포함한 요청을 허용
				.allowCredentials(true)
				// maxAge(MAX_AGE_SECS): 브라우저가 서버로부터 받은 응답을 일정 시간 동안 저장해 두고, 그 시간 내에 동일한 요청이 있을
				// 경우 서버에 다시 요청하지 않고 저장된 응답을 재사용한다는 의미다.
				.maxAge(MAX_AGE_SECS);
	}
}