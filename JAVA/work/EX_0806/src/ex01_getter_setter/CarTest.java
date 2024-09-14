package ex01_getter_setter;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		//잘못된 속도변경
		
		
		car.setSpeed (-50);
		
		System.out.println("현재속도 : "  + car.getSpeed());
		
		// 올바른 속도변경
		car.setSpeed(0);
		
		System.out.println("현재속도 : " + car.getSpeed());
		
		//멈춤
		if(!car.getStop()) { // !써서 강제로 true만들기
			car.setStop(true);
		}
	    System.out.println("현재 속도 : "+ car.getSpeed());
		
		
		
		
	}
}
