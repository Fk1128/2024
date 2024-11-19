package Test.TodoApp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;

import Test.TodoApp.dto.TodoDTO;
import Test.TodoApp.model.TodoEntity;
import Test.TodoApp.persistence.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	// 전체조회
	public List<TodoDTO> retrieve(String userId) {
		
		List<TodoEntity> entities = repository.findByUserId(userId);
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		return dtos;
	}

	// 추가 
	public List<TodoDTO> create(String userId,TodoDTO dto) {
		TodoEntity entity = TodoDTO.toEntity(dto);
		entity.setUserId(userId);
		repository.save(entity);
		return retrieve(userId) ;
	}
	
	// 수정
	public List<TodoDTO> modify(String userId,TodoDTO dto) {
		validate(dto) ;
		TodoEntity entity =TodoDTO.toEntity(dto);
		Optional<TodoEntity> origin =repository.findById(entity.getId()) ;
		origin.ifPresent(todo -> {
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.getDone()) ;
			
			repository.save(todo) ;
		});
		return retrieve(userId) ;
	}
	
	
	// 삭제
	public List<TodoDTO> delete(String userId,TodoDTO dto){
		validate(dto) ;
		repository.deleteById(TodoDTO.toEntity(dto).getId());
		return retrieve(userId) ;
	}
	
	// 유효성 검증
	public void validate(TodoDTO dto) {
		TodoEntity entity =TodoDTO.toEntity(dto);
		if(entity == null || entity.getUserId() == null) {
			 throw new RuntimeException("Entity or Id can not be null") ;
		}
		
	}
	
	
	
	
	

}
