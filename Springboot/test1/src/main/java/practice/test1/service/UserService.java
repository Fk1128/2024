package practice.test1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.slf4j.Slf4j;
import practice.test1.DTO.UserDTO;
import practice.test1.model.User;
import practice.test1.persistence.UserRepository;

@Slf4j
@org.springframework.stereotype.Service
public class UserService {

	@Autowired
	private UserRepository repository;

	private PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();

	// 유저생성
	public User create(UserDTO dto) {
		User entity = User.builder().id(dto.getId()).password(passwordEncoder.encode(dto.getPassword()))
				.userName(dto.getUserName()).build();
		if (entity.getUserName() == null || entity == null) {
			throw new RuntimeException("Invalid arguments");
		} // 유효성검증
		final String userName = entity.getUserName();
		
		if (repository.existsByUserName(userName)) {
			log.warn("Username already exist {} ", userName);
			throw new RuntimeException("UserName already exist");
			// 중복체크
		}
		return repository.save(entity);
	}

	// userName,password가 같은 user 엔티티 조회
	public User getByCredentials(String userName, String password) {
		User originalUser = repository.findByUserName(userName) ;
		// DB에 저장된 암호화된 비밀번호와 사용자에게 입력받아 전달된 암호화된 비밀번호를 비교
		if(originalUser != null && passwordEncoder.matches(password,originalUser.getPassword())) {
			return originalUser ;
		}
		
		return repository.findByUserNameAndPassword(userName, password);
	}

}
