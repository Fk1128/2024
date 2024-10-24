package com.test.Todo.todoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.test.Todo.todoRepository.TodoRepository;
import com.test.Todo.todoentity.TodoEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service // 주로 비즈니스 로직을 처리하는데 클래스에 붙인다 .
// @Service 애노테이션이 붙은 클래스는 **스프링 빈(Bean)**으로 등록되어
// **DI(Dependency Injection, 의존성 주입)**를 통해 다른 클래스에서 주입(injection)될 수 있다.
public class TodoService {

	@Autowired // 의존성 주입
	private TodoRepository repository;

	public String testService() {
		// 엔티티 생성
		TodoEntity entity = TodoEntity.builder().title("test").build();
		// TodoEntity
		repository.save(entity); // repository에 title의 값을 넣어주기 위한 코드

		// TodoEntity 검색
		TodoEntity savedEntity = repository.findById(entity.getId()).get();
		return savedEntity.getTitle();
		// 리파지토리에 JPArepository를 상속받아 사용가능한
		// findById 메서드를 사용해 엔티티의 id값을 가지고 테이블에서 entity.getId()를 통해
		// 반환된optional<TodoEntity>객체를
		// get() 메서드를통해 TodoEntity 객체로 만들어 savedEntity 변수안에 담고 그 변수에서 getTitle 메서드를 통해
		// Title의 값을 반환하는 메서드이다 .

	}

	public List<TodoEntity> create(TodoEntity entity) {
		// 매개변수로 넘어온 Entity가 유효한지 검사한다.
		if (entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}

		if (entity.getUserId() == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}

		repository.save(entity);

		// {}는 SLF4J에서 제공하는 플레이스홀더로, 두 번째 매개변수로 전달된 entity.getId() 값이 여기에 대입되어 출력된다.
		log.info("Entity Id : {} is saved", entity.getId());

		return repository.findByUserIdQuery(entity.getId());
	}

	private void validate(TodoEntity entity) {
		//전달된 TodoEntity가 null인지 확인합니다. 만약 null이면 RuntimeException을 발생시키고, 경고 로그를 기록한다.
		if(entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}
		
		//TodoEntity 객체가 userId를 가지고 있는지 확인한다.
		if(entity.getUserId() == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
	}	
	
	
	
	
	
	
	
	
	
}
