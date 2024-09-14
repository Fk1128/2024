package ex01_calendar;

public class Calendar {
	// 달력의 색깔
	// 개월 수를 필드로 갖는다
	String color;
	int month;

	// 필드는 생성자를 통해 초기화 한다 .

	public Calendar(String color, int month) {
		this.color = color;
		this.month = month;
	}

	
	//xx색 달력은 xx월까지 있습니다 라고 출력되는 info 함수 만들기
	//xx색 달력을 벽에 걸 수 있습니다 라고 출력되는 hanging 메서드 만들기

	public void info() {
		System.out.println(color + "색 달력은 " +month+"월까지 있습니다");
	}
	
	public void hanging() {
		System.out.println(color+"색 달력을 벽에 걸 수 있습니다 . ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
