package ex03_String;

import java.util.Scanner; // 문제풀이 

public class Ex03_String {
	public static void main(String[] args) {
		// 회문 판별하기
		// 회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는문장.
		// 기러기,토마토,스위스,별똥별
		// 키보드에서 문장을 입력받고 해당문장이 회문이면
		// xxx는 회문입니다. 아니면 xxx는 회문이 아닙니다 라고 출력하기 .

		Scanner sc = new Scanner(System.in);
//		System.out.print("문장을 입력하시오 : ");
//		String str1 = sc.next();
//
//		for (int i = 0; i < str1.length(); i++) {
//			if (str1.charAt(i) == str1.charAt(str1.length() - 1 - i)) {
//				System.out.println(str1 + "는 회문입니다 .");
//			} else {
//				System.out.println(str1 + "는 회문이 아닙니다 .");
//				break;
//			}
//		} // 내가쓴답 

		
		
		System.out.print("문장을 입력하시오 : ");
		String ori = sc.next();//토마토
		
		String rev = ""; // 뒤집어서 담기위한 문자열 변수   
		for(int i = ori.length(); i>0; i--) {
			rev += ori.charAt(i-1);
			
		}
		if(ori.equals(rev)) {
			System.out.println(ori+ " 는 회문입니다 .");
		}else {
			System.out.println(ori+ " 는 회문이 아닙니다 ");
		}
		
		
		
		
		
	}
}
