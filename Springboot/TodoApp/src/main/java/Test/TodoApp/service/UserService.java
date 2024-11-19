package Test.TodoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Test.TodoApp.dto.UserDTO;
import Test.TodoApp.model.UserEntity;
import Test.TodoApp.persistence.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	// 유저생성
	public UserEntity create(UserDTO dto) {
		UserEntity entity = UserEntity.builder().id(dto.getId()).password(passwordEncoder.encode(dto.getPassword()))
				.userId(dto.getUserId()).build();
		if (entity.getUserId() == null || entity == null) {
			throw new RuntimeException("Invalid arguments");
		} // 유효성검증
		final String userName = entity.getUserId();

		if (repository.existsByUserId(userName)) {
			log.warn("Username already exist {} ", userName);
			throw new RuntimeException("UserName already exist");
			// 중복체크
		}
		return repository.save(entity);
	}

	// userName,password가 같은 user 엔티티 조회
	public UserEntity getByCredentials(String userName, String password) {
		UserEntity originalUser = repository.findByUserId(userName);
		// DB에 저장된 암호화된 비밀번호와 사용자에게 입력받아 전달된 암호화된 비밀번호를 비교
		if (originalUser != null && passwordEncoder.matches(password, originalUser.getPassword())) {
			return originalUser;
		}

		return repository.findByUserIdAndPassword(userName, password);
	}

}