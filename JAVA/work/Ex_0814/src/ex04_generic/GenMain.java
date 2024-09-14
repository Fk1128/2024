package ex04_generic;

public class GenMain {
	public static void main(String[] args) {

		Gen gen = new Gen();

		Integer[] iArr = { 1, 2, 3, 4, 5 };
		Double[] dArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };

		
		//제네릭 메서드 사용시 장점
		// 객체를 매 타입에 맞게 만들어줄 필요가 없음 .
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}
}
