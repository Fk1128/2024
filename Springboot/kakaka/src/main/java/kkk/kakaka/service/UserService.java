package kkk.kakaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kkk.kakaka.entity.UserEntity;
import kkk.kakaka.persistence.UserRepository;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository ;
	
	public UserEntity create(UserEntity userEntity) {
	 
		
		//userEntity , userEntity.userName이 null일 경우 예외를 던진다 .
		if(userEntity == null || userEntity.getUserName() == null ) {
			throw new RuntimeException("invaild arguments"); 
			//유효하지않 인자에대해 예외를 발생시킨다 .
		}
		final String userName = userEntity.getUserName() ;
		// userEntity 에서 userName을 가져온다 . 
		
		//주어진 name이 이미 존재하는경우 경고로그를 남기고 예외를 던진다 .
		if(userRepository.existsByUserName(userName)) {
			log.warn("UserName already exists {} " , userName ); //userName이 존재한다는 로그를 기록한다 . 
			throw new RuntimeException(" Username already exists"); // 중복인경우 예외를 던진다 . 
		}
		//username이 중복되지 않았다면 UserEntity를 데이터베이스에 저장하고 반환한다 .
		return userRepository.save(userEntity) ;
	}
	
	
	
	// 주어진 username과password로 UserEntity를 조회한다 .
	
	public UserEntity getByCredentials(String userName , String password ) {
		//userRepository에 메서드를통해 주어진 유저네임과 패스워드로 유저정보를 조회한다 .
		return userRepository.findByUserNameAndPassword(userName, password) ;
	}
	
	
	
	
	
	

}
