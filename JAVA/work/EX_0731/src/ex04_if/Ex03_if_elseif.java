package ex04_if;

import java.net.Socket;

public class Ex03_if_elseif {

	public static void main(String[] args) {
		int favorite = 10;
		
		if(favorite < 5) { 
			System.out.println("좋아하는 숫자는 5보다 작습니다.");
		}else if (favorite > 5 ) {
			System.out.println("좋아하는 숫자는 5보다 큽니다 .");
		}else { 
			System.out.println(" 좋아하는 숫자는 5입니다 .");	
		}
		
	}
	
}

