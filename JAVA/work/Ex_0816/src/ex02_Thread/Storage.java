package ex02_Thread;

public class Storage {
	private int stackCount = 10;
	
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("=== 스레드 깨우기 ===");
			notify();//wait()을 만나 대기상태에 빠진 스레드는 notify()를 만나 재구동된다.
		}
	}//addStack
	
	//물건을 나르는 메서드
	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;
			} else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("== 짐 없음 대기 ==");
				wait();//스레드가 진행중에 wait()을 만나면 일시적으로 정지된다.
				//스레드가 구동되고 있을 때 일시적으로 대기상태에 보내고, 다른 스레드에게 제어권을 넘긴다.
				System.out.println("== 짐 없음 완료 ==");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//popStack
	
	//쌓여있는 물건의 개수가 몇개인지 반환하는 메서드
	public int getStackCount() {
		return stackCount;
	}
	
	
	
	
}
