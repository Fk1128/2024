package ex01_super;

public class CarMain { // main 은 최대한 간결하게 실행문만 두는것이 좋다 .
	public static void main(String[] args) {
		
		HybridWaterCar hwc = new HybridWaterCar(15,30,25) ;
		hwc.showCurrentGauge();
	}

}
