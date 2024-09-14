package ex02_constructor;

public class Phone {
	String brand;
	int series;
	String color = "검은색";
	// 자바에서는 생성자를 여러개 선언하는것을 허용하고있다 .
	// 외부에서 제공할 수 있는 데이터만큼만 매개변수로 전달하여 객체를 생성할 수 있다 .
	// 생성자를 다양한 형태로 선언하는 것을 ' 생성자 오버로딩 ' 이라고 한다 .

	// 오버로딩 규칙
	// 1.생성자나 메서드의 이름은 그대로 사용해야 한다 .
	// 2.매개변수의 개수가 달라야 한다 .
	// 3. 매개변수의 개수가 같아도 자료형이 달라야한다 .

	public Phone(String brand, int series) {
		this.brand = brand;
		this.series = series;

	}

	// this()
	// 현재 클래스에 선언되어있는 생성자를 가리킬수 있는 키워드
	// 같은 클래스 안에 있는 생성자 중 매개변수의 개수, 자료형, 순서에 맞는 다른 생성자를
	// 호출하는 메서드로 생성자 내부에서만 사용할 수 있다 .
	public Phone(String brand, int series, String color) {
		// this.brand = brand;
		// this.series = series;
		this(brand, series);// 첫줄에서만 사용할 수 있다 .
		this.color = color;
	}

	

	// 휴대전화의 정보를 출력하는 phoneinfo() 메서드 만들기
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);

	}

}
