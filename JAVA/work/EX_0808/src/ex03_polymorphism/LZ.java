package ex03_polymorphism;

public class LZ extends Computer{
	
	
	@Override
	public void poweron() {
		super.poweron();
		System.out.println("사랑해요 LZ");
	}

}
