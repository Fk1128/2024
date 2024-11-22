package Test.TodoApp.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Test.TodoApp.dto.ResponseDTO;
import Test.TodoApp.dto.TodoDTO;
import Test.TodoApp.service.TodoService;

@RestController
@RequestMapping("/Todo")
public class Todocontroller {

	@Autowired
	private TodoService service;

	// 조회
	@GetMapping
	public ResponseEntity<?> retrieve(@AuthenticationPrincipal String userId) {
		List<TodoDTO> dtos = service.retrieve(userId);
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}

	// 추가
	@PostMapping
	public ResponseEntity<?> create(@AuthenticationPrincipal String userId,@RequestBody TodoDTO dto) {
		List<TodoDTO> dtos = service.create(userId,dto);
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);

	}

	// 수정
	@PutMapping
	public ResponseEntity<?> modify(@AuthenticationPrincipal String userId,@RequestBody TodoDTO dto) {
		List<TodoDTO> dtos = service.modify(userId ,dto);
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);

	}

	
	// 삭제
	@DeleteMapping
	public ResponseEntity<?> delete(@AuthenticationPrincipal String userId,@RequestBody TodoDTO dto){
		List<TodoDTO> dtos = service.delete(userId,dto);
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	

	
	
	
}
