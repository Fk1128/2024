package practice.test1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.test1.DTO.DTO;
import practice.test1.DTO.ResponseDTO;
import practice.test1.service.Service;

@RequestMapping("Ingredients")
@RestController
public class Controller {

	@Autowired
	private Service service;

	
	
	@GetMapping
	public ResponseEntity<?> retrieve() {
		List<DTO> dtos = service.retrieve();
		ResponseDTO<DTO> response = ResponseDTO.<DTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	@GetMapping("ItemRetrieve")
	public ResponseEntity<?> retrieveItem(@RequestBody DTO dto){
		List<DTO> dtos = service.retrieveItem(dto);
		ResponseDTO<DTO> response = ResponseDTO.<DTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody DTO dto) {
		List<DTO> dtos = service.create(dto);
		ResponseDTO<DTO> response = ResponseDTO.<DTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}

	@PutMapping
	public ResponseEntity<?> modify(@RequestBody DTO dto) {
		List<DTO> dtos = service.modify(dto) ;
		ResponseDTO<DTO> response = ResponseDTO.<DTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody DTO dto){
		List<DTO> dtos = service.delete(dto) ;
		ResponseDTO<DTO> response = ResponseDTO.<DTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
}
