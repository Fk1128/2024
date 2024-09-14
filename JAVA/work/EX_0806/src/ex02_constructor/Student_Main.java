package ex02_constructor;

public class Student_Main {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 20, 20240001);
		
		System.out.println("이름 : " + s1.name + " "+ s1.age + " " + s1.studentId);
		
	}
}
