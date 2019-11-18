package project8.sy6_1;

public class Sy6_1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("the thread is:" + this.getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sy6_1 thread1 = new Sy6_1();
		thread1.start();

		Sy6_1 thread2 = new Sy6_1();
		thread2.start();

		Sy6_1 thread3 = new Sy6_1();
		thread3.start();
	}

}