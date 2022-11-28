package Day26;

import java.net.*;

public class ServerMainEx04Ver04ByTeacher {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
				
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress(5002));
			
			while(true) {
				
				System.out.println("연결 대기 중");
				
				Socket socket = serverSocket.accept();
				
				Client c = new Client(socket);
				
				c.read();
				
				c.send();
				
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}