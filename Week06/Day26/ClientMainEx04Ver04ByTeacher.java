package Day26;

import java.net.*;

public class ClientMainEx04Ver04ByTeacher {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress(5002));
			
			System.out.println("연결 완료");
		
			Client c = new Client(socket);
		
			c.send();
			
			c.read();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}