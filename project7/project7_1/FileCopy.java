package project7.project7_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入文件一中的内容");
		String num = in.next();
		try {
			File file1 = new File(args[0]);//创建源文件对象
			if (!file1.exists()) {
				file1.createNewFile();
			}
			char[] sc = num.toCharArray();//从键盘输入的字符存入数组中
			FileWriter out = new FileWriter(file1);
			out.write(sc, 0, sc.length);//将输入的内容写入源文件中
			out.close();
			File file2 = new File(args[1]);//创建目标文件对象
			if (!file2.exists()) {
				file2.createNewFile();
			}
			FileReader reader = new FileReader(file1);//创建对源文件进行读的对象
			FileWriter writer = new FileWriter(file2);//创建对目标文件写的对象
			int a;
			a = reader.read();
			while (a != -1) {
				writer.write(a);
				System.out.println((char) a);
				a = reader.read();
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}