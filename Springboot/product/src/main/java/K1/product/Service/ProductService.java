package K1.product.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import K1.product.Model.ProductEntity;
import K1.product.dto.ProductDTO;
import K1.product.persistence.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	// 조회하기 
	public List<ProductDTO> findAll() {
		//db에 접근해서 조회
		List<ProductEntity> entities =productRepository.findAll();
		
		return entities.stream().map(ProductDTO ::new).collect(Collectors.toList()) ;
			
	}
	
	//추가하기 
	public List<ProductDTO> create(ProductDTO dto) {
		
	ProductEntity entity =	ProductDTO.toEntity(dto) ;
	productRepository.save(entity) ;
	return findAll() ;
	
		
		
		
	}
	
	
	
}
