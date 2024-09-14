package ex03_variable;

public class Ex_PrintData {

	public static void main(String[] args) {
		//정수형 데이터 : 소수점이 없는 숫자 1, 24 , 100 ,-50 ,-189  ...
		//실수형 데이터 : 소수점이 있는 숫자 1.23 -2.123 3.14 ...
		//문자형 데이터 : 홑따옴표로 감싼 ※한글자 'a','f','e','y' ...
		//문자열 데이터 : 쌍따옴표로 감싼 글자 "안녕하세요" "반갑습니다" ...
		
	System.out.println(100);
	System.out.println(100 + 50);
	
	//문자열이 포함된  연산자 더하기는 "연결의 의미를 가지고 있다." (연결연산자)
	//"안녕하세요50"0
	System.out.println("안녕하세요" + 50 );
	
	System.out.println(5+10+":"+5+10);	// 15:510 // 5+10 이후값에 : 5 10이 연결되어 출력된다 
	// 진행 방향  -> 
	
	System.out.println("2 + 2 = " + 2 + 2); //  2 + 2 = 22
	System.out.println("2 + 2 = " + (2 + 2));// 2 + 2 = 4 
	
	System.out.println("A");
	
	
	
	
	
	}	

}
