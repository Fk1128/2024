package kkk.kakaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kkk.kakaka.dto.ResponseDTO;
import kkk.kakaka.dto.UserDTO;
import kkk.kakaka.entity.UserEntity;
import kkk.kakaka.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping
public class UserController {

	
	@Autowired
	private UserService userService ;
	
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO){
		
		try {
			UserEntity user = UserEntity.builder()
					.userName(userDTO.getUserName())
					.password(userDTO.getPassword())
					.build(); 
			// userEntity 객체를 빌
			
			UserEntity registerUser = userService.create(user) ;
		
			UserDTO responseUserDTO = UserDTO.builder()
					.id(registerUser.getId())
					.userName(registerUser.getUserName())
					.build();
			
			return ResponseEntity.ok(responseUserDTO) ;
		
		} catch (Exception e) {
			ResponseDTO responseDTO = ResponseDTO.builder().error(e.getMessage()).build();
			
			
			return ResponseEntity
					.badRequest()
					.body(responseDTO) ;
		}
		
		
	}
	@PostMapping("/signin")
	public ResponseEntity<?>  authenticate(@RequestBody UserDTO userDTO){
		UserEntity user = userService.getByCredentials(userDTO.getUserName(),userDTO.getPassword()) ;
		if(user != null) {
			// 인증에 성공한 경우 유저 정보를 UserDTO로 변환하여 응답에 사용한다.
			final UserDTO responseUserDTO = UserDTO.builder().id(user.getId()).userName(userDTO.getUserName()).build();
			return ResponseEntity.ok().body(responseUserDTO) ;
		}else {
			ResponseDTO responseDTO = ResponseDTO.builder().error("Login failed").build();
			
			return ResponseEntity.badRequest().body(responseDTO) ;
		}	
		
		
	}
	
	
	
	
	
	
	
}
