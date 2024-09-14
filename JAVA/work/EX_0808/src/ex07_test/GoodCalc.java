package ex07_test;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
		
	}

	@Override
	public int substract(int a, int b) {
		
		return a-b;
	}

	@Override
	public double average(int[]arr) {
		int sum = 0 ;
		for(int i = 0 ; i <arr.length; i++) {
			sum += arr[i];
		}
		double avg =(double)sum/arr.length;
		return avg ;
	}

}
