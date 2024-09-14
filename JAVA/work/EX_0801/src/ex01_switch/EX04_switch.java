package ex01_switch;

public class EX04_switch { 
	public static void main(String[] args) {
		//java 12버전 이상의 switch문 
		/*조건에 복수의 값을 사용하는것이 가능해졌다 .
		화살표 표현식을 이용하는게 가능하다 .
		기존 switch 문과 달리 case 에 해당하는 명령만
		실행되고 , 그 이후 case 들은 실행되지 않는다 .*/
	
		String day = "MONDAY" ;
		
		switch(day ) { 
		case "MONDAY":
		case "TUESDAY":
		case "WENDSDAY":
		case "THURSDAY":
		case "FRIDAY":
			System.out.println("평일");
			break ; 
		case "SATURDAY":
		case "SUNDAY" :
			System.out.println("주말");
			break ;
			default : 
				System.out.println("잘못된 입력입니다 .");
		}
		
		//자바 12 이상에서의 switch 문 
		switch (day) {
		case "MONDAY" , "TUESDAY" ,"WENDSDAY" , "THURSDAY","FRIDAY" -> System.out.println("평일");
		case "SATURDAY" , "SUNDAY" -> System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다 ."); 
		} // break 사용을 하지않아도 case 에 해당하는 절만 실행되고 그 이후 case 들은 실행되지 않는다 .
		
		
	}

}
