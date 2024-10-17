package com.korea.product.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO ) 
	// @GeneratedValue 어노테이션을 사용하면 식별자 값을 자동 생성 시켜줄 수 있다.
	private int productId ; // 상품id
	private String productName ; //상품 이름
	private int productPrice ; // 상품 가격
	private int productStock ; // 상품 재고 
	 
	@CreationTimestamp //Insert 쿼리가 발생할 때 현재 시간 값을 적용시켜준다
	private LocalDateTime registerDate ;   // 등록날짜 
	@UpdateTimestamp //Update 쿼리가 발생했을 때 현재 시간 값을 적용시켜준다.
	private LocalDateTime  updateDate  =  LocalDateTime.now(); // 수정날짜 
	//LocalDateTime : java에서 제공하는 클래스 시간값을 저장할 수 있는 클래스
	//LocalDateTime.now(): 현재 시간을 저장 


}
