package ex01_lamda;

import java.util.function.Predicate;

public class Ex06_lamda {
	public static void main(String[] args) {
		//람다식의 결합
		//논리를 가지고 연산을 하는 논리연산자와 비슷하다.
		Predicate<Integer> a = i -> i < 100;
		Predicate<Integer> b = i -> i < 200;
		Predicate<Integer> c = i -> i % 2 == 0;
		Predicate<Integer> notA = a.negate();
		
		System.out.println("a : " + a.test(101)); //false
		System.out.println("notA : " + notA.test(101)); //true
		
		Predicate<Integer> all = notA.and(b.or(c));
		System.out.println("all : " + all.test(150));
		
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println("결과 : " + result);
		
		
		
		
		
		
	}
}







