package ex03_method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {4,5,1,2,9,10};
		mt.maxFinder(arr);

	//계산기 만들기
	// Main 에서 숫자 두개랑 , 산술연살자를 전달받아서 계산을 해서 반환하는
	// getResult() 메서드 작성하기

	
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print(" 첫번쨰 숫자입력 : ");
		int num1 = sc.nextInt();
		
		
		
		System.out.print(" 두번째 숫자입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print(" 연산기호 입력 : ");
		String op = sc.next();
		
		int result = mt.getResult(num1,num2,op);
		System.out.println("결과 : " + result);
		
		
		
		
		
		
		
	}
}
