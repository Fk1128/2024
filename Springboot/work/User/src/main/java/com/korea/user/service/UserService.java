package com.korea.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.persistence.UserRespository;

@Service
public class UserService {
	@Autowired
	private UserRespository userRepository;

	// user 전체조회

	public List<UserDTO> allUsers() {
		List<UserDTO> list = userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
		return list;
	}

	// id 중복체크 메서드
	// id를 db로 전달해서 조회가되면 false , 조회가 안되면 true를 반환
	// true 면 아이디생성가능 , false 면 아이디 생성 불가능
	public boolean isIdDuplicated(String id) {
		Optional<UserEntity> user = userRepository.findByUserId(id);
		return !user.isPresent();
		// Optional 객체가 값을 가지고 있다면 true, 값이 없다면 false 리턴
		// 조회가 되면 false를 반환

	}

	// 회원가입 메서드
	public List<UserDTO> insert(UserDTO dto) {

		// dto -> entity
		UserEntity entity = UserDTO.toEntity(dto);

		// entity 를 db에 저장
		userRepository.save(entity);

		// List<UserEntity> -> List<UserDTO>
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());

	}

	// 로그인
	// 아이디랑 비밀번호를 받는다 .

	public UserEntity getByCredential(String userId, String pwd) {
		return userRepository.findByUserIdAndPwd(userId, pwd);
	}



	//이름 가져오기 
	public  UserEntity getUserName(String userId) {
		Optional<UserEntity> option = userRepository.findByUserId(userId) ;
		// 조회된 내용이 있다면 
		if(option.isPresent()) {
			//option에서 내용을 꺼내와 entity에 저장 .
			UserEntity entity = option.get();	
			return entity;
		}
		return null ;
	}
	
	
	//수정하기
	
	public void modify(UserDTO dto) {
		//1 . 원본을 db에서 꺼낸다 
		Optional<UserEntity> option =userRepository.findByUserId(dto.getUserId());
		//Optional : 값이 있거나 없음을 명시적으로 표현할 수 있게 해주는 클래스
		if(option.isPresent()) {
			UserEntity entity = option.get();
			entity.setPwd(dto.getPwd());
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
		
		//2. 내가 가져온 내용으로 객체를 세팅한다 .
			userRepository.save(entity);
		}//3. 수정한 내용을 db에 저장한다 .
	}
	
	
	
	
	

}
