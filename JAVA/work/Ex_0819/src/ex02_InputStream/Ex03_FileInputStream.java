package ex02_InputStream;



public class Ex03_FileInputStream {
	public static void main(String[] args) {
		byte [] keyboard = new byte[100];
		
		try {
			System.out.print("값 : ");
			//키보드에서 값을 입력받기 위한 표준 입력장치 스트림
			//System.in -> inputStream 객체를 갖고있는 필드 
			System.in.read(keyboard);// 키보드로 입력한값을 byte배열에 저장하는 코드 
			
			String s = new String(keyboard).trim();//(공백을삭제)
			System.out.println(s);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
