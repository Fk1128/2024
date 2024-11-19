package practice.test1.DTO;

import org.springframework.security.crypto.password.PasswordEncoder;

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
	

}
