package project9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	public static void main(String args[]) throws UnknownHostException, IOException {
		System.out.println("-----Client-----");
		Scanner sc = new Scanner(System.in);
		Socket client = new Socket("localhost", 1013);
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		System.out.println("输入三边长度：");
		System.out.println("a = ");
		String data1 = sc.nextLine();
		System.out.println("b = ");
		String data2 = sc.nextLine();
		System.out.println("c = ");
		String data3 = sc.nextLine();
		dos.writeUTF(data1);
		dos.flush();
		dos.writeUTF(data2);
		dos.flush();
		dos.writeUTF(data3);
		dos.flush();
		dos.close();
		client.close();
		ServerSocket server = new ServerSocket(1014);
		Socket server1 = server.accept();
		System.out.println("已建立连接");
		DataInputStream dis = new DataInputStream(server1.getInputStream());
		double area = dis.readDouble();
		System.out.println("面积 = " + area);
		dis.close();
		server.close();
	}
}
