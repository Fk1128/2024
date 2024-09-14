package ex03_method;

public class MidTerm_Main {
	public static void main(String[] args) {
		
		
		int[] stu1 = {89,90};
		int[] stu2 = {48,12};
		MidTerm midTerm = new MidTerm();
		
		int result = midTerm.score(stu1);
		int result2= midTerm.score(stu2);
		
		if(result > result2) {
			System.out.println("A학생의 성적이 B학생보다 좋습니다 ");
			}else if (result < result2) {
				System.out.println("B학생의 성적이 A학생의 성적보다 좋습니다.");
				}else {
					System.out.println("A학생의 성적과 B학생의 성적이 같습니다");
				}
		
		
	
		
	}
}
