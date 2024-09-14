package ex01_casting;

public class Ex03_Casting {
	public static void main(String[] args) {
		
		//double -> float형 강제 형변환(float형 범위 내 값)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.printf("[double -> float] d1의 값 : %f, f1의값 : %f\n",d1 ,f1 );
		System.out.println("[double -> float] d1의 값 : " + d1 + ", f1의 값 : " + f1);
				//범위 값 내에서 강제 형 변환을 실행하면 데이터의 손실 없이 변환된다.
						
	
		//double -> float (float 의 최소보다 작은값 )
		double d2 = 1.0e-50	; 
		float f2 = (float)d2 ;
		System.out.printf("d2의 값 : %e , f2의 값 :%f\n" ,d2,f2 );
		System.out.println("d2의 값 : " + d2 +  "\t\t f2의 값 : " + f2 );
		
		//double -> float (float 의 최대값보다 큰 경우 )
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.println("d3의 값 : " + d3 +  "\t\t f3의 값 : " + f3 );
		//float 형이 가질 수 있는 최대값보다 큰 경우 Infinity 가 나온다.
		
		// double 과 float 의 정밀도 차이 
		double d4 = 9.123456789;
		float f4 = (float)d4 ;
		System.out.println("d4의 값 : " + d4 +  "\t\t f4의 값 : " + f4 );
		// float 범위 내의 값은 맞지만, 소수점 아래 값에서는 정밀도에서 차이가 난다 .
		



	
		
		
	}

}
