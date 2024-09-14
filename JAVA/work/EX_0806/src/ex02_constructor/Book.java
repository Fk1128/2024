package ex02_constructor;

public class Book {
	// 여러개의 생성자 선언해보기
	String title = "제목없음";
	int series = 1;
	int page = 100;

	// 기본생성자
	public Book() {

	}

	// 제목만 넘겨받는 생성자
	public Book(String t) {
		title = t;
	}

	public Book(String t, int p) {
		title = t;
		page = p;
	}

	// 시리즈와 제목을 넘겨받는 생성자
	public Book(int s, String t) { // 개수가 같더라도 자료형의 순서가 다르면 된다 .
		series = s;
		title = t;
	}

	
	public void bookinfo() {	
		System.out.println("제목: " + title);
		System.out.println("시리즈 : " + series);
		System.out.println("페이지 : " + page);
		System.out.println("----------------------");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
