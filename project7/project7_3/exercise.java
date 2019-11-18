package project7.project7_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercise {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入文件一中的内容");
		String num1 = in.next();
		try {
			File file1 = new File(args[0]);//创建源文件对象
			File file2 = new File(args[1]);//创建源文件对象
			if (!file1.exists()) {
				file1.createNewFile();
			}
			char[] sc = num1.toCharArray();//将键盘输入的内容保存到数组一中
			FileWriter out1 = new FileWriter(file1);
			out1.write(sc, 0, sc.length);//将数组一中的内容写入源文件一中
			System.out.println("请输入文件二中的内容");
			String num2 = in.next();
			char[] sc2 = num2.toCharArray();//将键盘输入的内容保存到数组二中
			FileWriter out2 = new FileWriter(file2);
			out2.write(sc2, 0, sc2.length);//将数组二中的内容写入源文件二中
			out2.close();
			out1.close();
			if (!file2.exists()) {
				file2.createNewFile();
			}
			File file3 = new File(args[2]);//创建目标文件对象
			if (!file3.exists()) {
				file3.createNewFile();
			}
			FileReader reader1 = new FileReader(file1);//创建对源文件进行读的对象
			FileReader reader2 = new FileReader(file2);//创建对源文件进行读的对象
			FileWriter writer = new FileWriter(file3);//创建对目标文件写的对象
			int a, b;
			a = reader1.read();//读源文件
			b = reader2.read();
			while (a != -1) {
				writer.write(a);
				System.out.println((char) a);
				a = reader1.read();
			}
			while (b != -1) {
				writer.write(b);
				System.out.println((char) b);
				b = reader2.read();
			}
			reader1.close();
			reader2.close();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}