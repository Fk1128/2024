package ex05_final;

public class BookMain {
	public static void main(String[] args) {
		Comic comic = new Comic("포켓몬" , "미상", true);
		comic.info_title();
		//final로 선언된 메서드를 오버라이드는 불가능하지만
		//사용하는건 가능하다
		comic.info_author();
		comic.info_color();

		
			
		
		
		
	}
}
