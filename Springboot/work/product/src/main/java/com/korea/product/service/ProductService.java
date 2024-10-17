package com.korea.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductDTO;
import com.korea.product.entity.ProductEntity;
import com.korea.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

//@RequireArgsConstructor
//final이나 @Nonnull이 붙어있는 필드를 매개변수로 갖는 생성자를 생성 
@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;

	// 조회하기
	public List<ProductDTO> findAll() {
		// DB에 접근해서 데이터를 조회
		// findALL() : select*from product ;
		List<ProductEntity> entities = productRepository.findAll();

		// 리스트 안에 들어있는 Entity들을 DTO 로 변경
		List<ProductDTO> dtos = entities.stream().map(ProductDTO::new).collect(Collectors.toList());

		return dtos;
	}

	// 추가하기
	public List<ProductDTO> create(ProductDTO dto) {
		// dto -> entity
		ProductEntity entity = ProductDTO.toEntity(dto);
		// 넘어온 데이터를 데이터베이스에 추가
		productRepository.save(entity);
		return findAll();
	}

}