package K1.product.Service;

import java.util.List;
import java.util.Optional;
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

	// 유효성 검사
	public void validate(ProductDTO dto) {
		ProductEntity entity = ProductDTO.toEntity(dto);
		if (entity == null) {
			throw new RuntimeException("Entity can not be null");
		}
		if (entity.getId() == 0 ) {
			throw new RuntimeException("Entity id can not be null");
		}
	}

	// 전체조회
	public List<ProductDTO> findAll() {
		// db에 접근해서 조회
		List<ProductEntity> entities = productRepository.findAll();
		return entities.stream().map(ProductDTO::new).collect(Collectors.toList());

	}

	// 특정항목 조회 .

	public Optional<?>   findId(ProductDTO dto) {
		
		ProductEntity entity =ProductDTO.toEntity(dto) ;
		
		Optional<ProductEntity> optinal = productRepository.findById(entity.getId()) ;
		
		
		return optinal ;
		 
	}

	// 추가하기
	public List<ProductDTO> create(ProductDTO dto) {

		validate(dto) ;
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		productRepository.save(entity);
		return findAll();

	}

	// 삭제하기 .

	public List<ProductDTO> delete(ProductDTO dto) {
		
		validate(dto) ;
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		productRepository.delete(entity);

		return findAll();

	}

	// 수정하기 .

	//public List<ProductDTO> modify(ProductDTO dto) {

	}


