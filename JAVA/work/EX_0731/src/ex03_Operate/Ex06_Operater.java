package ex03_Operate;

public class Ex06_Operater {
	public static void main(String[] args) {
		// 비트연산자
		// 논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다 .
		// 일반적으로 시프트 연산자와 더불어 암호화, 복호화 작업에 사용된다 .
		
		// & 논리곱 두 항이 모두 1이면 1, 아니면 0 
		// | 논리합 두 항중 하나라도 1이면 1 아니면 0
		// ^ 배타적논리합 두항이 달라야 1 , 같으면 0 
		// ~ 부정 1을 0으로,  0을 1로  
		// 시험에잘나옴
		
		//int - 4byte 00000000 0000000 000000 00001010 ;
		int a = 10 ; // (이진수표기) 1010 
		int b = 7; // (이진수표기) 0111
		
		int c = a & b;  
		System.out.println( c ); // 2
		
		c= a | b ; 
		System.out.println( c ); // 15
		
		c = a ^ b ;
		System.out.println( c ); // 13
		
		// ~ (not 연산) 
		// 2진수로는 음수를 표현할수 없다 .
		// 비트의 맨 앞자리는 수의표현이 아닌 부호의 표현으로 쓰기로 약속을 했다 .
		// 0이면 양수, 1이면 음수 
		
		int x = 7 ; //0111
		//-(x+1)  
		System.out.println(~x);
		
		
		
		
	}
}
