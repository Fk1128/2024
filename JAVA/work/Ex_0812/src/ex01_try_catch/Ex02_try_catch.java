package ex01_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		// 나이를 입력받고
		// 20살 이상이면 " 성인입니다"
		// 14살 이상이면 " 청소년입니다 . "
		// 7살 이상이면 "어린이 입니다 "
		// 그 이외에는 " 아동입니다 "
		// 단 , 0이하의 수가 입력되면 InputErrorexception을 발생 시키고
		// 입력이 잘못되었습니다 .
		Scanner sc = new Scanner(System.in);
		int age;
		try {
			System.out.println(" 당신의 나이를 입력하세요 >> ");
			age = sc.nextInt(); // 예외 발생가능성이 있음 .

			if (age <= 0) {
				throw new InputErrorException("입력이 잘못되었습니다");
			}

			if (age >= 20) {
				System.out.println("성인입니다");
			} else if (age >= 14) {
				System.out.println("청소년입니다");
			} else if (age >= 7) {
				System.out.println("어린이입니다");
			} else {
				System.out.println("아동입니다");
			}

		} catch (InputErrorException e) {
			System.out.println(e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("정수가 아닌것을 입력하셨습니다 .");
		}

	}
}
