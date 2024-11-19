package Test.TodoApp.dto;

import Test.TodoApp.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {

	
	private Integer id ; // 식별자
	private String title; //  타이틀
	private Boolean done ; // 체크박스
	
	
	
	public  TodoDTO(TodoEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle() ;
		this.done = entity.getDone() ;
		
	}
	
	public static TodoEntity toEntity(TodoDTO dto) {
		
		return TodoEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.done(dto.getDone())
				.build() ;
		
		
		
	}
	
	
}
