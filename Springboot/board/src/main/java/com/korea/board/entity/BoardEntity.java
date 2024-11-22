package com.korea.board.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name="asdas")
public class BoardEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // 식별자
	private String title; // 제목
	private String author; //  저자 
	private String writingTime; // 작성일자 
	private String content; // 내용
}
