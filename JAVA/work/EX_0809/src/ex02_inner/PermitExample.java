package ex02_inner;

public class PermitExample {
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		permit.getInClass().print();
	}

	private class InClass {
		public void print() {
			System.out.println(" 접근을 private으로 제한한다 .");
		}
	}

	public InClass getInClass() { //
		InClass in = new InClass();
		return in;

	}
}
