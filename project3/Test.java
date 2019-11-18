package project3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.print("输入课程名字：");
		String a=cin.nextLine();
		System.out.print("输入教材数量：");
		int num=cin.nextInt();
		String []arrs=new String[num];
		System.out.print("输入教材名字：");
		for (int i = 0; i < num; i++) {
			arrs[i]=cin.next();
		}
		setLesson lesson=new setLesson(a,arrs);
		System.out.println(lesson);
		cin.close();
	}

}