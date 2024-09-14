package ex03_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {

		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc3
		// abc abc2 abc3

		// 리스트의 요소의 개수가 4개이면 프로그램 종료

		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

//		for(int i=0 ; i<4 ;i++) {
//			System.out.print("아이디 생성 :" );
//			String id = sc.next();
//			list.add(id);
//			System.out.println(list);
//			if(list.size()==4) {
//				break;
//			}
//		}

//		while(true) {
//			System.out.print("아이디 생성 : ");
//			String id = sc.next();
//			list.add(id);
//			System.out.println(list);
//			if(list.size()==4) {
//			break;
//		}
//		
//		}
//		

		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc2
		// 중복된 아이디
		// 아이디 생성 : abc3
		// abc abc2 abc3 abc4

		// 리스트의 요소의 개수가 4개이면 프로그램 종료

//		for (int i = 0; i < 4; i++) {
//			System.out.print("아이디 생성 :");
//			String id = sc.next();
//			if (!id.equals(list)) {
//				list.add(id);
//				if (list.size() == 4) {
//					break;
//				}
//				System.out.println(list);
//			} else if (id.equals(list)) {
//				System.out.println("중복된 아이디");
//				continue outer;
//			}
//		}
		outer: while (true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();

			for (int i = 0; i < list.size(); i++) {
				if (id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			list.add(id);
			System.out.println(list);
		}

	}

}
