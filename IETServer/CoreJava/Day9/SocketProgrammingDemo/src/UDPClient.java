import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) {
		DatagramSocket ds=null;
		try {
			 ds=new DatagramSocket(2000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] buffer=new byte[50];
		DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
		try {
			ds.receive(dp);
			String s=new String(dp.getData());
			System.out.println("Data :"+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
