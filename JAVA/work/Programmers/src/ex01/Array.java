//package ex01;
//
//import java.util.Arrays;
//
//public class Array {
//	public static void main(String[] args) {
//		char[] arr = {'a','c','e','d','b','f','h','g','i'};
//		char[] arr2 = null; 			
//		char temp;  
//		System.out.println(arr);
//		for(int i= 0; i< arr.length; i++ ) {
//			for(int j=i+1; j<arr.length; j++ ) {
//				if(arr[i]>arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr [j] = temp;		
//				}
//			}
//		}
//		//System.out.print(Arrays.toString(arr));
//		System.out.println(arr);
//		System.out.println(arr2);
//	}
//}
////
//////배열 정렬 문제 
////{'a','c','e','d','b','f','h','g','i'}
////1. 알파벳 순서로 정렬
////2. 해당 순서로 알파벳 정렬
////[1,3,5,7,9,8,6,4,2]
////
////
////2차원 배열
////아래와 같이 출력되게 하기
////스캐너로 수 입력 받고
////첫 배열의 마지막 수가 입력받은 수가 되게 하기
////예시) 3 입력 시
////[0,1,2,3]
////[1,2,3,4]
////[2,3,4,5]
////[3,4,5,6]