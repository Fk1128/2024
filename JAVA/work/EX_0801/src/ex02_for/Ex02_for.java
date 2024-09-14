package ex02_for;

public class Ex02_for {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println();
		for (int i = 1; i < 5; i++) { // 4번반복됨
			for (int j = 1; j < 4; j++) { // 3번반복됨 ?
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		int count = 0;

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.printf("%02d ", ++count);

			}
			System.out.println();

		}
	System.out.println();
	
	//A BCD
	
		char a = 64 ;
		
		for (int i =1 ; i<4; i++) {
			for(int j =1; j <5; j++ )  {
				System.out.printf("%s ", (char)++a );
			}
			System.out.println();
		}
	
		
	/*   /*
		 /** 
		 /*** 
		 /**** 
		 /*****/
		
		
		for (int i =1 ; i < 6; i ++) {
			for(int j=0; j< i  ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//---------------------------------
		
		for (int i = 1; i < 11; i++ ) {
			for(int j = 0 ; j < 10 ; j++) {
				int num = i +j;
				if(num > 10)
					num-=10;
				System.out.print(num +" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	
	
	}

}
