package practice.test1.model;

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

@Entity
@Table(name ="user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
	

	@Id
	@GeneratedValue(generator ="system-uuid")
	@GenericGenerator(name = "system-uuid" , strategy="uuid")
	private String id ;
	
	@Column(nullable =false)
	private String userName;
	private String password;
	private String role ;
	private String authProvider; // OAuth 사용시 유저정보 제공자 : github 
	
	
	
	
	
	
	
	
	
	
}
