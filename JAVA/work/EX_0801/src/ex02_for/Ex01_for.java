package ex02_for;

	import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
//	
//		for(int i = 0; i <3 ; i++) {
//			System.out.print(i);
//		}
//		
//		System.out.println("-------------------------------------");
// 		for(int i = 0; i < 10; i ++) {
//	 	System.out.printf( "%d ",i+1 );
// 		}
//	
// 		System.out.println();
//		
//		for( int i = 10 ; i > 0 ; i--) {
//			System.out.print(i+" " );
//		}
//		System.out.println();
//		for (int i = 1 ; i <= 20 ; i++)  
//			if(i % 2 == 1) {
//			System.out.print(i+" ");
//			}	
//		
//		System.out.println();
//		for(int i = 1 ; i< 20; i+=2) {
//			System.out.print(i+" ");	
//		}
//		
//		System.out.println();
//		
//		for(int i = 1 ; i< 10; i++) {
//			if(i % 3 == 0)
//			System.out.printf(i+ "");
//		}
//		
//		System.out.println();
//		
//		for(int i = 1; i <11; i++) {
//			if(i %3 == 0)	
//			System.out.printf(i+ "");
//		}
//		
//		System.out.println();
//		//1부터 10까지의 총합구하기 
//		int sum =0 ;
//		for(int i =1; i<11; i++) {
//			sum+= i; // sum = sum + i
//		}
//		System.out.println(sum);
//		
//		//정수형 변수 dan에 2~9사이의 값으로 초기화 하고 
//		//해당 dan 에 해당하는 구구단 출력하기
//		//ex 2 x 1 = 2
//		//Scanner scan = new Scanner(System.in) ;
//		
//		//System.out.print("");
//		//int dan = scan.nextInt();
//		int dan = 4;
//		
//		for(int i = 1 ; i <=9 ; i++ ) {
//			System.out.printf("%d x %d = %d \n", dan,i,dan*i);
//		}
//		
//		int dan1 = 4;
//		
//		for(int i = 1 ; i <=9 ; i++ ) {
//			System.out.println(dan1 + " x " + i + " = " + dan1*i );
//		}
//		
//		
//		Scanner scan = new Scanner(System.in) ;
//		
//		System.out.print("정수를 입력하시오 :");
//		int num = scan.nextInt();
//		int sum1 = 0 ;
//		for (int i =1 ; i <=num ; i++ ) {
//			sum1 += i;
//		}
//		System.out.println("총합 : " + sum1);
//		
//		//10개의 정수를 입력받아 그중에 짝수가 몇개인지 개수를 출력해주세요
//				
//		//개수를 세서 저장할 수 있는 변수 
//		int count = 0 ;
//		for (int i = 1 ; i <=10 ; i++ ) {
//			System.out.print("정수 :");
//			int num4 = scan.nextInt();
//			
//			//짝수인지 판별
//			if (num4 %2==0 ) {
//				//짝수의 개수를 센다 .
//				count++;
//			}
//		}
//		System.out.println("짝수의 개수" + count);
//		
//		

 // 키보드로 부터 정수를 두 개 입력받는다 .
		// 입력받은 x부터 y 까지의 총 합을 출력하시오 
		// 예를들어 2와 5를 입력받으면 
		// 2+3+4+5를 한 14 가 출력이 되야한다 .
		// 단 x가 y보다 큰 경우
		// x와 y의 값을 바꿔서 총합을 구한다 .
		 //x~y 값을더함. 만약 x값이 더 큰경우 y랑 값을 바꾼다.
		
		
	
		Scanner scan = new Scanner(System.in);
		System.out.print("x 값을 입력하시오 :");
		int x = scan.nextInt();
		System.out.print("y 값을 입력하시오 :");
		int y = scan.nextInt();
	
		int sum = 0 ; 
		if (x>y) {
			int z = x; // x y 의 변수값바꾸기 
			x=y ;
			y=z ;
			}	
			for(int i = x; i <= y ; i++ ) {
			sum += i ; 			
			}
		System.out.println(sum);

	}
	
	
	
	
	
	
	
	
	
}	
	
	
	
		
		
		
	

