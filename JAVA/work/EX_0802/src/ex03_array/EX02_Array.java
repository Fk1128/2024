package ex03_array;

public class EX02_Array {
	public static void main(String[] args) {
		int[] arr = new int[4];
//	arr[0] = 100 ;
//	arr[1] = 200 ;
//	arr[2] = 300 ;
//	arr[3] = 400 ;

		for (int i = 0; i < 4; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}

//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
//	System.out.println(arr[2]);
//	System.out.println(arr[3]);
		// 배열의 길이
		// 배열을 생성할 때 대괄호[]안에 배열의 길이를 작성했다 .
		// 배열을 사용하면서 종종 배열의 길이가 필요할 때가 있다.
		// 배열은 내부적으로 length라는 변수를 지니는데 ,
		// 해당 변수는 길이 값을 가지고 있다 .
		// 배열의 길이를 알고싶을 떄는 '배열명.length' 를 하면 된다 .
		// 이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다 .

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}
}
