package project2;

import java.util.Scanner;
public class Fibonacci2 {

	public static void main(String[] args) {
		new Fibonacci2();
	}
	
	public Fibonacci2() {
		int a = 1, b = 1, c = 0;
		System.out.print("请输入数列长度：");
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		for (int i = 1 ; i <= len ; i++){
			if (i<=2){
				System.out.print(a + " ");
			}
			if (i>2){
				c = a + b;
				a = b;
				b = c;
				System.out.print(c + " ");
			}
		}
		cin.close();
	}
}