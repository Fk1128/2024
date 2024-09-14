package ex01_switch;

import java.util.Scanner;

public class EX05_switch {
	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다 .
		//해당 숫자가 짝수인지 홀수인지 판별하여 출력하는  코드를 switch로 작성
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("10이하의 숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 1,3,5,7,9 -> System.out.println("홀수입니다" );
		case 2,4,6,8,10 -> System.out.println("짝수입니다");
		}
		
		System.out.print("10이하의 숫자를 입력하시오 : ");
		int num4 = scan.nextInt();
		
		switch(num4) {
		case 1 :		
		case 3 :		 
		case 5 :		
		case 7 :
		case 9 :
			System.out.println("홀수입니다" );
			break ;
		case 2 :
		case 4:			 
		case 6:			 
		case 8:			 
		case 10:
			System.out.println("짝수입니다" );

			break ; 	
		
		}	 
		System.out.print("10이하의 숫자를 입력하시오 : ");
		int num3 = scan.nextInt();
		
		switch(num3 % 2) {
		case 0 -> System.out.println("짝수") ;
		case 1 -> System.out.println("홀수") ; 
		}
		
		//키보드에서 달(month) 를 입력받아
		//해당 달이 몇일까지 있는지 switch 문을 이용해 작성해주세요
		//결과
		//x월은 x일까지 있습니다 .
		
		System.out.print("MONTH :");
		int month = scan.nextInt() ;
		
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.printf("%d월은 31일까지 있습니다 .\n" ,month );
		case 4,6,9,11 -> System.out.printf( "%d월은 30일까지 있습니다 .\n",month);
		case 2 -> System.out.printf("%d월은 28일까지 있습니다 .\n " , month);
		default -> System.out.println("잘못입력하셨습니다 .");
		}
		
		System.out.print("MONTH :");
		int month1 = scan.nextInt() ;
		
		switch(month1) {
		case 1,3,5,7,8,10,12 -> System.out.println(month1+"월은 31일까지 있습니다 ." );
		case 4,6,9,11 -> System.out.println(month1+"월은 30일까지 있습니다 .");
		case 2 -> System.out.println(month1+"월은 28일까지 있습니다 .");
		default -> System.out.println("잘못입력하셨습니다 .");
		}
		//----------------------------------------------------------------------------------
		
		// 게산기 프로그램 만들기
		// 두개의 정수를 입력받는다 .
		// 산술 연산자를 문자열에 담는다ex) "+"
		// switch 문을 이용하여 정수의 연산을 수행하는 코드 작성하기 
		
		
		System.out.print("정수를 입력하시오 :");
		int num1 = scan.nextInt() ;
		System.out.print("연산자를 입력하시오 : ");
		String P = scan.next();
		System.out.print("정수를 입력하시오 :");
		int num2 = scan.nextInt() ;
		
		switch(P) {
		case "+" : System.out.println(num1 + num2);
		break ;
		case "-" : System.out.println(num1 - num2);
		break ;
		case "*" : System.out.println(num1 * num2);
		break ;
		case "/" : System.out.println(num1 / num2);
		break ;
		}
		
		System.out.print("정수를 입력하시오 :");
		int num11 = scan.nextInt() ;
		System.out.print("정수를 입력하시오 :");
		int num12 = scan.nextInt() ;
		System.out.print("연산자를 입력하시오 : ");
		String op = scan.next();
		
		switch(op) {
		case "+" -> System.out.printf("%d + %d = %d\n",num11,num12,(num11+num12));
		case "-" -> System.out.printf("%d - %d = %d\n",num11,num12,(num11-num12));
		case "*" -> System.out.printf("%d * %d = %d\n",num11,num12,(num11*num12));
		case "/" -> System.out.printf("%d / %d = %d\n",num11,num12,(num11/num12));

		
		
		}
		
		
		
		
	}
}
