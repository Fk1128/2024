package ex04_extends;

public class Car_Main {
	public static void main(String[] args) {
		School_Bus sb = new School_Bus(10) ;
		sb.takePerson();
		sb.ride();
		
	}
	// 자바 상속의 특징
	// 1. 내가 원하는 만큼 상속이 가능하다 .
	// 2. 다중상속은 불가능하다 .
	// 3. 한개의 부모클래스는 여러개의 자식클래스를 갖는것은 가능하다 .
	// 4. 모든 클래스는 Object 클래스를 상속받는다 .
	
	//Object 는 자바의 최상위 클래스이다
	
}
