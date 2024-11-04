package K1.product.Model;

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
@Data
@Entity 
@NoArgsConstructor
@AllArgsConstructor
@Table ( name ="product")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // 식별자값 자동생성 .
	private int id ; // 상품 id
	
	private String productName; // 상품이름 
	private int productStock ; // 재고 
	private int productPrice ; // 가격 
	
	@CreationTimestamp
	private LocalDateTime registerDate ; // 등록 날짜 
	
	@UpdateTimestamp
	private LocalDateTime updateDate = LocalDateTime.now(); //수정 날짜 
	
	

}
