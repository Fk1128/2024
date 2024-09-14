package ex01_try_catch;

import java.util.Scanner;

public class Ex01_try_Catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = 0;

		while (true) {
			try {
				System.out.print("숫자를 입력하세요(0~50)  : ");
				val = sc.nextInt();
				if (val == -1) {
					System.out.println("프로그램을 종료합니다");
					break;

				}
				if (val < -1 || val > 50) { // 프로그램의 규칙에 위배되어예외를 발생하는경우
					throw new Exception("숫자의 허용 범위가 아닙니다. "); // Exception 객체
				}
			} catch (Exception e) {

				System.out.println("에러 메세지 : " + e.getMessage());// 생성자에 넣었던 메세지 출력
			}

		}

	}
}
