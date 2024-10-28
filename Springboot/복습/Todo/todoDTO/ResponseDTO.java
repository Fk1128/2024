package com.test1.Todo123.dto;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder // 빌더패턴을 간편하게 구현할 수 있게해준다 .
// 빌더클래스를 생성해 다른 클래스에서 builder() 메서드를 호출하여 빌더 인스턴스를 생성한 후 메서드를 사용할 수 있다 .
@NoArgsConstructor  // 매개변수가없는 생성자 구현
@AllArgsConstructor // 클래스의 모든 멤버를 매개변수로받는 생성자 구현.
@Data  // 멤버변수의 setter 와 getter 메서드 구현 
public class ResponseDTO<T> {

	
	private String error; 
	private List<T> data ;
}

