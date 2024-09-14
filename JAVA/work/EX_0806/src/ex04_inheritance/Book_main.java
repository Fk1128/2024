package ex04_inheritance;

public class Book_main {
	public static void main(String[] args) {
		//Comic클래스의 객체 생성 
		// 자식 클래스는 부모클래스의 필드와 메서드를 가져다 사용할 수 있다 .
		// 자식클래스라도 부모클래스의 필드가 private 으로 선언되면 사용할 수 없다 .
		
		Comic comicBook = new Comic();
		comicBook.title = "포켓몬";
		comicBook.price = 4500 ;
		comicBook.info();
		
		
	}

}
