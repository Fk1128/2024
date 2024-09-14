package ex05_final;

public class Book {

	String title;
	String author;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		
	}

	public final void info_title() {
		System.out.println("책의제목은 " + title + "입니다 .");
	}
	
	
	public void info_author() {
		System.out.println("책의 저자는" + author + "입니다 .");
	}
}
