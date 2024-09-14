package ex02_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//System.out.print("나이를 입력해주세요 : ");
		//int age = sc.nextInt();
		//System.out.printf("제 나이는 %d세 입니다.\n",age);
		// 제이름은 xxx입니다
		// 제 나이는 xx살 입니다.
		// 제 주소는 xxx 입니다 .
		// 제 키는 xx.x cm 입니다 .
		
		
		System.out.print("이름을 입력하세요 : ");
		String s = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("주소를 입력하세요 : ");
		String ad = sc.next();
		
		System.out.print("키를 입력하세요 : ");
		double l = sc.nextDouble() ;
			
		System.out.printf("제 이름은 %s 입니다.\n" , s);
		System.out.printf("제 나이는 %d 입니다.\n", a);
		System.out.printf("제 주소는 %s 입니다.\n", ad);
		System.out.printf("제 키는 %.1fcm 입니다 \n" , l);
		
		
		
		
		
	}

}
