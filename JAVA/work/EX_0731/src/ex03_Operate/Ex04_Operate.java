package ex03_Operate;

public class Ex04_Operate {
	public static void main(String[] args) {
		// 대입연산자
		// 우변의 값을 좌변에 대입을 한다
		int n1 = 10 ;
		int n2 = 7 ;
	
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 형태
		// +=, -=, *=, /=, %=
		
		int x = 10 ;
		int y = 3 ;
		
		y+= x; // y = y + x ; // 13
		
		System.out.println(y);
		
		y *= x;  // y = y * x // 130
		
		System.out.println(y);
		
		
		y%= x; // y= y%x;	// 130%10 = 0
		System.out.println(y);
		
		//-------------------------------------------------------
		
		// 비교연산자
		
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자.
		// 비교연산 후 연산결과결과가 항상 논리형 true나 false로 반환된다.
		// (반환을 받는다는건 연산식 자체가 반환값 데이터로 바뀌게 된다)
		
		int a = 10 ;
		int b = 20 ;
		
		boolean result = a>b; 
		System.out.println(result);
		result = a<= b;
		System.out.println(result);
		result = a == b ; // 같은값인가 ? -> 아니오 -> false 
		System.out.println(result);
		result = a != b ; // 같지않은가 ? -> 예 -> true
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
