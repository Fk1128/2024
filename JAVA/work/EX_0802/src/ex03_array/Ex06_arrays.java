package ex03_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ex06_arrays {
	public static void main(String[] args) {

		// Arrays 클래스
		// 배열의 복사, 항목정렬, 항목검색 등 배열을 다루기 위한 다양한 메서드를 제공한다.
		// arrays 클래스를 사용하면 배열의 기능을 더욱 쉽게 사용할 수 있다 .

		// 배열의 출력
		// toString()은 반복문의 도움 없이 배열을 출력할 수 있도록 도와준다 .
		// 배열에 정의된 값을 문자열 형태로 변환하여 출력해준다 .

		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 };
		System.out.println(Arrays.toString(arr)); // Arrays 는 import는 해야함

		//배열의 정렬
		//sort() : 배열을 오름차순으로 정렬해주는 메서드 
		//정렬전
		System.out.println("정렬전 : " + Arrays.toString(arr));
		Arrays.sort(arr);// 배열을 오름차순으로 정렬 
		System.out.println("정렬후 : " + Arrays.toString(arr));

		// 내림차순 정렬
		// 기본자료형의 배열로는 내림차순으로 정렬이 불가능하다 .
		// 기본 자료형의 클래스타입이 필요하다 .
		// int -> Integer
		
		
		Integer[] arr2 = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 };
		
		Arrays.sort(arr2,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Math.random(); // import 도 안하고 객체생성도안함 .
//		
//		
//		Scanner sc = new Scanner(System.in); // import도하고 객세생성도 해야함
//		sc.nextInt();
//		sc.nextLine();
//		
//		
//		Random rnd = new Random();
//		
//		System.out.println(Arrays);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
