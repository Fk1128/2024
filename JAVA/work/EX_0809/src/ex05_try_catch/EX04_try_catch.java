package ex05_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX04_try_catch {
	public static void main(String[] args) {
		//다중catch 사용하기
		// 프로그램을 구동할 때 하나의 예외만 발생한다면 어렵지 않다 .
		// 하지만 try구문 안에서 예외는 다양하게 발생할 수 있다 .
		// 만약 기존과 같은 방법으로 처리한다면 예외를 제외하고는
		// 제대로 처리할 수 없다 .
		// 이때 다중 catch문을 사용하여 예외별로 예외코드를 다르게 처리할 수 있다 .
		
		Scanner sc = new Scanner(System.in) ;
		try {
			int [] cards = {4,5,1,2,7,8};
			System.out.println(" 몇번째 카드를 뽑으시겠습니까 ? >> ");
			int cardIndex = sc.nextInt();// InputmismatchException (발생할 수 있는 예외)
			System.out.println("뽑은 카드 번호는 : " + cards[cardIndex]); // ArrayIndexOutofBoundsException (발생할 수 있는 예외)
		}catch (InputMismatchException e) {
			System.out.println("정수를 입력 해 주세요");
		}catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("해당 번호의 카드는 없습니다 .");
			// TODO: handle exception
		}
		System.out.println("프로그램 종료");
	
	
	
	}
}
