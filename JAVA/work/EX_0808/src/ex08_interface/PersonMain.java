package ex08_interface;

public class PersonMain {
	public static void main(String[] args) {

		Person jimin = new Person(new PineapplePhone());
		jimin.turnOnPhone();
		for (int i = 1; i < 6; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.chargePhone();
			}
		}
		jimin.buyNewPhone(new ThreeStarPhone());

		jimin.turnOnPhone();
		for (int i = 1; i < 6; i++) {
			jimin.watchUtube();

			if (i % 3 == 0) {
				jimin.chargePhone();
			}

		}
	}
}
