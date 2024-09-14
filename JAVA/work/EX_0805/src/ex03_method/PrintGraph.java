package ex03_method;



public class PrintGraph {
	//그래프를 그리는 기능을 갖고있는 print 메서드
	public String print(char ch, int num) {
		char[] val = new char[num];
		String str = "";
		for(int i =0 ; i < val.length; i++) {
			str +=val[i] = ch ;
		}
		return str; // 그래프 모양만 str에 저장하고 반환
	}
}
