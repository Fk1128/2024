package ex01_super;

// 클래스에 들어갈 수 있는 것 
// 필드 메서드 생성자
public class Car {

	// 필드
	int gasGauge;

	// 생성자 접근제한자 클래스명(매개변수(파라미터)){
	public Car(int gasGauge) { // int gasGauge - 지역변수 (중괄호안에서만사용)
		this.gasGauge = gasGauge; // gasGauge값을 필드에 전달해야한다 자기자신을 참조하는 this를 사용한다
//
	}

	// 메서드
	// 접근제한자 반환형 메서드명 (매개변수) {
	
	//}
	void showCurrentGauge() { // 접근제한자를 생략 default 생략되어있음 . 
		System.out.println("가스량 :" + gasGauge );
	}

	

	
}
 