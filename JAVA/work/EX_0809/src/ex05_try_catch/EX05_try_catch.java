package ex05_try_catch;

import java.util.Scanner;

public class EX05_try_catch {
	public static void main(String[] args) {
		// Finally
		// Finally 블록은 예외 발생 유무와 상관없이 실행되는 구문이며 생략할 수 있다 .
		// 예외를 처리할 때 , 예외와 상관없이 반드시 처리해야 하는 구문들을
		// 작성할 때 사용한다 .
		// 보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용한다 .
		Scanner sc = new Scanner(System.in) ;
		
		try {
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if (score >= 60) {
				System.out.println("합격입니다 .");
			}else {
				System.out.println("불합격입니다 .");
			}
			
		}catch (Exception e) {
			System.out.println("키보드 입력이 올바르지 않습니다 .");
		} finally {
			// 보통 finally 에는 연결을 끊고 닫아야 하는것들을 정의
			// 예외 발생여부와 상관없이 종료해야 하기 때문에 
			sc.close();
			System.out.println("프로그램 종료");
		}
	}
}
