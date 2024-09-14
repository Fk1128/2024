package ex04_Reader;

import java.io.FileReader;

public class Ex01_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;
		// 이미지,음악,동영상 전송할 때는 바이트기반의 스트림을 이용하는것이 좋다 .
		// 텍스트파일만 문자기반 스트림을 사용하는것이 좋다
		try {
			fr = new FileReader("D:\\web0900_Kbj\\1.java/test.txt");
			int code = 0;

			while ((code = fr.read()) != -1) {
				System.out.print((char) code);

			}

		} catch (Exception e) {

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}

			} catch (Exception e2) {

			}

		}

	}
}
