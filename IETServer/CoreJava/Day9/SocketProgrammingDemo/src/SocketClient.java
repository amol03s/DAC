import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {
	public static void main(String[] args) {
		
		try {
			Socket s=new Socket("localhost",1022);
			DataInputStream cdis=new DataInputStream(s.getInputStream());
			DataOutputStream cdos=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			String m=null;
			do {
			String msg=cdis.readUTF();
			System.out.println("Server Says: "+msg);
			System.out.println("client :");
			 m=sc.next();
			cdos.writeUTF(m);
			}while(!m.equals("end"));
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
