package ex01_calendar;

public class CalendarMain {
	public static void main(String[] args) {

		DeskCalendar dc = new DeskCalendar("보라",6) ;
		
		dc.info(); // 오바라이딩된 메서드가 호출됨 
		dc.onTheDesk(); // 자식클래스에만 있는 메서드
		dc.hanging(); // 부모클래스에만 있는 메서드
		System.out.println();
		
		Calendar c = new DeskCalendar("검정",12); // 자동형변환으로 자식클래스에 있는 메서드만 사용가능하지만 
		//예외적으로 자식클래스에 오버라이딩 된 메서드는 사용이 가능하다 
		c.info(); // 부모타입으로 변환해도 오버라이딩된 메서드가 호출된다 
		c.hanging(); // 부모클래스에 있는 메서드 
		//c.onTheDesk(); //자식클래스에 선언된 메서드는 사용 불가  
		((DeskCalendar)c).onTheDesk(); // 일회성 강제 형변환 
		c.hanging();
		
		// 부모타입으로 변환한 자식객체는 , 더이상 자식 클래스만의 멤버나 
		// 메서드를 호출할 수 없다 .
		
		
		
	}
}
