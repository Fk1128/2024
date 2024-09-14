package ex02_modifier;

public class Public_A {
	public int a;

	private Public_A(int a) {
		this.a = a;
		
	}

	private void printA() {
		System.out.println("Public_A 클래스의 printA() 메서드 호출");
	}
	
	//같은 패키지이기 떄문에 객체 생성이 가능
	Default_C  dc = new Default_C();
	
	void methodA() {
		dc.variableC=20; // public 으로 선언된 필드이기 때문에 사용 가능
	}

}
