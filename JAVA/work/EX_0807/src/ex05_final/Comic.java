package ex05_final;

public class Comic extends Book{
	boolean isColor;
	
	public Comic(String title, String author,boolean isColor) {
		super(title,author);
		this.isColor = isColor;
	}
	
	@Override
	public void info_author() {
		System.out.println("이 만화책의 저자는 " + author + "입니다.");
	}
		
	// info_title은 final 이 선언된 메서드이기 때문에 오버라이드가 안됨
	
	
	public void info_color() {
		if(isColor) {
			System.out.println("이만화책은 컬러입니다.");
		}
		else {
			System.out.println("이만화책은 흑백입니다.");
		}
	}
	
	
	
	
	
	
	

}
