package Day26;

import java.io.InputStream;

import java.net.*;

public class ServerMainEx02Ver02ByTeacher {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
				
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress(5001));
			
			while(true) {
				
				System.out.println("연결 대기 중");
				
				Socket socket = serverSocket.accept();
				
				System.out.println("연결 완료");
				
				// 여러개의 문자열 출력
				
				InputStream is = socket.getInputStream();
				
				while(true) {
					
					byte [] bytes = new byte[1024];
					
					int readCount = is.read(bytes);
					
					if (readCount == -1) {
						
						break;
						
					}
					
					String str = new String(bytes, 0, readCount, "UTF-8");
					
					System.out.println("출력할 문자열 : " + str);
					
				}
				
				//is.close();
				
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}