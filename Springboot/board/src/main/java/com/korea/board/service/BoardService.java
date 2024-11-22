package com.korea.board.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.board.dto.BoardDTO;
import com.korea.board.entity.BoardEntity;
import com.korea.board.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository repository;

	// 조회
	public List<BoardDTO> retrieve() {
		List<BoardEntity> entities = repository.findAll();
		List<BoardDTO> dtos = entities.stream().map(BoardDTO::new).collect(Collectors.toList());
		return dtos;
	}
	
	
	//한건조회
	public BoardDTO retrieveOne(Long id) {
	Optional<BoardEntity> origin = repository.findById(id) ;
	BoardEntity	entity= origin.get() ;
		return new BoardDTO(entity) ;
	}
	
	
	
	
	
	
	// 추가
	public List<BoardDTO> craete(BoardDTO dto) {
		repository.save(BoardDTO.toEntity(dto)) ;
		return retrieve() ;
	}
	// 수정
	public BoardDTO modify(BoardDTO dto){
		Optional<BoardEntity> origin=repository.findById(dto.getId());
		origin.ifPresent(modifyEntity -> {
		modifyEntity.setTitle(dto.getTitle());
		modifyEntity.setAuthor(dto.getAuthor());
		modifyEntity.setContent(dto.getContent());
			repository.save(modifyEntity) ;

		});
		
		return retrieveOne(dto.getId()) ;
	}

	//삭제 
	public List<BoardDTO> delete(BoardDTO dto) {	
		repository.delete(BoardDTO.toEntity(dto)) ;
		return retrieve() ;
		
	}

}
