package com.test.Todo.todoDTO;

import com.test.Todo.todoentity.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor // 매개변수가 없는 생성자 구현 
@Data // 멤버변수 getter /setter 메서드 구현 
@AllArgsConstructor // 모든 필드를 매개변수로 갖는 생성자 구현 
public class TodoDTO {
	private String id ;
	private String userId ;
	private String title ;
	private boolean done ;
	
	public TodoDTO(final TodoEntity entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}
	
	public static TodoEntity toEntity(TodoDTO dto) {
		return TodoEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.done(dto.isDone())
				.build();
	}
	
}
