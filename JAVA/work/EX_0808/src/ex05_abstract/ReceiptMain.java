package ex05_abstract;

public class ReceiptMain {
	public static void main(String[] args) {
		
		
 	// Receipt r = new Receipt() ; // 추상클래스의 객체를 직접 생성하는건 안된다 
		
		PastaRecipt pr = new PastaRecipt("최연석");
		pr.info(); // 부모클래스에 있는 메서드 , 자식객체를 통해 추상클래스의 메서드를 호출할 수 있다 .
		pr.makeSource(); // 
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info();
		sr.grillStake();
		
		
		
	}

}
