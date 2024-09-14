package ex04_Reader;

import java.io.FileReader;

public class Ex02_FileReader {
	public static void main(String[] args) {
		// 특정경로에 reader.txt 파일을 만들고 아무내용이나 적는다 .

		// reader.txt파일을 읽어서
		// 알파벳 대문자와 소문자의 개수를 출력하세요

		// 대문자 : X개
		// 소문자 : X개

		FileReader fr = null;
		try {

			fr = new FileReader("D:\\web0900_Kbj\\1.java/reader.txt");
			int code = 0;
			int a = 0;
			int b = 0;
			
			
			while ((code = fr.read()) != -1) {
				if (code >= 65 && code <= 90) {
					a++;
				} else if (code >= 97 && code <= 122) {
					b++;
				}
			}
			System.out.println("대문자 :" + a);
			System.out.println("소문자 :" + b);

		} catch (Exception e) {

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
