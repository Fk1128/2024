package Test.TodoApp.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="userEntity")
public class UserEntity {


	@Id
	@GeneratedValue(generator ="system-uuid")
	@GenericGenerator(name = "system-uuid" , strategy="uuid")
	private String id ; // 고유ID
	
	@Column(nullable =false)
	private String userId; // 로그인시 사용할 ID 
	private String password; // 로그인시 사용할 PW
	private String role ;	//유저권한
	private String authProvider; // OAuth 사용시 유저정보 제공자 : github 
	
	
	
}
