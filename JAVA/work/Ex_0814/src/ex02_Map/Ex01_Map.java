package ex02_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_Map {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<Integer,Character>(); //Key , Value 제네릭타입
			//map에 데이터 추가하기
		
		map.put(12,'A');
		map.put(23,'B');
		map.put(33,'C');
		map.put(451,'D');
		System.out.println(map);
		
		//map 에서 value 는 중복이 될 수 있다.
		
		map.put(5, 'A');
		System.out.println(map);
		
		//map 에서 key는 중복될 수 없다 
		map.put(12, 'F'); // 기존에 같은 이름을 가진 key가 잇다면 value 를 갱신한다 .
		System.out.println(map);
		
		
		//map에서 요소ㅓ의 삭제는 key 값을 통해서 한다 .
		
		System.out.println("삭제한값 " + map.remove(33)); // 삭제된값을 반환한다 .
		System.out.println(map);
		
		//map의 크기
		System.out.println(map.size());
		
		
		
		//map에서 특정 value 꺼내오기
		char res = map.get(23);
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
