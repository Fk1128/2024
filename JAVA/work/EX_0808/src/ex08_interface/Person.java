package ex08_interface;

public class Person {

	
	
	Phone p;// -> PineApple 폰 객체 , ThreePhone 객체 가 들어올 수 있음 .
	
	public Person(Phone p) {
		this.p=p;
		
	}
	
	public void buyNewPhone ( Phone p) {
		this.p=p;
		System.out.println("= = = = =");
		System.out.println("새 폰을 샀습니다 .");
	}
	
	public void turnOnPhone() {
		p.powerOn();
	}
	
	public void turnOffPhone() {
		p.powerOff();
	}
	
	public void watchUtube() {
		if(p.isOn()) {
			p.watchUtube();
		}else {
			System.out.println("폰이 꺼져있기 때문에 U튜브를 볼 수 없습니다 .");
		}
	}
	
	public void chargePhone() {
		p.charge();

	}
	
	
	
	
	
	
	
}
