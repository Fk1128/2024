package ex08_interface;

public class PineapplePhone implements Phone {
	// 인터페이스를 구현하는 클래스에 모든 추상메서드를 구체화 해야 한다 .
	// 배터리 양
	int batteryCapcity = 40;
	boolean isOn = false;

	@Override
	public void powerOn() {
		if (batteryCapcity > 30) {
			System.out.println("@@@POWER ON !! ");
			isOn = true;
		} else {
			System.out.println("Low battery");
		}
	}

	@Override
	public void powerOff() {
		System.out.println("@@@POWER OFF !! @@@@");
		isOn = false;
	}

	@Override
	public boolean isOn() {
		if (isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if (batteryCapcity > 10) {
			System.out.println("---watching utube------");
			batteryCapcity -= 10;
			System.out.println("battery is ..." + batteryCapcity + "%");
		} else {
			System.out.println("Low Battery...");
			powerOff();
		}
	}

	@Override
	public void charge() {
		if (batteryCapcity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---charging-----");
			batteryCapcity += 5;
			System.out.println("Charged..." + batteryCapcity + "%");
		} else {
			System.out.println("You don't have to charge");
			System.err.println("It's enough ..." + batteryCapcity + "%");
		}
	}

}
