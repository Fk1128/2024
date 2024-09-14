package ex06_phone;

public class PhoneMain {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone();
		pp.poweron();
		pp.poweroff();
		
		System.out.println();
		ThreeStarPhone tp = new ThreeStarPhone();
		
		tp.poweron();
		tp.poweroff();

		
	}
}
