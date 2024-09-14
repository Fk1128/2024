package ex03_generic;

public class Ex01_Generic {
	public static void main(String[] args) {
		//객체를 생성하면서 제네릭 변수에 타입이 결정된다 .
		
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("100");
		System.out.println(v1.getValue()); 
		
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(1200);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());

		GenEx<Double> v4 = new GenEx<Double>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	
		
	}
}
