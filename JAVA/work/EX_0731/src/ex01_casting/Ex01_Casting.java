package ex01_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int num = 11 ;
		double num1Change = 3.14 ;
		
		num1Change = num ; // 정수를 실수형 변수에 대입 
		
		System.out.println(num);
		
		
		
		// 형 변환은 숫자를 담을 수 있는 기본자료형간에만 가능하다.
		// byte,short,int,long,float,double형 간에만 가능하며
		// 문자형인 char 역시 정수이기도 하므로 형 변환이 가능하다 .
		
		// 자동형변환(Promotion) 
		// 서로 다른 자료형간의 대입이나 연산을 할 때 형변환으로 자료형을 
		// 일치시켜야 하지만 다음과 같은 경우 자바의 컴파일러가 자동으로 형변환을 해준다
		
		// 작은 자료형에서 큰 자료형으로 변환할 때 
		// 정수형
		// byte -> short -> int -> long
		
		// 실수형 
		// float -> double 
		
		
		int i = 100 ;
		char c = 'a';
		i = c ; 
		double d = i ;
		System.out.println(i);
		System.out.println(d);
			
		
		
		
		
	}

}
