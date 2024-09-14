package ex02_Thread;

public class RunnableName {
	public static void main(String[] args) {
		Runnable task = () ->{
		
		};
		
		Thread myThread = new Thread(task);
		myThread.setName("러너블스레드");
		String name = myThread.getName();
		System.out.println(name);
		myThread.start();
	}
}
