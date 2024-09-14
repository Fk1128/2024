package ex05_try_catch;
//키보드에서 정수를 입력받도록하고 정수 이외의 값이 입력되었다면 정수만 입력가능이라는 메세지 출력하기
// 결과 
// 정수 : 100
// 입력받은수 : 100
// 정수 : aaa
// 정수만 입력가능 

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class EX03_try_catch {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 
	 try {
		 System.out.print("정수 :");
		 int a =sc.nextInt(); 
		 System.out.println("입력받은 수 :"+ a);
	 }catch (Exception e) {
		 System.out.println("정수만 입력가능");
		// TODO: handle exception
	}
	 
	String num= "";
		 
	 try {
		 System.out.print("정수 :");
		 num  =sc.next(); 
		 int a = Integer.parseInt(num);//예외발생 가능성 있음 
		 System.out.println("입력받은 수 :"+ a);
	 }catch (Exception e) {
		 System.out.println(num+ "은 정수가 아닙니다 .");
		// TODO: handle exception
	}
	 
	 
	 
	 
}

	
}

	
	
	
	
	
	
	
	
	
	