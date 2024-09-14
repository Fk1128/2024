package ex01_lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ex07_lamda {
	public static void main(String[] args) {
		//Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		System.out.println("정수 100 : " + f.apply("100"));
		
		//BiFunction<String, String, Boolean> f2 = (s1,s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f2 = String::equals;
		
		
	}
}






