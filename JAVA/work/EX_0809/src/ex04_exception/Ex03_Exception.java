package ex04_exception;

public class Ex03_Exception {
	public static void main(String[] args) {
		// ArrayIndexOutofBoundsException
		// 배열에서 index범위를 초과해 사용할 때 발생한다 .
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[6]);
	}

}
