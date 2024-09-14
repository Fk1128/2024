package ex01_interface;

public class TJMic implements BluetoothMIC{
	
		@Override
		public void sing() {
			System.out.println("마이크에 대고 노래를 부른다.");
			
		}

		@Override
		public void music() {
			System.out.println("마이크에 장착된 스피커로 반주가 나온다.");
			
		}

		@Override
		public void connect() {
			System.out.println("핸드폰과 블루투스 연결이 되었습니다.");
		}
	}

