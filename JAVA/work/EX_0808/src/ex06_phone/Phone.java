package ex06_phone;

abstract public class Phone {

	abstract public void openingLogo(); // 추상메서드 

	public void poweron() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다 .");

	}



	public void poweroff() {
		System.out.println("핸드폰이 꺼집니다");
	}

}
