package Day26;

import java.io.*;

import java.net.*;

import java.util.*;

public class ServerMainVer01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 서버 소켓 생성
		
		ServerSocket serverSocket = null;
		
		final String encode = "UTF-8";
		
		try {
			
			serverSocket = new ServerSocket();
			
			// 바인드 (포트 번호와 연결)
			
			serverSocket.bind(new InetSocketAddress(5007));
			
			// 대기 -> 허용 요청 -> 소켓 생성
			
			while(true) {
				
				System.out.println("연결 대기 중 ");
				
				Socket socket = serverSocket.accept();
				
				// 연결 되었는지 확인
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				
				System.out.println("연결 수락 함 " + isa.getAddress());
				
				// // InputStream 스트림 연결
				
				InputStream is = socket.getInputStream();
				
				byte [] bytes = new byte[1024];
				
				int readCount = is.read(bytes);
				
				String str = new String(bytes, 0, readCount, encode);
				
				System.out.println("출력할 문자열 : " + str);
				
				// 콘솔에서 문자열을 입력받아 클라이언트로 전송
				
				OutputStream os = socket.getOutputStream();
				
				System.out.print("입력하고자 하는 문자열 : ");
				
				String str2 = sc.nextLine();
				
				byte [] bytes2 = str2.getBytes(encode);
				
				os.write(bytes2);
				
				os.flush();
				
				System.out.println("서버측 문자열이 전송이 완료되었습니다.");
				
				is.close();
				
				os.close();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}