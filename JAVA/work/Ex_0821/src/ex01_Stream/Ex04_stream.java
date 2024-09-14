package ex01_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_stream {
	public static void main(String[] args) {
		Integer[]nums = {1,44,33,21,36,68,88,4,5,6,1,1,1,2,2,2};
		//1. 스트림 객체 만들기
		Stream<Integer> intStream = Arrays.stream(nums);
	
		
		
		//2.중간연산 
		intStream.distinct().sorted().limit(5).forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println(Arrays.toString(nums));
				//데이터 소스를 변경하지는 않기때문에 nums 안에있는 데이터들의 변화는없다 .
		
	
		IntStream intstream2 = IntStream.rangeClosed(1,10) ;
		//skip(n) : 맨 처음 n개를 버리고 시작
		//limit(n) :
		intstream2.skip(3).limit(5).forEach(x -> System.out.print(x+" "));
		System.out.println();
		IntStream intStream3 = IntStream.of(1,2,2,3,3,4,5,5,6,7,8,9,10);
		// 중간연산을 통해서 결과를 2,4,6,8,10
		
		intStream3.distinct().filter(x -> x% 2 == 0).forEach(x->System.out.print(x+" "));
			System.out.println();
	
		Stream.of("ab","a","abc","abcd","abcdef","abcdefg").filter(x -> x.length()>=3).forEach(x -> System.out.print(x+" "));
	
	
	
	
	
	}
}
