package practice.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;
import practice.test1.DTO.UserDTO;
import practice.test1.model.User;
import practice.test1.persistence.UserRepository;

@Slf4j
@org.springframework.stereotype.Service
public class UserService {

	@Autowired
	private UserRepository repository;

	
	
	// 유저생성
	public User create(UserDTO dto) {
		User entity = UserDTO.toEntity(dto) ;
		if(entity.getId()==null || entity ==null ) {
			throw new RuntimeException("Invalid arguments");
		}	// 유효성검증
		if(repository.existByuserName(entity.getUserName())) {
			log.warn("Username already exist {} ", entity.getUserName()) ;
			// 중복체크
		}
		 return repository.save(entity);
	}
	
	//userName,password가 같은 user 엔티티 조회
	public User getByCredentials (String userName, String password) {
		return repository.findByuserNameAndPassword(userName, password);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
