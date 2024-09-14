package ex02_Thread;

class AddThread implements Runnable{

	private Bank b;
	private String name;
	
	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}
	
	@Override
	public void run() {
		synchronized (b) {
			try {
				for(int i = 0; i <10; i++) {
					Thread.sleep(1000);//1초동안 멈춤
					b.addMoney(1000);
					System.out.println(this.name+" 현재 잔고 : " + b.getMoney());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}//b;
	}
}

public class BankThreadExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(new AddThread("1번",b));
		Thread t2 = new Thread(new AddThread("2번",b));
		t1.start();
		t2.start();
	}
}












