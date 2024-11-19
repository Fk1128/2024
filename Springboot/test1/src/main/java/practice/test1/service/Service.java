package practice.test1.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import practice.test1.DTO.DTO;
import practice.test1.model.Ingredients;
import practice.test1.persistence.IngredientRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private IngredientRepository repository;

	// 전체조회
	public List<DTO> retrieve() {
		List<Ingredients> entities = repository.findAll();
		List<DTO> dtos = entities.stream().map(DTO::new).collect(Collectors.toList());
		return dtos;
	}

	
	// 특정조회
	
	public List<DTO> retrieveItem(DTO dto) {
		List<Ingredients> entities = repository.findByIngredientsId(dto.getId()) ;
		List<DTO> dtos = entities.stream().map(DTO::new).collect(Collectors.toList()) ;
		return dtos ;
	}
	
	// 추가
	public List<DTO> create(DTO dto) {
		checkIdDuplication(dto);
		Ingredients entity = DTO.toEntity(dto);
		
		repository.save(entity);
		return retrieve();

	}

	// 추가할 항목의 id의 중복체크  .
	public void checkIdDuplication(DTO dto) {
		if (repository.existsById(dto.getId())) {
			throw new RuntimeException("ID " + dto.getId() + " already exists");
		}
	}
	
	//수정
	
	public List<DTO> modify(DTO dto){
			Optional<Ingredients> origin = repository.findById(dto.getId()) ;
			Ingredients entity =origin.get();
			entity.setName(dto.getName());
			entity.setAmount(dto.getAmount());
			repository.save(entity) ;
			return retrieveItem(dto) ;
	}
	
	//삭제 
	
	public List<DTO> delete(DTO dto){
		repository.delete(DTO.toEntity(dto));
		return retrieve() ;
	}
	
	
	
	
	
	
	
}
