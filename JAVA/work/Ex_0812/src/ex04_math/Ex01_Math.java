package ex04_math;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Ex01_Math {
	public static void main(String[] args) {
		// 올림
		System.out.println("3.31올림: " + Math.ceil(3.31)); // 소수 첫째자리에서 올림
		// 내림
		System.out.println("31.61내림 : " + Math.floor(31.61)); // 소수 첫째자리에서 내림
		// 반올림
		System.out.println("12.8:반올림 " + Math.round(12.8)); // 소수 첫째자리에서 반올림

		// 최대값 구하기
		int maxValue = Math.max(30, 60);
		// 최소값 구하기
		int minValue = Math.min(40, 70);
		System.out.println("30, 60 최대값 : " + maxValue);
		System.out.println("40, 70 최소값 : " + minValue);
		
		
		//소수점 둘째자리 이하에서 반올림하고싶을 때 
		
		double pie = 3.14159265358979;
		
		System.out.println("pie 반올림 :  " + Math.round(pie * 100)/100.0);
		System.out.println("pie 반올림 :  " + Math.round(pie * 1000)/1000.0);

		
		
		
		
		

	}
}
