package ex03_array;

import java.util.Arrays;

public class Ex07_arrays {
	public static void main(String[] args) {
		// 배열의 복사
		// 배열은 한 번 생성하면 그 길이를 변경할 수 없다 .
		// 더 많은 데이터를 저장하거나 기존의 배열과 같은 배열을 
		// 새로만드려면 배열을 복사해야 한다 .
		// 배열을 복사하는 방법에는 얕은 복사와 깊은 복사 두가지가 있다 .
		// 얕은복사 (Shallow Copy) : 복사된 배열이나 원본 배열이
		// 변경될 때 서로 간의 값이 함께 변경된다 .
		// 깊은복사(Deep Copy) : 복사된 배열이나 원본 배열이 서로 변경될 때 서로 간의 값은 바뀌지않는다 .
		
		int[] arr123 = new int [3] ;
		int[] arr01 = {1,2,3,4};
		
		//배열의 얕은복사
		int[] arr02 = arr01;
		
		//배열 arr02의 값 변경
		arr02[1]= 10 ;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		//둘다 바뀐다-> 같은 주소값을 사용하기 때문이다 .

		//깊은복사
		// 배열의 깊은복사는 반복문을 이용해 새로운 배열에 값을 
		// 직접넣어주거나 Arrays 클래스 또는 System클래스가 가진기능을 이용한다 .
		
		int[] cards = {1,6,4,5,3,2};
		int[] newCards = new int[cards.length] ;
		
		//Arrays 클래스를 이용한 깊은 복사
		int[] newCards2 = Arrays.copyOf(cards,cards.length);
		
		//반복문을 이용한 깊은 복사
		for(int i =0; i<cards.length; i ++ ) {
			newCards[i] = cards[i];
			
		}
		
		
	//System클래스를 이용한 깊은 복사 
		int[]newCards3 =new int[cards.length];
		System.arraycopy(cards, 0, newCards3, 0, cards.length);
		
		newCards[1] = 100 ;
		
		System.out.println("cards  배열 : "+ Arrays.toString(cards));
		System.out.println("newcards 배열 : "+ Arrays.toString(newCards));
		System.out.println("newcards2 배열 : "+ Arrays.toString(newCards2));
		System.out.println("newcards3 배열 : "+ Arrays.toString(newCards3));

		
		
		
		
		
	}
}
