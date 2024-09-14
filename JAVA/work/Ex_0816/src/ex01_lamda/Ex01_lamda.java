package ex01_lamda;

interface Iminus{
	int minus(int x, int y);
}



public class Ex01_lamda {
	public static void main(String[] args) {
		//람다식을 반환값에 넣는다.
		Iminus im = makeFunction();//(x,y) -> x-y;
		int res = im.minus(3, 1);
		System.out.println(res);
		
	}
	
	//반환형은 반환값이랑 일치해야 한다.
	public static Iminus makeFunction() {
		return (x,y) -> x - y;
	}
}









