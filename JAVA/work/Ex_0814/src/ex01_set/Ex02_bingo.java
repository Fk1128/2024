package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Ex02_bingo {
	public static void main(String[] args) {
		//HashSet과 ArrayList 를 이용하여 5*5  랜덤 빙고판 만들기
		//Collection.shuffle(list);
		//1~50 난수중 25개를 넣기 
		Random rd = new Random();
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		
		while(hs1.size() != 25) {
			int a = rd.nextInt(50)+1;
			hs1.add(a);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(hs1);
		Collections.shuffle(list);
		
		int[][]board = new int [5][5];
		int count =0 ;
		
		for(int i = 0; i< board.length; i++) {
			for(int j=0; j<board[i].length; j++ ) {
				board[i][j] = list.get(count++);
				System.out.printf("%02d ",board[i][j]);		
			}
			System.out.println();
		}
		
		
		
		
		
//		while(true) {
//			int a = rd.nextInt(50)+1;
//			hs1.add(a);
//			if (hs1.size() == 25) {
//				break;
//			}
//		}
//		ArrayList<Integer> list = new ArrayList<Integer>(hs1);
//		Collections.shuffle(list);
//		int count = 0;
//		for(int i=0; i<5; i++) {
//			for( int j=0 ; j<5; j++) {
//				System.out.print(list.get(count)+ " ");
//				count++;
//			}
//			System.out.println();
//		}
//
//		
	}
}
