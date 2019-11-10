import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketMyServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1022);
			System.out.println("Waiting for client request");
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			String msg=null;
			do {
			System.out.print("Server :");
			String m=sc.next();
			dos.writeUTF(m);
			msg=dis.readUTF();
			System.out.println("Client says : "+msg);
			}while(!msg.equals("end"));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
