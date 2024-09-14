package ex03_Operate;

public class Ex02_Operater {
	public static void main(String[] args) {
		// 증감 연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// ++ / --
		
		//선행증감
		int a = 10 ;
		System.out.println("a : " + ++a ); // 11 = a=a+1 a+1을 더하고 출력 
		
		
		
		//후행증감
		int b = 10 ;
		System.out.println("b : " + b++ ); // 10 // b = b+1 10을 출력을 하고 1을 더함  
		System.out.println("b : " + b); //11 
		
		char alphabetA = 'A';
		System.out.println(alphabetA++); //코드가 실행된후 65+1이 됨
		System.out.println(alphabetA); // 66값인 B가 출력이 된다.
		
		byte value = 127 ;
		value++ ;
		System.out.println(value);
		//정수타입 연산에서 오버플로우가 발생하면 최소값으로 돌아간다 .
		
		byte value1 = -128 ;
		value1-- ;
		System.out.println(value1);
		// 정수타입 연산에서 언더플로우가 발생하면 최대값으로 돌아간다 . 
		
		int x= 5; 
		int y= x++;
		//x의값 : 6
		//y의값 : 5
		System.out.println(x);
		System.out.println(y);
		
		x = 10;
		y = 20;
		
		int z = (++x) + (y--);
		System.out.println(z);
		//z의값 : 31 
		int g = x+y ;
		System.out.println(g);
		//g의값 : 30 
		//---------------------------------------------
		//논리부정연산자
		//boolean 값을 가지는 피연산자 앞에 ! 를 붙여서 값을 반대로 바꾸는 역할을 한다 .
		//true 를 false 로 , false 를 true 로 바꿔준다 .
		
		boolean isHuman = false ;
		System.out.println( !isHuman );
		isHuman = !isHuman ;
		System.out.println( isHuman);
		
		//주의할 점은 , 논리 부정 연산자를 사용하더라도 , 사용 한 곳에서만 적용이 될뿐
		//원래 변수에 들어있는 값은 바뀌지 않는다 .
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
