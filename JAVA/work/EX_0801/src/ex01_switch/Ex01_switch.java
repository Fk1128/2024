package ex01_switch;

public class Ex01_switch {
	public static void main(String[] args) {
		
		
		int num =7 ;
		
		//1. 비교값과 조건값의 타입은 일치해야 한다 .
		//2. 중복되는 조건값을 가질 수 없다 .
		
		
		switch(num) { 
		case 1 :
			System.out.println("num 은 1 입니다 .");
			break;
		case 7 :
			System.out.println("num 은 7 입니다 .");
			break;
		default :
			System.out.println("num은 1도 7도 아닙니다 .");
		}
		
		/* if vs switch
		 * 둘다 조건에 따라 명령을 실행하는 문법
		 * if 문은 범위에따라 조건을 비교하는데 효과적이고 
		 * switch 문은 값을 1대 1 로 비교하는데 효과적이다 .
		 */
		
		
		
		
		
		
		
	}
}