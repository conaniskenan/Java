package project9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
	public static void main(String args[]) throws Exception {
		System.out.println("接受启动中.........");
		DatagramSocket server = new DatagramSocket(1230);
		byte[] contain = new byte[1024 * 60];
		DatagramPacket packet = new DatagramPacket(contain, 0, contain.length);
		server.receive(packet);
		byte[] dates = packet.getData();
		String m = new String(dates);
		//System.out.println(m);
		char[] n = m.toCharArray();
		for (int i = 0; i < n.length; i++) {
			if ((int) n[i] >= 65 && (int) n[i] <= 90) {
				n[i] += 32;
			} else if ((int) n[i] >= 97 && (int) n[i] <= 122) {
				n[i] -= 32;
			}
		}

		String m1 = new String(n);
		System.out.println(m1);
		server.close();


		DatagramSocket client1 = new DatagramSocket();
		InetAddress isa = InetAddress.getLocalHost();
		byte[] dates1 = m1.getBytes();
		DatagramPacket packet1 = new DatagramPacket(dates1, 0, dates1.length, isa, 1236);
		client1.send(packet1);
		client1.close();
	}
}
