package project8.project8_2;

public class TestCounter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage s = new Storage();
		Printer printer = new Printer("Printer", s);
		Counter counter = new Counter("Counter", s);
		counter.start();
		printer.start();
	}
}