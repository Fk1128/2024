package ex02_class;

public class Family_main {
	public static void main(String[] args) {
		Family father = new Family() ;
		Family son = new Family();
		
		// 정적멤버의 호출
		// 클래스명.필드
		// 클래스명.메서드명();
		System.out.println(father.adress);
		Family.adress = "incheon";
		System.out.println(son.adress);
		System.out.println(father.adress);

	
	
	}

}
