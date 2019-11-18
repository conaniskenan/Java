package project5;


import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("请输入两个能够整除的数据：");
			Scanner scanner = new Scanner(System.in); // 从控制台中传入两个参数
			int number1 = Integer.parseInt(scanner.next());
			int number2 = Integer.parseInt(scanner.next()); // 求商运算
			double result = number1 / number2;
			System.out.println("the result is " + result);
		} catch (NumberFormatException e) {
			System.out.println("数字格式转换异常!");
		} catch (ArithmeticException e) {
			System.out.println("0做除数无意义!");
		} catch (Exception e) {
			System.out.println("异常！");
		}
	}
}

