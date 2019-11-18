package project5;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("请输入两个能够整除的数据：");
				Scanner scanner = new Scanner(System.in); // 从控3制台中传入两个参数
				double number1 = Double.parseDouble(scanner.next());
				double number2 = Double.parseDouble(scanner.next()); // 求商运算
				double result = (double) number1 / number2;
				System.out.println("the result is " + result);
			} catch (NumberFormatException e) {
				System.out.println("数字格式转换异常!");
			}
		} catch (ArithmeticException e) {
			System.out.println("0做除数无意义!");
		} catch (Exception e) {
			System.out.println("异常！");
		}
	}
}
