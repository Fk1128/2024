package ex04_generic;
interface Person{
	
	
}

class Student implements Person{
	
}

class Worker {
	
}
// Person 인터페이스를 구현한 클래스만 제네릭타입으로 들어올 수 있다 .
class School <T extends Person>{
	
}


public class Ex02_Generic {
	public static void main(String[] args) {
	//	School<worker>s = new School<>(); //Worker 클래스는 Person 인터페이스를 구현하지 않았기 때문에 
		//제네릭타입을 사용해서 객체를 만드는건 불가능하다.
		School<Student> s2 = new School<>();
	}
}
