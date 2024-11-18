package practice.test1.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.test1.model.User;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	
	private String token ;
	private String id ;
	private String userName;
	private String password ;
	
	
	public static  User toEntity(UserDTO dto) {
		return User.builder()
		.id(dto.getId())
		.password(dto.getPassword()) 
		.userName(dto.getUserName())
		.build();
	}
}
