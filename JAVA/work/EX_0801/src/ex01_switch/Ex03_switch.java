package ex01_switch;

public class Ex03_switch {

	public static void main(String[] args) {
		//break 가 없다면 어떻게될까
		
	
		int num= 1 ;
	
		switch(num) { 
		case 1 :
			System.out.println("num 은 1 입니다 .");
		case 7 :
			System.out.println("num 은 7 입니다 .");
		default :
			System.out.println("num은 1도 7도 아닙니다 .");
		}
		

	}
}
