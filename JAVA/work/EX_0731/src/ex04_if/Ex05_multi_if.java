package ex04_if;

import java.util.Scanner;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// if문의 중첩
		// 제어문은 자유롭게 중첩해서 사용할 수 있다 .
		
		// 10보다 작으면서 홀수인 수
		
		Scanner scan = new Scanner(System.in);
		
		int num = 5;
		if(num <= 10 ) {
			if(num %2 == 1) {
				System.out.println(num+"은 홀수입니다.");
			}
		}
		int num1 = 8;
		if(num1 <= 10 && num1 %2 == 1 ) {
			if(num1 %2 == 1) {
				System.out.println(num1+"은 홀수입니다.");
			}
	}
	}
}
