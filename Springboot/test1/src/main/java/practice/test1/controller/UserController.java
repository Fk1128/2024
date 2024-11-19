package practice.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import practice.test1.DTO.ResponseDTO;
import practice.test1.DTO.UserDTO;
import practice.test1.model.User;
import practice.test1.security.TokenProvider;
import practice.test1.service.UserService;

@RequestMapping("/auth")
@Slf4j // log 를 사용할수있는 log 객체 생성
@RestController
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private TokenProvider tokenProvider;

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDTO dto) {

		try {
			User registerdUser = service.create(dto);
			UserDTO responseUserDTO = UserDTO.builder().id(registerdUser.getId())
					.userName(registerdUser.getUserName()).build() ;
			return ResponseEntity.ok().body(responseUserDTO);
		} catch (Exception e) {
			ResponseDTO responseDTO = ResponseDTO.builder().error(e.getMessage()).build();
			return ResponseEntity.badRequest().body(responseDTO);
		}

	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO dto) {
		User user = service.getByCredentials(dto.getUserName(), dto.getPassword());
		if (user != null) {
			
			final String token = tokenProvider.create(user) ;
			//토큰생성
			
			final UserDTO responseUserDTO = UserDTO.builder().id(user.getId()).userName(user.getUserName())
					.token(token).build();
			return ResponseEntity.ok().body(responseUserDTO);
			// service의 userName,password를 통해 user의 entity를 얻는다
			// user변수의 null 이 아닌경우  UserDTO에 id , userName , token 을 build하여 UserDTO 객체 생성
			// http 200응답과 UserDTO 객체를 반환한다 .
		} else {
			ResponseDTO responseDTO = ResponseDTO.builder().error("Login failed").build();
			return ResponseEntity.badRequest().body(responseDTO);
			// userName과 password로 repository에서 user의 entity를 찾지못한경우
			// builder 패턴을 통해 ResponseDTO의 객체를 error메세지를 설정후
			// http 400응답과 ResponseDTO객체를 반환한다 .
		}

	}

}
