package project9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String args[]) throws IOException {
		System.out.println("-----Server-----");
		ServerSocket server = new ServerSocket(1013);
		Socket server1 = server.accept();
		System.out.println("已建立连接");
		DataInputStream dis = new DataInputStream(server1.getInputStream());
		String data1 = dis.readUTF();
		String data2 = dis.readUTF();
		String data3 = dis.readUTF();
		System.out.printf("a = " + data1 + ' ');
		System.out.printf("b = " + data2 + ' ');
		System.out.printf("c = " + data3);
		dis.close();
		server.close();
		int a = Integer.valueOf(data1);
		int b = Integer.valueOf(data2);
		int c = Integer.valueOf(data3);
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		Socket client = new Socket("localhost", 1014);
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeDouble(area);
		dos.flush();
		dos.close();
		client.close();
	}


}

