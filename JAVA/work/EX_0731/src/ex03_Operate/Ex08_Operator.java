package ex03_Operate;

import java.util.Scanner;

public class Ex08_Operator {

	
	public static void main(String[] args) {
		
		//과수원에서 배 사과 오렌지를 하루에 각각 5 7 5 개씩 생산한다 .
		// 1 . 과수원에서 하루에 생산되는 과일의 총 개수를 구하기 
		// 2 . 시간당 총 생산량 구하기 
		
		//int a = 5 ;
		//int b = 7 ;
		//int c = 5 ;
		
		//double result1 = a+b+c ;
		//System.out.println("하루 생산량 " + result1);

		
		//double result2 = result1/24 ;
		//System.out.println("시간당 총 생산량 : " + result2);
		
		//System.out.printf("시간당 총 생산량 : %.1f" ,result2);
		
		
		// 상자 하나에는 농구공이 5개가 들어갈 수 잇다 .
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가 ? 
		
		
		//삼항연산자 
		//박스의 개수 : 공의 개수가 5로 나누어 떨어지면 몫만큼 필요 
		//공의 개수가 5로 나눠 떨어지지않으면 몫 + 1만큼 필요 
		
		Scanner scan = new Scanner(System.in) ;
		
		
		
		
		//System.out.print("농구공의 수:" );
		//int ball = scan.nextInt() ;
		//
		//int basket = ball/5 ;
		
		//int result = basket ==0  ? basket : basket+1  ;   
		
		//System.out.println("상자의 수는 ? "+ result );
		
		
		//int b = 23 ; 
		//int n = 5; 
		
		//int result3 = b % n == 0 ? b/n :  b/n + 1 ;
		//System.out.println(result3);
		
		//-----------------------------------------------------------
		// 국어 영어 수학에 대한 점수를 키보드를 이용해 정수로 입력받고 
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기 (합계 /3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격 아니면 불합격
		
		System.out.print("국어 점수를 입력하시오 :");
		int a = scan.nextInt();		
		System.out.print("수학 점수를 입력하시오 :");
		int b = scan.nextInt();		
		System.out.print("영어 점수를 입력하시오 :");
		int c = scan.nextInt();
		
		int result1 = a+b+c ; 
		double avg = result1/3.0 ;
		
		System.out.println("합계 : " + result1);
		System.out.printf("평균 : %.1f\n" , avg );
		
		String test = a>=40 && b>=40 && c>=40&& result1 >=60 ? "합격" : "불합격"  ;		
		System.out.println(test);
		
		
		
		
		
		

		
		
		
	}
}
