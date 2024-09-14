package ex04_exception;

public class Ex01_Exception {
	public static void main(String[] args) { // 메모리에 올라가지않았다 : 생성자가 호출이되지 않았다.
		// NullPointerException
		
		// 배열 변수만 만들고 생성하지 않음 .
		String[] strArray = null ;
		//생성하지 않은 배열을 호출하였다
		System.out.println("strArray[0] : " + strArray[0]);
	}
}
