import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient1 {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(2000);
			byte[] msg=new byte[100];
			DatagramPacket dp=new DatagramPacket(msg, msg.length);
			System.out.println("waiting for receiving");
			ds.receive(dp);
			System.out.println("received");
			String s=new String(dp.getData());
			System.out.println("received : "+s);
			ds.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
