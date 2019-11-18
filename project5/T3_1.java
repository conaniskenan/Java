package project5;

public class T3_1 {
	public static int func(int a, int b) throws T3 {
		if (b == 0) {
			throw new T3("除数为零了！");
		}
		return a / b;
	}

	public static void main(String[] args) {
		int a = 5, b = 0, c;

		try {
			c = T3_1.func(a, b);
		} catch (T3 e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}