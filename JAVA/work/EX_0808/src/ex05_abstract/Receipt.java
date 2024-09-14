package ex05_abstract;

public  abstract class Receipt { // 추상메서드가 없어도 추상클래스로 정의할 수 있다
	//필드
	String chef;
	
	public Receipt(String chef) {
	this.chef = chef;
	}
	
	void  info() {
		System.out.println("이 레시피는 " + chef + " 님의 레시피 입니다 .");
	}
	
	
	
	
}
