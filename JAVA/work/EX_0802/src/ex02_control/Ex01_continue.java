package ex02_control;

public class Ex01_continue {
	public static void main(String[] args) {
		// continue
		// 반복문 안에서 continue 를 만나게 되면 이후의 코드는 수행되지않고 ,
		// 반복문의 처음으로 돌아가 반복문을 진행하게된다
		// for 문의 경우 증감식으로 이동하며
		// while 과 do - while 의 경우 조건식으로 이동한다

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("홀수의 합 : " + sum);
	}

}
