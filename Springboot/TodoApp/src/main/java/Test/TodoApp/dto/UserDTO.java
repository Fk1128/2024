package Test.TodoApp.dto;

import Test.TodoApp.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private String token;
	private String id;
	private String userId;
	private String password;

	public UserDTO(UserEntity entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
	}

}
