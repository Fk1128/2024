package practice.test1.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Table(name = "Ingredients")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredients {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // 식별자값 자동생성
	private Integer id; // 재료 의 아이디값
	private String userId ; // 이 객체를 생성한 유저의 아이디
	private String name; // 재료 이름
	private Integer amount; // 재료의 양
	private LocalDateTime registerDate; // 등록날짜 .
	private LocalDateTime exp; // 유통기한 .

	@PrePersist
	public void calculateExpirationDate() {
		this.registerDate = LocalDateTime.now();
		if (this.exp == null)
			this.exp = this.registerDate.plusWeeks(2);

	} // regiterDate의 값이 설정될때 메서드를 호출해 exp의 값을 생성후 db에 저장
}
