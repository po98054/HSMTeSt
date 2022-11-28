package Day26;

import java.io.*;

import java.net.*;

import java.util.*;

public class ClientMainEx03Ver03ByTeacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		send(socket);
		
	}
	
	public static void send(Socket socket) {
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress(5001));
			
			System.out.println("연결 완료");
			
			// 여러개의 문자열 전송
			
			OutputStream os = socket.getOutputStream();
			
			while(true) {
				
				System.out.print("전송할 문자열 : ");
				
				String str = sc.nextLine();
				
				if(str.equals("exit")) {
					
					break;
					
				}
				
				byte [] bytes = str.getBytes("UTF-8");
				
				os.write(bytes);
				
				os.flush();
				
			}
			
			os.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}