package ex03_Operate;

public class Ex03_Opereate {
	public static void main(String[] args) {
		// 이항연산자
		// 피연산자가 2개인 연산자
		// 일반적으로 연산자를 가운데 두고 피연산자가 왼쪽, 오른쪽에 위치한다 
	
		// 산술연산자
		// 4칙연산(+,-,*,)과 몫을구하는 (/),  나머지 값을 구하는 (%)연산자로 나뉜다.
		// 프로그래밍에서 곱셈은 * , 나눗셈은 /,% 를 사용한다 .
		
		int x = 100 ;
		int y = 200 ;
		int result = x+y ; 
		System.out.println(result);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		// 계산결과가 표현범위를 벗어나면 오버플로우가 발생하거나 
		// 쓰레기값이 입력된다 .
		result = 1000000* 100000 ;
		
		System.out.println( result );
		
		// 산술변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야
		// 연산이 가능하다. 
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이
		// 적은쪽으로 타입을 맞춰준다 .
		
		
		
	
	/*long 		+ 	int 	-> long		 	+ long	-> long 
	  float 	+ 	int 	-> float	 	+ float	-> float
	  double 	+ 	float 	-> double		+ double-> double*/

		float f1 = 3.14f;
		int i1 = 4;
		
		System.out.println(f1 + i1);
	
	
	
	
	
	
	
	
	}
}
