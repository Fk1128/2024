package ex02_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		// ArrayList와 LinkedList의 성능 비교

		// ArrayList 선언

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// 삽입,삭제,수정,조회 등

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		// 삽입,삭제,수정,조회 등

		// 자료구조에 데이터 삽입시 걸리는 시간을 비교
		long startTime = System.nanoTime();
		// ArrayList와 LinkedList에 1000000데이터 추가하기
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);

		}
		long endTime = System.nanoTime();

		long duration = endTime - startTime;

		System.out.println("ArrayList 추가시간 :" + duration);

		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();

		duration = endTime - startTime;

		System.out.println("linkedList 추가시간 :" + duration);

		//////////////////////////////////////////////////////////////

		System.out.println("--------------------------------------------------------------------");
		// 특정 위치에 삽입하는 시간을 비교

		// ArrayList에 삽입 // ArrayList는 내부적으로는 배열을이용해 구현되어 인덱스에 값을저장한다
		startTime = System.nanoTime();
		arrayList.add(99, 100);
		endTime = System.nanoTime();
		duration = endTime - startTime;

		System.out.println("arrayList 삽입시간 : " + duration);

		// LinkedList에 삽입 // ArrayList는 배열을이용해 데이터를 저장하는 반면 ,
		// LinkedList는 node라는 객체를 생성하여 인접 데이터를 링크해서 체인처럼 관리한다

		startTime = System.nanoTime();
		linkedList.add(99, 100); // List 컬렉션의 구현 클래스이므로 사용할 수 있는 메서드가 대부분 동일하다
		endTime = System.nanoTime();
		duration = endTime - startTime;

		System.out.println("linkedList 삽입시간 : " + duration);
		System.out.println("--------------------------------------------------------------------");

		//////////////////////////////////////////////////////////////////////////////////
		// 요소의 삭제시간 비교

		// ArrayList
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("arrayList 삭제시간 : " + duration);

		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;

		System.out.println("linkedList 삭제시간 : " + duration);

		//ArrayList 는 삽입, 삭제가 잘 일어나지 않는 경우에 사용
		//LinkedList 는 삽입, 삭제가 빈번하게 일어나는 경우에 사용 
		
	}

}
