package ex02_constructor;

public class Student {
	
	String name ;
	int age ;
	int studentId;
	
	// this
	// 객체 자기 자신을 스스로 참조 
	// 객체가 자기 자신을 스스로 참조하는데 사용하는 변수
	// this를 필드에 붙여서 사용하면 , 중괄호 ({}) 안에서도 같은 이름의 매개변수와 필드를
	// 구분해서 사용할 수 있다 .
	public Student(String name, int age , int studentId ) { 
		// 전역변수와 지역변수의 이름이 같을 떄 우선권이 지역변수에 있다 .
		this.name = name ;
		this.age = age;
		this.studentId = studentId ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
