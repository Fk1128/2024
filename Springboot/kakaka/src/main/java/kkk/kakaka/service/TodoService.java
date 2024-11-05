package kkk.kakaka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kkk.kakaka.entity.TodoEntity;
import kkk.kakaka.persistence.TodoRepository;
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

	// POST
	public List<TodoEntity> create(TodoEntity entity) {
		// 매개변수로 넘어온 Entity가 유효한지 검사한다.
		validate(entity);

		repository.save(entity);
		// {}는 SLF4J에서 제공하는 플레이스홀더로, 두 번째 매개변수로 전달된 entity.getId() 값이 여기에 대입되어 출력된다.
		log.info("Entity Id : {} is saved", entity.getId());
		return repository.findByUserIdQuery(entity.getUserId());
	
	}

	private void validate(TodoEntity entity) {
		// 전달된 TodoEntity가 null인지 확인합니다. 만약 null이면 RuntimeException을 발생시키고, 경고 로그를 기록한다.
		if (entity == null) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}

		// TodoEntity 객체가 userId를 가지고 있는지 확인한다.
		if (entity.getUserId() == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
	}

	// GET
	public List<TodoEntity> retrieve(String userId) {
		return repository.findByUserIdQuery(userId);
	}

	
	
	
	// UPDATE
	public List<TodoEntity> update(TodoEntity entity) {

		// 엔티티 유효확인 .
		validate(entity);


		Optional<TodoEntity> original = repository.findById(entity.getId()); 
		// 유효확인이 된 엔티티가 영속계층에서 findById(entity.getId());를 통해 아이디의 유무를 확인후 아이디가 있을시에
		// 아이디를 Optional객체로 반환한다 . 
		
		//todo가 Optional의 제네릭 타입을 참조하는 이유는 타입 안전성을 제공하고, 
		//코드의 명확성을 높이며, null 체크를 간편하게 할 수 있도록 도와주기 때문입니다. 이러한 특성 덕분에 Optional은 Java에서 매우 유용한 도구로 자리 잡고 있습니다.
		// 반환된 TodoEntity가 존재하면 값을 새 Entity값으로 덮어씌운다.
			original.ifPresent(todo -> {
				todo.setTitle(entity.getTitle());
				todo.setDone(entity.isDone());
			// 데이터베이스에 새 값을 저장한다.
			repository.save(todo);
		});
		return retrieve(entity.getUserId()) ;
		// 저장된 엔티티의 유저아이디를 인자로 업데이트가 잘 되었는지 retrieve(조회)메서드를 반환한다 .
	}
	
	
	// DELETE
	
	public List<TodoEntity> delete(TodoEntity entity){
		
		validate(entity) ;
		
		try {	
				repository.delete(entity);
				// delete() 메서드는 기본적으로 ID를 사용하여 엔티티를 삭제하는 로직을 포함하고있다 .
				// 따라서 HTTP DELETE 요청을 보낼때는 ID값을 body에 실어서 보내야한다 .
		} catch (Exception e) {
			log.error("error deleting entity ", entity.getId(),e);
		
			throw new RuntimeException("error deleting entity"+ entity.getId() ) ; 
		}
		
		return retrieve(entity.getUserId()) ;
	}
	
	
	
	

}