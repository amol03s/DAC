import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPServer1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			DatagramSocket ds=new DatagramSocket(1000);
			System.out.println("enter message");
			String d=sc.next();
			
			byte[] msg=d.getBytes();
			InetAddress ip=InetAddress.getLocalHost();
			DatagramPacket dp=new DatagramPacket(msg,msg.length, ip,2000);
			ds.send(dp);
			System.out.println("data sent");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ds.close();
			sc.close();
			
		} catch (SocketException | UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
