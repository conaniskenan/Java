package project2;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		new Temp();
	}
	public Temp() {
		Scanner cin=new Scanner(System.in);
		System.out.print("请输入摄氏温度：");
		double a=cin.nextDouble();
		double b=a*1.8+32;
		System.out.println("对应的华氏温度为："+b);
		cin.close();
	}
}
