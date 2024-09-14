package ex01_interface;

public class MicMain {

	public static void main(String[] args) {
		System.out.println("---TJmic 객체---");
		TJMic tj = new TJMic();
		tj.connect();
		tj.music();
		tj.sing();

		System.out.println("\n---TJmic 객체를 BluetoothMIC로 타입 변환---");
		BluetoothMIC bm = tj;
		bm.connect();
		bm.music();
		bm.sing();

		System.out.println("\n---TJmic 객체를 Microphone으로 타입 변환---");
		MicroPhone m = tj;
		// m.connect(); 호출불가능
		// m.music(); 호출불가능
		m.sing();

		System.out.println("\n--TJmic 객체를 Speaker로 타입 변환---");
		Speaker s = tj;
		// s.connect(); 호출불가능
		s.music();
		// s.sing(); 호출불가능

	}
}

