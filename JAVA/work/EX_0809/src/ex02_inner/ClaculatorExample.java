package ex02_inner;

class Calculator {
	private int val1;
	private int val2;

	// 객체를 만들 때 1번밖에 쓸 수가 없다 .

	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	// 다시 다른값을 대입 하고싶다면 , setter 를 만들어주는것이 좋다
	// getter&setter

	public class Calc { // inner class 에서는 public 접근제한자를 사용할 수 있다 .
		public int add() {
			return val1 + val2;
		}
	}

}

public class ClaculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 11);
		// 인스턴스 클래스의 객체를 만든다 .
		Calculator.Calc c = cal.new Calc();
		System.out.println("합 : " + c.add());

	}
}
