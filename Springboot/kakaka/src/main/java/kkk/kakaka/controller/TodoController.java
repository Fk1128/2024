package kkk.kakaka.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kkk.kakaka.dto.ResponseDTO;
import kkk.kakaka.dto.TodoDTO;
import kkk.kakaka.entity.TodoEntity;
import kkk.kakaka.service.TodoService;

@RestController // RSET API 개발에 최적화,웹 페이지가 아닌 데이터를 반환하는 컨트롤러로 사용된다
//@Controller와 @ResponseBody가 합쳐진 어노테이션
@RequestMapping("todo") // 요청에 대해 어떤Controller, 어떤 메소드가 처리할지를 맵핑.
public class TodoController {

	@Autowired // 의존성 주입. todoService 객체를 자동으로 주입해 서비스 계층 메서드를 사용할 수 있다 .
	private TodoService todoService;

	@GetMapping("/test") // GET 요청을 처리하는 메서드를 정의 . /todo/test 경로로 들어오는 요청을 이메서드가 처리 .
	public ResponseEntity<?> testTodo() {
		String str = todoService.testService();// 서비스계층 클래스의 테스트 서비스 사용
		List<String> list = new ArrayList<>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		// ResponseDTO 클래스의 builder@ 어노테이션으로 생성된 builder() 이용하여 data에 list를 전달후
		// build메서드로 객체 생성 .
		return ResponseEntity.ok().body(response);
		// ResponseEntity.ok() HTTP 상태코드 200과 함께 본문에 response 를 담은 ResponseEntity를 반환

	}
	
	@PostMapping // http의 post요청을 처리하는데 사용된다 .
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto) {
		// RequestBody : http 요청의 본문에 포함된 데이터 메서드의 매개변수로 매핑
		// 자바 객체 형식으로 변환

		try {
			String tempraryUserId = "temporary-user"; // 임시 유저 Id
			TodoEntity entity = TodoDTO.toEntity(dto); // 매개변수로 받은 dto를 Entity타입으로 변환후 변수에 저장 .
			System.out.println(entity);
			entity.setId(null); // enntity의 id를 null 로 지정
			entity.setUserId(tempraryUserId); // userId를 임시유저Id 로 지정
			List<TodoEntity> entities = todoService.create(entity);
			// entity를 저장후 저장되었다는 로그 (create 메서드속에있음) 출력후 List<TodoEntity> 로 반환받은 entity를
			// entities변수에 저장
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
		} catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	@GetMapping // http의 get요청을 처리하는데 사용된다 .
	public ResponseEntity<?> retrieveTodoList(){
		String temporaryUserId = "temporary-user";
		
		//서비스레이어의 retrieve메서드를 이용해 Todo리스트를 반환받아 entities에 저장한다.
		List<TodoEntity> entities = todoService.retrieve(temporaryUserId);
		
		//자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(dtos);
	}	
	
	
	@PutMapping // http의 put 요청을 처리하는데 사용된다 .
	public ResponseEntity<?> updateTodoList(@RequestBody TodoDTO dto){
		String temporaryUserId= "temporary-user" ;
		
		TodoEntity entity = TodoDTO.toEntity(dto) ;
		entity.setUserId(temporaryUserId);
		//서비스레이어의 update메서드를 이용해 entity를 업데이트한다.
		List<TodoEntity> entities = todoService.update(entity) ;
		//자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
		List<TodoDTO> dtos =entities.stream().map(TodoDTO::new).collect(Collectors.toList()) ;
		//변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response) ;
	}
	
	
	
	@DeleteMapping
	public ResponseEntity<?> deleteTodoList(@RequestBody TodoDTO dto) {
		String temporaryUserId= "temporary-user" ;
		
		TodoEntity entity = TodoDTO.toEntity(dto) ;
		
		entity.setUserId(temporaryUserId);
		
		List<TodoEntity> entities = todoService.delete(entity);
		//자바 스트림을 이용해 반환된 엔티티 리스트를 TodoDTO 리스트로 변환한다
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList()) ;
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
	
		return ResponseEntity.ok().body(response) ;
	
	}
	
	
	
	
	
	
	
	
	
	
	

}