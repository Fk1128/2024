package com.korea.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.board.dto.BoardDTO;
import com.korea.board.dto.ResponseDTO;
import com.korea.board.service.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardController {

	
	
	@Autowired
	private BoardService service ;
	

	@GetMapping("/all")
	public ResponseEntity<?> retrieve(){
		List<BoardDTO> dtos = service.retrieve() ;
		return ResponseEntity.ok().body(dtos) ;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> retrieveOne(@PathVariable Long id) {
		BoardDTO one = service.retrieveOne(id) ;
		ResponseDTO<BoardDTO> response=  ResponseDTO.<BoardDTO>builder().data(one).build();
		return ResponseEntity.ok().body(response) ;
	}
	
	@PostMapping("/write")
	public ResponseEntity<?> write(@RequestBody BoardDTO dto) {
		List<BoardDTO> dtos = service.craete(dto);
		return ResponseEntity.ok().body(dtos); 
		
	}
	
	
	@PutMapping("/modify/{id}")
	public ResponseEntity<?> modify(@PathVariable Long id ,@RequestBody BoardDTO dto){
		BoardDTO one =service.modify(dto) ;
		ResponseDTO<BoardDTO> response = ResponseDTO.<BoardDTO>builder().data(one).build();
		return ResponseEntity.ok().body(response) ;	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@RequestBody BoardDTO dto){
		List<BoardDTO> dtos = service.delete(dto);
		return ResponseEntity.ok().body(dtos) ;
	}
	
}
