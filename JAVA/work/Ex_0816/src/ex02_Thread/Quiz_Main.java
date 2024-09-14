package ex02_Thread;

public class Quiz_Main {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
