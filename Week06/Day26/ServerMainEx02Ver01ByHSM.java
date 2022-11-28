package Day26;

import java.io.InputStream;

import java.net.*;

public class ServerMainEx02Ver01ByHSM {
	
	public static void main(String[] args) {
		
		// 클라이언트가 연결을 요청하면 연결
		// 연결 종료 전까지 클라이언트가 전송한 문자열을 계속 출력
		
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			
			// 바인드 (포트 번호와 연결)
			
			serverSocket.bind(new InetSocketAddress(5010));
			
			while(true) {
				
				System.out.println("연결 대기 중 ");
				
				Socket socket = serverSocket.accept();
				
				// 연결 되었는지 확인
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				
				System.out.println("연결 수락 함 " + isa.getAddress());
				
				InputStream is = socket.getInputStream();
				
				byte [] bytes = new byte[1024];
				
				int readCount = is.read(bytes);
				
				do {
					
					String str = new String(bytes, 0, readCount, "UTF-8");
					
					System.out.println("출력할 문자열 : " + str);
					
				} while(readCount == -1);
				
				is.close();
				
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}