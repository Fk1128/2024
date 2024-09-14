package ex03_polymorphism;

//컴퓨터실

public class ComputerRoom {

	//필드에 있는것이 기본자료형이 아닌 객체변수가 선언 ;
	//String str ; ==
//	Samsung com1; 
//	Samsung com2;
	
//	LZ com1 ;
//	LZ com2 ;	
	
	Computer com1 ; // 컴퓨터클래스타입의 객체를생성 : 자식클래스는 부모클래스의 필드나 메서드를 사용할수 있기때문에 
	Computer com2 ; // 상속관계에서 자식클래스 위치에있는 Samsung,LZ,Mac 클래스들이 
	Computer com3 ; // 모두 사용할 수 있는Computer 클래스타입으로 객체를 만든다
	
	
	public void allPowerOn() { 		// 각 자식클래스에서의 오버라이딩된 메서드사용, 
		com1.poweron(); 			
		com2.poweron();
		com3.poweron();
	}
	
	public void allPowerOff() {		
		com1.poweroff();
		com2.poweroff();
		com3.poweroff();
	}
	
}
