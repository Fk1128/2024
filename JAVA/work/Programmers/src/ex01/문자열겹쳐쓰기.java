//package ex01;
//
//public class 문자열겹쳐쓰기 {
//	
//		Solution {
//		    private String solution(String my_string, String overwrite_string, int s) { // .substring() 메서드 : 
//		    	// .substring() 메서드 : 매개변수로 한개의 n 값을 받았을때 index n번부터 끝까지의 문자열을 잘라내서 return한다 
//		        String answer ;
//		    	String before = my_string.substring(0, s); // my_string 에 index 0번부터 매개변수 s 까지의 문자열을 잘라내서 출력 
//		        String after = my_string.substring(s + overwrite_string.length()); // 매개변수 s + overwrite_string.length() 값에서 끝까지의 문자열을 받아내서 return한다 
//		        return answer =before + overwrite_string + after;
//		        // before : index 0번부터 변수 s의 전의 index 자리까지 잘라내서 return 한 문자열 + overwrite_string 문자열 + 
//		        // after:  매개변수 s + overwrite_string.length() 값에서 끝까지의 문자열을 받아내서 return한 문자열을 더해서 return
//		       
//		    }
//		}
//	}
//}