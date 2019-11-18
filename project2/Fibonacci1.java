package project2;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		new Fibonacci1();
	}

	private static int getNum(int i) {
		if (i == 1 || i == 2)
			return 1;
		else
			return getNum(i - 2) + getNum(i - 1);
	}

	public Fibonacci1() {
		System.out.print("请输入数列长度：");
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		for (int j = 1; j <= a; j++) {
			System.out.print(getNum(j) + " ");
		}
		cin.close();
	}
}