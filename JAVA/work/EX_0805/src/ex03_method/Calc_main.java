package ex03_method;

public class Calc_main {
	public static void main(String[] args) {

		
		Calc calc = new Calc();
		
		calc.sum(10,7);
		
		int[]nums = {100,200};
		// 필요에 따라 결과값을 변수에 저장하여 활용할 수 있다 .
		calc.sum(nums);
		int n = calc.sum(nums);
		System.out.println("총합 : " + n);
	}
}












