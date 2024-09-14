package ex03_method;

public class Bread {
public void result () {
	System.out.println("빵을 만들었습니다");
	}
public void result(int a) {
	for(int i=0 ; i<=a ; i++) {
		System.out.println("빵을 만들었습니다");	
	}
	System.out.println("요청하신"+a+"개의 빵을 만들었습니다 .");
}
public void result (int a ,String b) {
	for(int i=0 ; i<=a ; i++) {
		System.out.println(b+"빵을 만들었습니다");	
	}
	System.out.println("요청하신 " +a+ "개의 " + b+"빵을 만들었습니다");
}
}


