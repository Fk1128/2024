package ex02_class;

public class Student {
	
	static String schoolName = "코리아 고등학교"; // 정적 멤버의 선언 
	//인스턴스 멤버
	String studentName ;
	
	static void goToSchool() {// 정적메서드
		System.out.println( "학교에 갑니다 "); 
	}
	//인스턴스 메서드
	void hello() {
		System.out.println("안녕하세요 , 제 이름은 " +studentName+" 입니다.");
	}
	
	
	
}
