package Test.TodoApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="todo")
public class TodoEntity {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id; // 식별자
	private String userId; // 객체생성유저
	private String title; //  타이틀
	private Boolean done ; // 체크박스의 
	
	
	
	
	
	
}
