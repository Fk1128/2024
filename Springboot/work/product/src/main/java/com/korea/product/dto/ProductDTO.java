package com.korea.product.dto;

import java.time.LocalDateTime;

import com.korea.product.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

	
	private int productId;
	private String productName ;
	private int productStock ;
	private int productPrice;
	private LocalDateTime registerDate;
	private LocalDateTime updateDate ;
	
	//Entity -> DTO 변환 
	public ProductDTO(ProductEntity entity) {
		this.productId = entity.getProductId();
		this.productName = entity.getProductName() ;
		this.productStock = entity.getProductStock() ;
		this.productPrice = entity.getProductPrice() ;
		this.registerDate = entity.getRegisterDate();
		this.updateDate = entity.getUpdateDate() ;
	}
	//DTO -> Entity 변환
	
	public static ProductEntity toEntity(ProductDTO dto) {
		return ProductEntity.builder()
				.productId(dto.getProductId())
                .productName(dto.getProductName())
                .productStock(dto.getProductStock())
                .productPrice(dto.getProductPrice())
                .registerDate(dto.getRegisterDate())
                .updateDate(dto.getUpdateDate())
                .build();
	}

	

	
	
}
