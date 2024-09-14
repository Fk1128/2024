package ex03_method;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {

		PrintGraph pg = new PrintGraph();

		int[] arr = new int[100]; // 난수를 담을 배열

		int[] count = new int[10]; // 발생한 각 난수가 몇개씩 나왔는지 세는 배열

		Random rnd = new Random();
		// 0~9 사이의 난수를 num 배열에 저장 (100개)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(10);
		}

		// 100개의 난수를 각 숫자별로 몇개씩 나왔는지 count 배열에 저장

		for (int i : arr) {
			count[i]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "의개수 : " + pg.print('#', count[i]) + " " + count[i]);
		}
	}

}

//Graph 라는 이름의 클래스에 main() 메서드를 만들고
//0~9사이의 난수를 100개 저장하는 배열을 만들고 , 
//해당 배열이 가지고 있는 각 방의 난수를 판별하여
//그래프화 해보자
// 단 발생한 난수의 그래프화 작업은
//PrintGraph