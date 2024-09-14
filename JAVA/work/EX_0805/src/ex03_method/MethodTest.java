package ex03_method;

import java.util.Arrays;

public class MethodTest {

	// 정수형 배열의 최대값을 찾아 출력하는 maxFinder 메서드 작성하기
	// 배열은 매개변수로 전달받는다 .
	void maxFinder(int[] arr) {
//		int max = arr[0];
//		for(int x = 0 ; i<arr.length ; i ++ )
//		for(int x: arr) {
//			if(x>max)
//				max=x;
//		}
//		System.out.println("최대값 : " + x );
		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println(arr[arr.length-1]);
	}
	
	public int getResult ( int x , int y , String op) {
		if(op.equals("+")) {
			return x+y ; 
		} else if ( op.equals("-")) {
			return x-y ;
		} else if ( op.equals("*")) {
			return x*y ;
		} else if ( op.equals("/")) {
			return x/y ; 
		} else if ( op.equals("%")) {
			return x%y;
		}	else { 
			System.out.println("연산기호를 잘못입력하셨습니다");
			return -1;
		}
		
		
	}
	
	
	// 
	
	
	
	
	
	
	
	
	
	
	
	
}
