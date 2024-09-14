package ex01_getter_setter;

import java.util.Set;

public class Car {
	private int speed; // 속도
	private boolean stop; // 정지여부
	
	public void setSpeed(int s) {
		 if( s < 0 ) {
			 speed = 0 ;
			 return ; // 메서드를 종료
		 }else {
			 speed = s ;
		 }
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setStop(boolean s) {
		stop = s ;
		if(s==false) {
			speed = 0;
		}
		
	}
	public boolean getStop() {
		return stop ;
	}
}
