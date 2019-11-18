package project9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws Exception {
		System.out.println("发送启动中.........");
		DatagramSocket client = new DatagramSocket();
		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		byte[] dates = data.getBytes();
		InetAddress isa = InetAddress.getLocalHost();
		DatagramPacket packet = new DatagramPacket(dates, 0, dates.length, isa, 1230);
		client.send(packet);
		client.close();

		DatagramSocket server = new DatagramSocket(1236);
		byte[] contain1 = new byte[1024 * 60];
		DatagramPacket packet1 = new DatagramPacket(contain1, 0, contain1.length);
		server.receive(packet1);
		byte[] dates1 = packet1.getData();
		String m = new String(dates1);
		System.out.println("返回：");
		System.out.println(m);
		server.close();

	}
}
