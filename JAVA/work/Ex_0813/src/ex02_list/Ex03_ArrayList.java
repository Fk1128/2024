package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class Ex03_ArrayList {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list.add(i * 2);

		}
		System.out.println(list);
		// 3번째 인덱스 내용 삭제
		list.remove(3);
		System.out.println(list);
		//객체를 통한 삭제
		list.remove(Integer.valueOf(10));  //remove(Object o)  Object타입의 Integer을 사용
		System.out.println(list);
		//전체삭제
		//list.clear(); //  - > 반환하는게 없음 
		//list.removeAll(list);  - 삭제하고 논리형을 반환 true, false
		//System.out.println(list);
		
		if(!list.isEmpty()) { // 비워있지 않으면 
			list.removeAll(list);{
				System.out.println("장바구니가 비워졌습니다 ! "); 
				// 출력문이 나왔다는건 list.removeAll(list); 의 값이 true가 반환되었다는뜻이다.
			}
		}
		
		
		
	}
		
}