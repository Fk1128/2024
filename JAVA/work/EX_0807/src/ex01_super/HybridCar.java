package ex01_super;

public class HybridCar extends Car {
	
	int electricGauge ;
	
	public HybridCar(int gasGauge, int electricGauge) { // 생성자를 생성 
		super(gasGauge);
		this.electricGauge = electricGauge ;
	}

	void showCurrentGauge() {
		super.showCurrentGauge(); // 부모
		System.out.println("전기량 :"+ electricGauge);
		
	}
	
}
