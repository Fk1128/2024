package ex05_try_catch;

public class Ex01_try_catch {
	public static void main(String[] args) {
		
		int result  = 0 ;
		try {
			result = 10/0 ;
			System.out.println("나누기 결과 : " + result); // 예외 발생시 코드실행을하지않고 catch 로 바로 넘어간다
			 
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 할 수 없습니다 .");
		}
		System.out.println("프로그램 종료");
	}
}
