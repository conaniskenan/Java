package project8.project8_3;

public class Printer extends Thread {
	Storage s;

	public Printer(String str, Storage s) {
		super(str);
		this.s = s;
	}

	public void run() {
		synchronized (s) {
			System.out.println("Printer开始运行");
			for (int i = 0; i < s.num.size(); i++) {
				System.out.println("Printer输出:" + s.GetNum(i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Printer结束运行");
	}
}