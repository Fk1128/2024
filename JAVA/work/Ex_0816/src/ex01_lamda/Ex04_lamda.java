package ex01_lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex04_lamda {
	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println("입력값 : " + t);
		c1.accept("홍길동");
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println("입력값1 : " + x + " 입력값2 : " + y);
		c2.accept("제임스", 100);
		
		Supplier<Object> s1 = () -> new Object();
		System.out.println("주소 : " + s1.get());
		
		//Integer.parseInt("정수형태의 문자열") -> 문자열에서 정수로 변환
		//String.valueOf(정수) -> 정수에서 문자열로 변환
		Function<Integer, String> f1 = x -> String.valueOf(x);
		System.out.println("문자열 : " + (f1.apply(100)+1));
		
		BiFunction<String, String, Boolean> f2 = (x,y) -> x.equals(y);
		if(f2.apply("토마토","토마토"))System.out.println("두 문자열의 값은 같습니다.");
		
		Predicate<Integer> p1 = t -> t>=60;
		int score = 65;
		boolean pass = p1.test(65);
		if(pass) {
			System.out.println("홍길동님의 점수는 : " + score+"점이고 합격입니다.");
		}else {
			System.out.println("홍길동님의 점수는 : " + score+"점이고 불합격입니다.");
		}
	}
}









