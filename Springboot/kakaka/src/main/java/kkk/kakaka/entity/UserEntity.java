package kkk.kakaka.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class UserEntity {

	@Id
	@GeneratedValue(generator = "system-uuid") // id 필드는 자동으로 생성된다. 여기서는 UUID 전략을 사용한다.
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	// Hibernate에서 제공하는 UUID를 생성하는 커스텀 전략을 사용한다. system-uuid라는 이름으로 UUID를 생성하는 방식이다.
	private String id;

	@Column(nullable = false) // username 컬럼은 null 값을 허용하지 않는다.
	private String userName; // 아이디로 사용할 유저네임. 이메일일 수도 있고, 그냥 문자열일 수도 있다.

	private String password;

	private String authProvider; // 이후 OAuth 에서 사용할 유저 제공자 : github

}
