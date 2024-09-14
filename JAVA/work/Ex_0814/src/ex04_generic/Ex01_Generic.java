package ex04_generic;
//숫자만 받아 계산하는 계산기 클래스 모듈
class Calculator<T extends Number>{
	void add(T a, T b) {};
	void min(T a, T b) {};
	void mul(T a, T b) {};
	void div(T a, T b) {};
	
	
	
}






public class Ex01_Generic {
	public static void main(String[] args) {
		//제네릭에 아무 타입이나 모두 할당이 가능해서 문제가 될 수 있었지만
		//extends 를 사용하고 타입을 어느정도 제한시킬 수 있다 .
		
		Calculator<Number> cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double> cal3 = new Calculator<>();
//		Calculator<Object> cal2 = new Calculator<>();
//		Calculator<String> cal3 = new Calculator<>();
//		Calculator<Ex01_Generic> cal4 = new Calculator<>();
	}

}
