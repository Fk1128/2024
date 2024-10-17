package com.korea.product.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//스프링에서 해당 클래스를 설정파일로 인식하고 Bean으로 등록한다.
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
//WebMvcConfigurer
//스프링 MVC동작을 커스터마이징 할 때 사용된다.
//스프링은 기본적으로 MVC동작을 설정해주지만, 때로는 프로젝트 요구사항에 맞게 특정 기능을 추가하거나
//수정해야 할 때 WebMvcConfigurer를 구현하여 원하는 설정을 적용할 수 있다.
//주요 기능

	// 브라우저가 CORS 요청 결과를 캐싱하는데 최대 시간 설정
	private final long MAX_AGE_SECS = 3600;

//CORS 설정
//하나의 출처에서 다른 출처로 REQUEST를 허용해주는것

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**").allowedOrigins("http://localhost:3000")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowedHeaders("*")
				.allowCredentials(true)
				.maxAge(MAX_AGE_SECS);
	}
}
