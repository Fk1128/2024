package ex01_Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Ex02_Stream {
	public static void main(String[] args) {
		//Set컬렉션
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김자바");
		set.add("제이슨");
		
		Stream<String> stream = set.stream();
		stream.forEach(System.out::println);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> iStream = list.stream();
		iStream.forEach(System.out::println);
	}

}
