package practice.test1.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.test1.model.Ingredients;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DTO {

	private Integer id; // 재료의 아이디값
	private String name; // 재료 이름
	private Integer amount; // 재료의 양
	private LocalDateTime registerDate; // 등록날짜 .
	private LocalDateTime exp; // 유효기간 .
	
	
	
	
	
	// entity -> dto 변환
	public DTO(Ingredients entity) {
		this.id = entity.getId();
		this.name= entity.getName();
		this.amount=entity.getAmount() ;
		this.registerDate=entity.getRegisterDate();
		this.exp = entity.getExp() ;
	}
	
	public static Ingredients toEntity(DTO dto) {
	return 	Ingredients.builder()
		.id(dto.getId())
		.name(dto.getName())
		.amount(dto.getAmount())
		.registerDate(dto.getRegisterDate())
		.exp(dto.getExp())
		.build();
	}
	
	
	
	
	
}
