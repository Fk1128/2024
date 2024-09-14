package ex02_inner;

public class LocalClassExample {

	private int speed = 10 ;
	
	public void getUnit(String unitName) {
		//unitName = unitName+"님"; 
		class Unit{
			public void move() {
				// 자바7버전까지는 지역 클래스에서 메서드의 변수를 사용하려면 
				// final 키워드를 붙여서 사용하도록 헀으나 
				// 자바8버전부터는 해당 변수를 변경하지 않는다는 조건하에 effective final 이라는
				// 기능이 추가되어 키워드를 사용하지않아도 final 변수로 인정된다 .
				System.out.println(unitName + "이 " + speed + " 의 속도로 이동합니다 ");
			}// method move end
		} // class UnitEnd
		
		Unit unit = new Unit();
		unit.move();
	} // method getUnit end
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
	
	
	
}
