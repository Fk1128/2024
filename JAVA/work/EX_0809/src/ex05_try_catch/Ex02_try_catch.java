package ex05_try_catch;

import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("정수를 입력하세요");
			//정수가 아닌 다른값을 입력하면
			//InputMismatchException 이 발생할 수 있다 
			int score =  sc.nextInt();
			if (score>=65) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격");
			}
		}catch(Exception e ) {
			System.out.println("키보드 입력이 잘못 되었습니다 .");
			
		}
	}
}
