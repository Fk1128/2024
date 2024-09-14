package ex04_generic;

public class Gen<T> {

	public <T> void printArr(T[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	
		System.out.println();
		
	}
	
	
}
