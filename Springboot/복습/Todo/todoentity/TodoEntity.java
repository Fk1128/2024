package com.test1.Todo123.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // JPA 에서 관리할 객체 선언 / 자동으로 테이블을 생성 . name 속성을 갖고있다 .
@Builder // 객체생성을 위한 디자인패턴
@AllArgsConstructor // 클래스의 모든 멤버를 매개변수로받는 생성자 구현.
@NoArgsConstructor // 매개변수가없는 생성자 구현
@Data // 멤버변수의 setter 와 getter 메서드 구현
@Table(name = "Todo") // 테이블 이름지정 , 스키마지정 , 유니크 제약조건 설정
public class TodoEntity {
	@Id // 객체의 Primary key를 의미. JPA는 id를 통해 객체를 구분
	@GeneratedValue(generator = "system-uuid")
	// JPA 에서 기본 키값을 자동으로 생성할 때 사용되는 어노테이션이다 .
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	// 사용자 정의ID 생성기를 정의할 때 사용된다 . 특정 규칙이나 로직에 따라 엔티티의 고유식별자를 생성 .
	private String id;


	private String userId;
	private String title;
	private boolean done;

}