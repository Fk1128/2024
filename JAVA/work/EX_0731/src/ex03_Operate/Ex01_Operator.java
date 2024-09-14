package ex03_Operate;

public class Ex01_Operator {

	public static void main(String[] args) {
		//단항연산자
		//피연산자가 한개인 연산자를 말하며,
		//부호연산자(+,-) 증감연산자 (++,--) 논리부정 연산자 (!) 가있다 .
		
		int x = 100;
		int resultPlus = +x; //+부호 ( 더하기의 의미가 아님 )
		int resultMinus = -x; //-부호 ( 빼기의 의미가 아님 ) 
	
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		double d = 1.11; //기본값이 +이기 때문에 생략 가능하다.
		double result = -d;
		
		System.out.println(-d);
		System.out.println(result);
		
		d = -d ;
		System.out.println(d);
		
		
	}
}
