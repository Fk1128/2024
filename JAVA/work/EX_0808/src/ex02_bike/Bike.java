package ex02_bike;

public class Bike {

	String riderName;
	int wheel = 2; 
	
	// riderName 필드를 생성자를 통해 초기화 하기 
	public Bike(String riderName) {
		this.riderName = riderName;
	}
	public void info() {
		System.out.println(riderName + " 의 자전거는 " + wheel + "발 자전거입니다 .");
	}
	
	public void ride() {
		System.out.println("씽씽~");
	}
	
}
