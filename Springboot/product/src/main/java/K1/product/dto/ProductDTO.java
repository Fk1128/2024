package K1.product.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import K1.product.Model.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
	
	private int id ; // 상품번호
	private String productName ; // 상품명 
	private int productStock; // 상품재고 
	private int productPrice ; //상품가격 
	
	@CreationTimestamp
	private LocalDateTime registertDate ; // 등록날짜 
	@UpdateTimestamp
	private LocalDateTime updateDate ; // 수정날짜 
	
	// Entity -> DTO 변환
	public  ProductDTO (ProductEntity entity) {
		this.id= entity.getId() ;
		this.productName = entity.getProductName() ;
		this.productStock = entity.getProductStock() ;
		this.productPrice = entity.getProductPrice() ;
		this.registertDate = entity.getRegisterDate() ;
		this.updateDate = entity.getUpdateDate();
	}
	
	
	// DTO ->Entity 변환 
	public static ProductEntity toEntity(ProductDTO dto) { 
		
		return ProductEntity.builder()
				.id(dto.getId())
				.productName(dto.getProductName())
				.productStock(dto.getProductStock())
				.productPrice(dto.getProductStock())
				.registerDate(dto.getRegistertDate())
				.updateDate(dto.getUpdateDate())
				.build() ;
		
	}
	
	
	
	
}
