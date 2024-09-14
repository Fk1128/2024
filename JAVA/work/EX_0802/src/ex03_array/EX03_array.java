package ex03_array;

public class EX03_array {

	public static void main(String[] args) {
		
		// 배열의 초기값
		// 배열은 생성과 동시에 데이터 자료형 별로 기본값이 주어진다 .
		// 배열을 선언했을 때 저장되는 초기값을 자료형별로 정리하면 다음과같다 .
		// 정수형 0 
		// 실수형 0.0
		// 문자형 ''
		// 객체형 null
		
		
		//5개의 공간을 가지는 배열 
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		// 5개의 값을 가지는 배열
		int[] varArray = {1,2,3,4,5} ;
		String[] svarArray = {"a","b","c","d","e"};
		//intArray의 첫번쨰 값 출력
		System.out.println("intArray[0] : " + intArray[0]);
		//intArray의 두번쨰 값 출력
		System.out.println("intArray[1] : " + intArray[1]);

		
		//strArray 의 첫번째 값 출력 
		System.out.println("strArray[0] : " + strArray[0]);
		//strArray 의 두번째 값 출력
		System.out.println("strArray[1] : " + strArray[1]);
		//참조자료형 (클래스)
		//String
		//Random
		//Math
		//Scanner
		
		
		// varArray의 첫번째 값 출력
		System.out.println("varArray[0] : " + varArray[0]);
		// varArray의 두번째 값 출력
		System.out.println("varArray[1] : " + varArray[1]);
		
		System.out.println(svarArray[3]);

	}
}
