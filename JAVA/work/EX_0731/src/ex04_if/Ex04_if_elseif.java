package ex04_if;

import java.util.Scanner;
public class Ex04_if_elseif {

	public static void main(String[] args) {
		
		int favorite = 7 ;
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다 ."); 
		} else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다 ."); 
		} // 이미 5보다 크다는 조건이 참이기때문에 첫번째 결과값이 출력된다.
		
		//--------------------------------------------
		//나이를 키보드에서 입력받는다.
		// 20살 이상이면 성인입니다 .
		// 14살 이상이면 청소년입니다
		// 7살 이상이면 어린이입니다.
		// 그 이외에는 유아입니다 .
		// 라고 출력하기
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("나이를 입력하세요 :") ;
		int age = scan.nextInt();
				//객체명. 메서드명(); -> 해당 클래스에 있는 메서드의 호출
		if(age >= 20 ) {
			System.out.println("성인입니다 .");
		}else if(age >=14){
			System.out.println("청소년 입니다 .");
		}else if(age >=7) { 
			System.out.println("어린이 입니다 .");
		}else {
			System.out.println("유아 입니다 .");
		}
		//----------------------------------------------------
		// 키보드에서 성적을 입력받는다 .
		// 100 ~90 점까지는  A 
		// 80 ~ 89 점까지는 B
		// 70 ~ 79 점까지는 C
		// 60 ~69 점까지는 D
		// 0 ~59 점까지는 F
		// 출력하기 " 점수는 x 점이고 성적은 x 입니다 .
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score >=90 && score <=100) {
			System.out.printf("점수는 %d점이고 성적은 A입니다 .\n",score );
		}else if (score >=80) { 
			System.out.printf("점수는 %d점이고 성적은 B입니다 .\n",score );
		}else if (score >=70) { 
			System.out.printf("점수는 %d점이고 성적은 C입니다 .\n",score );
		}else if (score >=60) { 
			System.out.printf("점수는 %d점이고 성적은 D입니다 .\n",score );
		}else {
			System.out.printf("점수는 %d점이고 성적은 F입니다 .\n",score) ;
		}
		
	
			
		System.out.print("점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		char grade = 'a';
		if(score1 <= 100 &&  score1 >= 90 ) {	
			grade = 'A' ;
		}else if (score1 >=80 ){
			grade = 'B';
		}else if (score1 >=70 ){
			grade = 'C';
		}else if (score1 >=60 ){
			grade = 'D';
		}else{
			grade = 'F';
		}	
		System.out.printf("점수는 %d점이고 성적은 %s 입니다",score1 , grade );
	
	
	}
	
}		
		
		
		
		