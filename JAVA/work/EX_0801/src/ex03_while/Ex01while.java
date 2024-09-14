package ex03_while;

import java.util.Scanner;

public class Ex01while {
	public static void main(String[] args) {

		int num = 1; // 초기식

		while (num <= 10) {
			System.out.println(num);
			num++; // 증감식
		}

		System.out.println("======================================================");

		Scanner sc = new Scanner(System.in);

//		int n = 0;
//
//		while (n != -1) {
//			System.out.print("정수입력 :");
//			n = sc.nextInt();
//			System.out.println("입력된 정수 : " + n);
//		}
//
//		while(true) {
//			System.out.print(1);
//			
//		}
		// for 문으로 만드는 무한루프
		// for(;;) {

		// }

		// 각 자리수의 합 구하기
		// 정수형 변수 n 이 있을때, 각 자리의 합을 더한 결과를 출력하세요
		// n의값이 12345라면, 1+2+3+4+5 의 결과인 15를 출력하세요

		System.out.printf("정수를 입력하시오");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}

		System.out.println("각 자리수의 합 : " + sum);

		System.out.println("==========================================");
		// 두개의 주사위를 던졌을 때 , 눈의 합이 6이되는 모든 경우의 수 출력하기
		// 결과
		// 1,5
		// 2,4
		// 3,3
		// 4,2
		// 5,1

		int x = 1;

		while (x <= 6) {
			int y = 1;
			while (y <= 6) {
				if (x + y == 6) {
					System.out.println(x + "," + y);
				}
				y++;
			}
			x++;

		}

	}
}