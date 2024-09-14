package ex05_Iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_Iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Iterator<Integer> iter = list.iterator();
		
		int count = 0 ;
		// 향상된 for문을 기반으로 한다
		// 처음부터 끝날때 까지 작동한다 .
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.printf("list 데이터 [%d] : %d\n",count++,val);
			
			
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i <=10; i++) {
			set.add(i);
		}
		
		Iterator<Integer> iter2 = set.iterator();
		count=0 ;
		while(iter2.hasNext()) {
			int val = iter2.next();
			System.out.printf("set데이터 [%d] : %d\n",count++,val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
