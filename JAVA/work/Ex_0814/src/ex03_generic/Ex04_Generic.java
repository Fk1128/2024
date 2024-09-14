package ex03_generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex04_Generic {
	public static void main(String[] args) {
		ArrayList<LinkedList<String>> list = new ArrayList<>();
		LinkedList<String> link1 = new LinkedList<>();
		
		link1.add("aa");
		link1.add("bb");
		
		LinkedList<String> link2 = new LinkedList<>();
		link2.add("11");
		link2.add("22");
		
		list.add(link1);
		list.add(link2);
		System.out.println(list);
				
		
	}
}
