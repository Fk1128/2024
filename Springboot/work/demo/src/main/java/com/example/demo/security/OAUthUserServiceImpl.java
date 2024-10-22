package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
//DefaultOAuth2UserService
//시큐리티 기본에서 제공하는 OAuth2 로그인시 사용자의 정보를 처리하는 서비스 클래스이다.
//OAuth2 인증이 성공하면 스프링 시큐리티는 이 클래스를 이용해 OAuth2 제공자(github)로부터
// 사용자의 정보를 가져오고 , 이를 기반으로 어플리케이션에서 인증된 사용자 객체를 생성한다 .

import com.example.demo.model.UserEntity;
import com.example.demo.presistence.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class OAUthUserServiceImpl extends DefaultOAuth2UserService  {
	
	@Autowired
	private UserRepository userRepository;
	
	public OAUthUserServiceImpl() {
		super() ;
	}
	
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest)  throws OAuth2AuthenticationException{
		final OAuth2User oAuth2User = super.loadUser(userRequest);
		try {
			log.info("OAuth2User attributes {}",new ObjectMapper().writeValueAsString(oAuth2User.getAttributes()));
		} catch (Exception e) {			
		}
		//login 필드를 가져온다 
		final String username =(String) oAuth2User.getAttributes().get("login");
		//현재 사용자가 어떤 OAuth2 제공자를 통해 로그인했는지 이름을 반환한다 .
		final String authProvider = userRequest.getClientRegistration().getClientName() ;

		UserEntity userEntity = null ;
		
		// 유저가 존재하지 않으면 새로 생성한다 .
		if(userRepository.existsByUsername(username)) {
			userEntity = UserEntity.builder()
							.username(username)
							.authProvider(authProvider)
							.build();

			// 내용을 넣은 userEntity객체를 db에 저장 .
			userEntity = userRepository.save(userEntity) ;
		}
		
		log.info("Successfully pulled user info username {} authProvider {}",username,authProvider);
		return new ApplicationOAuth2User(userEntity.getId(),oAuth2User.getAttributes());
	}

}


















