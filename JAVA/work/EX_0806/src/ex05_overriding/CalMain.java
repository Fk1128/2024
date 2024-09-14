package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		Calculator c = new Calculator() ;
		CalMinus cm = new CalMinus();
		CalPlus cp = new CalPlus();
		
		System.out.println("CalPlus:" + cp.getResult(15,15));
		System.out.println("CalMinus" + cm.getResult(30,15));
		
	}

}
