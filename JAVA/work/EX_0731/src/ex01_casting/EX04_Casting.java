package ex01_casting;

public class EX04_Casting {
	public static void main(String[] args) {
		
		// 실수 -> 정수
		
		// float -> int 강제형변환
		// float 과 int 는 크기는 같지만 타입이 다르기 때문에 강제로 형변환을 해야한다 .
		
		
		// float -> int 강제 형변환
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("[float -> int] f1의 값 : " + f1+", i1의 값 : " + i1);
				
		// double -> int 강제 형변환
		double d1 = 12345.67 ; 
		int i2 = (int)d1;
		System.out.println("[double -> int] d1의 값 : " + d1+", i2의 값 : " + i2);	
			
		// 실수에서 정수로 형변환을 해야할때 주의해야 할 점 
		// 소수점 아래 숫자가 없어지기 때문에 값이 바뀌는것에 대해 
		// 주의해야 한다 . !
		
		byte b1 = 100 ;
		byte b2 = 110; 
		// byte b3 = b1 + b2 ;
		/*byte의 표현 범위가 127까지 밖에 되지 않다보니, 
		 * byte끼리의 연산은 127을 넘어가버릴 가능성이 높다.
		 * 이런 상황을 대비하여 java개발자들은 byte끼리의 연산이 수행될 때, 
		 * int형 변수로 값을 받도록 만든다. */
		byte b3 = (byte)(b1+b2); 
		System.out.println(b3) ;
	
	
	}
}


