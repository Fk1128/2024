package ex06_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.cert.TrustAnchor;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		// 기반스트림만 사용해서 이미지 읽어보기
		FileInputStream readFile = null;

		// 기반 + 보조스트림을 사용해서 이미지 읽어보기
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;

		try {
			readFile = new FileInputStream("D:\\web0900_Kbj\\1.java/wall.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작 1");
			while (readFile.read() != -1) {
			}
			System.out.println("이미지 읽기 종료 1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println("종료시간 :" + time+ "초");
			System.out.println("기본스트림으로 읽기 종료");

			System.out.println("----------------------------");
			System.out.println("보조 스트림으로 읽기 시작");
			bisReadFile = new FileInputStream("D:\\web0900_Kbj\\1.java/wall.jpg");
			bis = new BufferedInputStream(bisReadFile);

			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작 2");
			while (bis.read() != -1) {
			}
			System.out.println("이미지 읽기 종료 2");
			end = System.currentTimeMillis();
			double result = (double) (end - start) / 1000;
			System.out.println("종료시간 :" + result +"초");
			
			System.out.println("보조 스트림으로 읽기 종료");

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis != null)bis.close();
				if(bisReadFile != null)bisReadFile.close();
				if(readFile != null)readFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
