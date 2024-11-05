package K1.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import K1.product.Model.ProductEntity;
import K1.product.Service.ProductService;
import K1.product.dto.ProductDTO;
import K1.product.dto.ResponseDTO;

@RequestMapping("product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<?> getInfo() {
		List<ProductDTO> dtos = productService.findAll();
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}

	// 특정항목조회 .
//	@GetMapping("/info")
//	public ResponseEntity<?> findInfo(ProductDTO dto) {
//
//		Optional<?> entity = productService.findId(dto); // id값을통해 넘겨받은 엔티티를 갖고있음 .
//
//		return ResponseEntity.ok().body(entity);
//	}

	@PostMapping()
	public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto) {

		List<ProductDTO> dtos = productService.create(dto);

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteProduct(@RequestBody ProductDTO dto) {

		List<ProductDTO> dtos = productService.delete(dto);

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}

}
