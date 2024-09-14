package ex03_Operate;

public class Ex05_Operater {

	public static void main(String[] args) {
		//논리연산자
		//피연산자를 두개 필요로 하는 연산자 
		//피연산자로 논리형 데이터(boolean) 만 사용이 가능하다
		
		//&& - and(그리고) 의 의미를 가지고있다 .
		// 앞뒤의 피연산자가 모두 true 일때만 true를 반환한다 .
		
		System.out.println(true && true );
		
		//T && T -> T
		//T && F -> F
		//F && T -> F
		//F && F -> F
		// 앞에값이 거짓일경우 뒤의값을 연산하지않는다 .
		
		int myAge = 30 ;
		int limit = 35 ;
		boolean result = (limit-myAge) >= 5 && (myAge) > 30 ; 
		System.out.println(result);
		// [limit(35) - myAge(30) = 5 (T) && myAge > 30 (F)]= false
		
		result = (limit-myAge) >= 5 && (myAge+=1) > 30 ; 
		// [limit(35) - myAge(30) = 5 (T) && myAge=myAge+1 > 30 (F)]= false
		System.out.println(result);
		System.out.println(myAge);
		
		// || (또는) Or 의 의미를 가지고있다 .
		// 앞 뒤의 피연산자중 하나라도 true 면 true 를 반환한다 .
		// T || T -> T
		// T || F -> T
		// F || T -> T
		// F || F -> F
		// 앞의 값이 참일경우 뒤의값을 연산하지않는다 .
		int n1 = 10 ;
		int n2 = 20 ;
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11 ; 
		
		// n1 +=10 = ( 10+10 =20) > 20  false (20 - 10 == 11) false  = false
		System.out.println(result2);
		
		
		result2 = (n1 += 10 ) > 20 || (n2+=1) - 10 == 11 ; 
		System.out.println(result2);
		
		// n1 +=10 = ( 10+10 =20) > 20  
		
		System.out.println(n2);
		
		
	}
}
