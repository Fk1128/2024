package ex01_Stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 5);//[1,2,3,4]
		LongStream longStream2 = LongStream.rangeClosed(1,5);//[1,2,3,4,5]
		
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
						// boxed(); - int - Integer // int 는 제네릭에 담을 수 없기때문에
						// Integer 클래스로 바꿔주는역할을한다
		
		
		
		
		
		
		
		
	}
}
