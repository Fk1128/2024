package ex04_farm;

class Parent{
	public void display() {
		System.out.println("부모클래스의 display() 메서드이다.");
	}
}


class Child extends Parent{
	//오버라이딩 된 메서드 
	@Override 
	public void display() {
			System.out.println("자식클래스의 display()메서드이다 .");
	}
	//오버로딩된 메서드
	public void display(String str) {
		System.out.println(str);
	}
	
}





public class InheritanceMethodTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		c.display();
		c.display("오버로딩된 display() 메서드이다");
		p.display();
		
				
				
	}
}
