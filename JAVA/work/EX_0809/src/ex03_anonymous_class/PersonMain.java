package ex03_anonymous_class;

public class PersonMain {
	public static void main(String[] args) {
		Person s = new Student();
		s.mySelf();

		//만약 Person을 상속받아 처리해야하는 클래스가 또 필요하긴 하지만
		// 한번만 사용하고 말거라면 굳이 상속받는 클래스를 또 만들 필요가 있을까 ??
		
		//회사원
		Person w = new Person() {
			//익명클래스  // 이 익명클래스는 PersonMain 클래스 안에서만 사용할 수 있습니다 . 
			// 익명클래스 Student클래스를 extends 한것과 같은 역할 .
		@Override
		public void mySelf() {
			System.out.println("나는 회사원입니다 .");
				}
		};
		w.mySelf();
	
		
	}
}
