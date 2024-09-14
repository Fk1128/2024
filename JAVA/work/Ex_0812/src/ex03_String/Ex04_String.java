package ex03_String;


import java.util.Scanner;

public class Ex04_String {
	public static void main(String[] args) {
		// (-포함) 주민번호를 키보드에서 입력받는다 .
		// 예시 ) 141223-1234567
		// 당신은 1999년 11월 22일에 태어난 남자입니다 .
		// 형식을 잘못 입력했을 때는 "주민번호를 올바르게 입력하세요 " 라고 출력 .
//
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함)");
		String id = sc.next();

		if (id.length() < 14 || id.charAt(6) != '-') {
			System.out.println("주민번호를 올바르게 입력하세요 .");
		} else {
			String year = "";
			String result = "";
			year = id.substring(0, 2);

			if (Integer.parseInt(year) <= 14) {
				result = "당신은 20";
			} else {
				result = "당신은 19";
			}

			result += year + "년" + id.substring(2, 4) + "월" + id.substring(4, 6) + "일에 태어난";
			if (id.charAt(7) % 2 != 0) {
				result += "남자입니다.";
			} else {
				result += "여자입니다";
			}
			System.out.println(result);
		}
	}
}
