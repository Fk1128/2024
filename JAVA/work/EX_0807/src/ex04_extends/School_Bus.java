package ex04_extends;

public class School_Bus extends Bus {

	public School_Bus(int peopleNum) {
		super(peopleNum);
	}
	
	@Override
	public void takePerson() {
		super.takePerson();
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다 .");
}
	
	
	@Override
	public void ride() {
		System.out.println("시속 50km/h 로 천천히 달립니다 .");
	}
}
