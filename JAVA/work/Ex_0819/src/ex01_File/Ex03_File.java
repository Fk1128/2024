package ex01_File;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		String path = "D:\\web0900_Kbj\\1.java/aaa/bbb";
		// aaa, bbb 의 경우 실제있는 경로가 아님 
		File f = new File(path);
		
		//최종 목적지가 파일이든 폴더든간에 아예 존재하지가 않음
		//exists() - > 최종 목적지까지 가는길에 없으면false
		if(!f.exists()) {
			System.out.println("폴더생성");
			// mkdir() - > 한개의 폴더를 만들어주는 메서드 
			f.mkdirs(); // -> 복수 (여러개) 의 폴더를 만들어주는 메서드 
			
			//파일클래스는 특정 문서를 만드는기능은 없다 .
			//폴더를 만드는것 까지만 가능하다
			
			//파일클래스의 역할
			// 경로의 검증 (존재하냐 , 존재하지않느냐 , 파일이냐 폴더냐 파일의 이름 가져오기 )
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
