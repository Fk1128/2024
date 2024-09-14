package ex04_if;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		int result = 0 ; 
		if (3 > 2) {
			result = 3 ; 
			//int n = 10 ;
			
			
			
		}
		System.out.println(result);
		//System.out.println(n); // 중괄호 안에 만들어진 변수는 중괄호 밖에서 사용할수없다 .
	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이를 입력해주세요 : ");
	int age = sc.nextInt();
	if (age > 19) {
		System.out.println("성인입니다");
	}

	
	
	}

}
