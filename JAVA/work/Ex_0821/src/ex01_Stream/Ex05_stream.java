package ex01_Stream;

import java.util.Arrays;

public class Ex05_stream {
public static void main(String[] args) {
	String[] list2 = {"김길동", "박자바", "제이슨", "심슨"};
	
	String[] list2_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
	System.out.println(Arrays.toString(list2));
	System.out.println(Arrays.toString(list2_1));
}
}
