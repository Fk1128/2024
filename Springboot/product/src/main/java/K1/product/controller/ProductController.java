package K1.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private ProductService productService ;
	
	
	@GetMapping
	public ResponseEntity<?> getInfo(){
		List<ProductDTO> dtos = productService.findAll() ;
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response) ;
	}
	
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto){
		
		List<ProductDTO> dtos = productService.create(dto) ;
		
		ResponseDTO<ProductDTO> response =	ResponseDTO.<ProductDTO>builder().data(dtos).build() ;
		return ResponseEntity.ok().body(response) ;
		
		
	}
	

}
