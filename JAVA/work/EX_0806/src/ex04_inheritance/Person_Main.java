package ex04_inheritance;

public class Person_Main {
	public static void main(String[] args) {
		Customer c1 = new Customer("박자바" ,25,20240101);
		Customer c2 = new Customer("송코딩" ,30,20240202);
		
		
		c1.enter();
		c2.enter();
		
	}
}
