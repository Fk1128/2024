package ex04_farm;

class  Animal {
	public void  cry() { // 오버라이드 하기위한 메서드 // 
	};
}

class Pig extends Animal {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
};

class Cow extends Animal {
	@Override
	public void cry() {
		System.out.println("음메");

	}
};

class Farm {

	public void sound(Animal animal) { //Animal 클래스에 cry 메서드를 만들고 자식클래스에 cry() 메서드를 오버라이딩해서 만든후 Farm 클래스에 sound 메서드 간소화 .
		animal.cry();
	
	}
}
//		if (animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		} else {
//			System.out.println("음메");
//		}
//	}

// 메서드이름이 같은데 생성ㅇ ㅣ가능한이유 : 오버로딩
//	public void sound(Pig pig) {
//		System.out.println("꿀꿀");
//		
//	}
//	public void sound(Cow cow){
//		System.out.println("음메");
//	}
//}

public class FarmTset {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}

}


// instanceof 와 '=='의 차이 
// A instanceof B : 객체변수 A가 B타입으로 생성된건인지 아닌지 확인 
// A == B : 객체A와 객체 B 가 같은 주소를 참조하고 있는지 확인 
