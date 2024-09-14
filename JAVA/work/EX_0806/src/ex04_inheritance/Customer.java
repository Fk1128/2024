package ex04_inheritance;

public class Customer extends Person {
	int memberId; // Customer 의 필드 
	// 만약 부모 클래스의 생성자가 호출될 떄 매개변수로 값을 받아 부모클래스의
	// 필드를 초기화 하도록 구현이 되어있다면 자식클래스에서 생략할 수 없다 .
	public Customer(String name, int age,int memberId) {
		super(name,age); // 부모생성자의 호출		
		this.memberId = memberId; 
		
	}
	
	public void enter() {
		System.out.printf("회원번호 : %d (%s,%d세)님 입장하셨습니다.\n", memberId,name,age);
	}
	
}
