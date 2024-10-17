package com.korea.product.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.OrderDTO;
import com.korea.product.dto.ProductDTO;
import com.korea.product.entity.OrderEntity;
import com.korea.product.entity.ProductEntity;
import com.korea.product.repository.OrderRepository;
import com.korea.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;
	
	private final ProductRepository productRepository; 
	
	//전체조회하기 
	public List<OrderDTO> getAllOrderTotalPrices(){
		 List<Object[]> list = orderRepository.findAllOrderTotalPrices();
		 return OrderDTO.toListOrderDTO(list) ;
		 
	}
	
	//주문하기
	
	
	
	public List<ProductDTO> save(OrderDTO dto) {
		//productId와 ProductCount
		//상품 존재여부를 확인
		// SELECT * FROM PRODUCT
		Optional<ProductEntity> option = productRepository.findById(dto.getProductId());
		ProductEntity productEntity; 
		if(option.isPresent()) {
			productEntity = option.get();
		} else {
			//IllegalArgumentException : 잘못된 또는 부적절한 인수가 메서드에 전달됐을 떄 
			// 발생하는 예외
			throw new IllegalArgumentException("상품을 찾을수 없습니다  ") ;
		}
		//재고확인
		if(productEntity.getProductStock() < dto.getProductCount()) {
			throw new RuntimeException("재고가 부족합니다 . 현재재고 : " + productEntity.getProductStock());
		}
	
		
		//주문하기 
		
		OrderEntity order = OrderEntity.builder()
									.product(productEntity)
									.productCount(dto.getProductCount())
									.build();
		//DB에 주문저장 
		orderRepository.save(order) ;
		
		//재고감소 
		productEntity.setProductStock(productEntity.getProductStock()-dto.getProductCount());
		
		//db에 수정된 재고로 업데이트 
		productRepository.save(productEntity);
		
		
		List<ProductDTO > dtos = productRepository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());
		
		
		//반환하는 내용
		// 감소된 재고를 반영한 전체내용 
		return dtos;
		
//	public List<OrderDTO> save(OrderDTO dto) {
//		
//		//상품 존재여부 확인 
//		ProductEntity product = productRepository.findById(dto.getProductId()).get();
//		
//		//재고확인
//		if(product.getProductStock() <dto.getProductCount()) {
//			throw new RuntimeException("재고가 부족합니다 . 현재재고: " + product.getProductStock());
//		}
//		
//		//재고감소 
//		product.setProductStock(product.getProductStock() - dto.getProductCount());
//		productRepository.save(product);
//		
//		// 주문 생성
//		OrderEntity order = OrderEntity.builder()
//							.product(product)
//							.productCount(dto.getProductCount())
//							.build() ;
//		
//		//DB 에 주문내역 저장하기 
//		orderRepository.save(order) ;
//		
//		List<ProductEntity> entities = productRepository.findAll();
//		List<OrderDTO> dtos = entities.stream().map(entity -> new OrderDTO()).collect(Collectors.toList());
//		
//		return dtos ;
//	
	
	
	
	
	
	}
	
	
	
	
	
}
