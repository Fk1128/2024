package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		// 특정 경로에 file.txt문서를 만들고 아무 문장이나 입력해둔다 .
		// file.txt의 내용을 읽어온 뒤 회문인지 아닌지 판별해서 출력하시오

		String path = "D:\\web0900_Kbj\\1.java/file.txt";
		File f = new File(path);

		byte[] read = new byte[(int) f.length()];
		FileInputStream fis = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				//read()메서드를 통해서 읽어온 내용을 read배열에 넣음 
				fis.read(read);
				//read배열에 들어있는 모든 요소를 문자열로 바꿔서 넣음
				String res = new String(read).trim(); // 읽어온 파일의 문자열을 저장
				String result = "";
				for (int i = res.length(); i > 0; i--) {
					result += res.charAt(i - 1);
				}
				if (res.equals(result)) { // 문자열이 같은지 비교

					System.out.println("file.txt 는 회문입니다");
				} else {
					System.out.println("file.txt는 회문이 아닙니다.");
				}

			} catch (Exception e) {
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
