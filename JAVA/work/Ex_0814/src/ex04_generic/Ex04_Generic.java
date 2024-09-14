package ex04_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		//<? extends Object> -> Object부터 하위클래스가 올 수 있다.
		List<? extends Object> list = new ArrayList<String>();
		//<? super String> -> String 부터 상위 클래스가 들어올 수 있다 .
		List<? super String> list2 = new ArrayList<Object>();
		
		List<Integer> lists = new ArrayList<>(Arrays.asList(1,2,3));
		print(lists);
	}

	//매개변수로 Number와 그 하위 타입인(Integer,Double) 등만 받는다 .
	public static void print(List<? extends Number> list) {
		for (Object e : list) {
			System.out.println(e);
		}
	}
















}
