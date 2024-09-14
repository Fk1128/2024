package ex01_do_while;

public class Ex01_do_while {
	public static void main(String[] args) {
		//do - while문
		//while 문과 같이 조건을 만족할 동안 계속 반복한다 .
		//다만, while 문과 다른점은 무조건 루프를 한 번은 실행한 후 조건을 검사한다 .
		// 즉 , 조건식의 결과와는 상관없이 무조건 한 번은 실행한다 .
		
		int i = 11;
		do {
			System.out.println(i);
			
		}while(i<10);
		//---------------------------------------------
		int sum = 0;
		int n =1; 
		
		do {
			sum+= n;
			n++;
		}while(n<= 10) ;
		System.out.println("합 : " + sum) ;
		
		//상황에 따라 반복문 사용하기 
		// 반복횟수가 지정되는 경우 -> 횟수를 만족할 때 까지 반복
		// ex) 물통에 물을 10번 부어라 -> for문 
		// 특정조건이 부여되는경우  -> 조건이 만족할 때 까지 반복 
		// ex) 물통에 물이 가득찰 때까지 부어라 -> while문
		// 특정 조건과 옵션이 부여되는 경우 -> 한번 실행 한 후 반복여부 판단 
		// ex) 물통에 물을 따라보고 새지않으면 끝까지 채워라  -> do - while문
		
		// 조
		
		
		
	}
}
