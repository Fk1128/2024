package ex01_try_catch;

public class InputErrorException extends Exception { 
	
	public InputErrorException(String message) {
		super(message); // super() -> 부모의 생성자 Exception() 
	}
	

}
