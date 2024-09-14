package ex08_interface;

public interface Phone {

	// 상수
	// 값을 한번 넣어놓으면 대입이 불가능하다 .
	// 상수명은 대문자로 작성한다
	public static final int MAX_BATTERY_CAPACITY = 100;

	// 추상메서드
	abstract void powerOn(); // 인터페이스는 추상메서드로와 상수로만 이루어져있기 때문에 abstract를 생략해도 된다 .

	void powerOff();

	boolean isOn();

	void watchUtube();

	void charge();
	// 인터페이스도 마찬가지로 추상 메서드가 비어있기 때문에 객체 직접 생성 불가능
	// 따라서 인터페이스도 자신이 가지고 있는 추상메서드를 구현해줄 클래스를 작성해야만 한다 .
	// 인터페이스를 구현해주는 클래스를 '구현클래스 ' 라고 한다 .

}

//// 3
//// 자식  super extends instanceof im