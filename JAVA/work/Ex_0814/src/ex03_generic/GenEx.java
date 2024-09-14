package ex03_generic;

public class GenEx<T> { 		 // 타입 매개변수의 전파 
	//<T> 부분에서 실행부에 타입을 받아와 내부에서 T타입으로 지정한 멤버들에게 전파하여
	//타입이 구체적으로 설정된다 . 이를 구체화라고 한다 .
	
	// 필드의 타입을 미리 결정하지 않는다
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;

	}

}
