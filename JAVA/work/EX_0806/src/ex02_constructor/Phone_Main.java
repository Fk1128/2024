package ex02_constructor;

public class Phone_Main {
public static void main(String[] args) {
	
	Phone p1 = new Phone("갤럭시",24,"흰색") ; // 인자를 세개 넣으면 배개변수 세개짜리 생성자가 실행됨 .
	Phone p2 = new Phone("아이폰",16) ; // 인자를 두개넣으면 매개변수 두개짜리 생성자가 실행됨
	
	
	
		p1.phoneInfo();
		p2.phoneInfo();
	

	}
	
}

