package com.korea.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.korea.board.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity,Long> { 
	
	

}
