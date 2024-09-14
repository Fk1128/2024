package ex04_farm;


class Animal2{}
class Pig2 extends Animal2{};


public class Instanceof {

	public static void main(String[] args) {
		Pig2 p1 = new Pig2();
		Pig2 p2 = new Pig2();
		
		
		Animal2 a = p1; 
		
		if(a instanceof Pig2) {
			System.out.println("객체변수 a 는 Pig 타입으로 생성된 객체이다");
		}
		if(a == p1){
			System.out.println("a와 p1 은 같은 객체를 참조하고 있다 .");
			
		}
		if( a!=p2) {
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않다 .");
		}
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
