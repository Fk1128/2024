package ex03_access;

import ex02_modifier.Parent;

public class Child extends Parent{

	
	void accessTest() {
		//protected 가 붙은 메서드도 아래와 같은 방법으로 접근이 가능하다 .
		super.accessProtected();
		
		Parent p1 = new Parent();
		//p1.accessProtected(); 자식클래스더라도 , 객체로 접근하는것은 불가능하다 .
	}
}
