import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket s=null;
		try {
			s=new DatagramSocket(1000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress ip=null;
		try {
			ip = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
		byte[] buffer;
		buffer="Hello".getBytes();
		DatagramPacket dp=new DatagramPacket(buffer, buffer.length,ip,2000);
		try {
			s.send(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
