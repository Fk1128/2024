package ex01;

public class star {
	public static void main(String[] args) {
		for(int i =0; i<9 ; i+=2) { // 0 2 4 6 8 5번 줄바꿈 반복
			for(int j=0; j<i; j+=2) {// 0 2 4 6 8 	i=0 일떄 j<i 0번반복 i=2일때 : j<2  0,1 두번반복  
				System.out.print(" ");
			}
			for(int j=1; j<10-i;j++) { //1~9
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
