package com.korea.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	//생성자 주입 
	// public ProductController(ProductService productService) {
	// this.productService = productService ;
	// }
	
	//조회하기
	@GetMapping
	public ResponseEntity<?> productList() {
		List<ProductDTO> dtos = productService.findAll();
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	//추가하기
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		List<ProductDTO> dtos = productService.create(dto) ;
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		
		return ResponseEntity.ok().body(response) ;		
		
		
	
	}

}
