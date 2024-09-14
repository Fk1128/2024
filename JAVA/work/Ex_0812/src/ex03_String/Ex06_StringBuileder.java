package ex03_String;

public class Ex06_StringBuileder {
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Hello");	
		
		System.out.println(str);
	
			//기존 문자열 뒤에 삽입
			
			str.append(" World"); // append ()
			System.out.println(str);
			
			//문자열 삭제 delete()
			
			str.delete(0, 6);
			System.out.println(str); // World 출력 "Hello " 까지 0~6까지 삭제  
			
			//원하는 위치에 문자열 삽입 insert()
			str.insert(0, "Hello");
			System.out.println(str);
			str.insert(5 , " ");
			System.out.println(str);
			
			//문자를 반대로 출력 reverse() ;
			str.reverse();
			System.out.println(str);
			
			
	}
}

