package ex06_test;

class A {
	private int a;

	public A(int a) {
		this.a = a;

	}

	public void display() {
		System.out.println("a=" + a);
	}
}

class B extends A {
	public B(int a) {
		super(a);
		super.display();

	}
}

public class Example {
	public static void main(String[] args) {
		B obj = new B(10);
		//실행결과 : a= 10
	}
}
