package ex02_objcet;

public class Ex01_Equals {
	public static void main(String[] args) {
		//equals()
		//기본 자료형의 데이터들을 동등 비교를 위해서 '==' 비교연산자를 사용한다 .
		//하지만 객체를 동등비교 할 경우 , 해당 객체의 값을 비교하는것이 아니라
		// 객체가 메모리에 있는 위치를 비교하게 된다 .
		//객체의 실제 데이터를 비교할 때 는 equals() 메서드를 사용한다 .
		
		
		
		String str1 = "hello"; // 암시적 객체생성 
		String str2 = "hello";
		String str3 = new String("hello"); // 명시적 객체생성 
				//new 를 통해서 새로 만들었기 떄문에 주소가 다른것을 볼 수 있다 .
		
		
		// 암시적 객체생성시에는 먼저 만들어져있는게 있으면 같이 참조를 한다 .
		System.out.println("str1 vs str2 : " + (str1 == str2)); //같은 주소를 참조하고있다 .
	
	//	str1= "bye"; // str2와 같은 주소를 참조하니까 str2도 Bye 로 바뀌는게 맞지않을까 ??
		// 값이 새로 대입되었기 때문에 위에서 할당받은 str1의 메모리를 버리고 새로 할당받는다 .	
		System.out.println("str2 :"+ str2);
		System.out.println(str1==str2); // false  
		
		// 불변의 법칙
		// 값이 새로 대입되거나 추가로 들어오게되면 
		// 기존의 메모리를 버리고 새로 할당받는다 .
		
		
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의값을 출력 
		System.out.println("str1 hashCode :"  + System.identityHashCode(str1));
		System.out.println("str2 hashCode :"  + System.identityHashCode(str2));
		System.out.println("str3 hashCode :"  + System.identityHashCode(str3));

		
		// 문자열 데이터 비교 
		System.out.println("str1 vs str2 :" +str1.equals(str2));
		System.out.println("str1 vs str3 :" +str1.equals(str3));
		//메모리주소가 다르더라도 데이터값은 일치하기 때문에 true 가 출력된 예시 
		
		
	}
}
