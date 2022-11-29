package Day27;

import java.io.*;

import java.net.*;

import java.util.*;

public class ClientMainEx01VerTeacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Socket socket = null;
				
		try {
			
			socket = new Socket();
			
			System.out.println("연결 시도중 ");
			
			socket.connect(new InetSocketAddress("192.168.10.6", 5001));
			
			System.out.println("클라이언트 시작");
			
			System.out.println("연결 성공");
			
			send(socket);
			
			
		} catch (Exception e) {
			
			System.out.println("연결 실패");
			
		}
		
	}
	
	public static void recieve(Socket socket) {
		
		
		
	}
	
	public static void send(Socket socket) {
		
		Scanner sc = new Scanner(System.in);
		
		Thread t = new Thread(() -> {
			
			try {
				
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					
					String str = sc.nextLine();
					
					if(str.equals("exit")) {
						
						break;
						
					}
					
					byte [] bytes = str.getBytes("UTF-8");
					
					os.write(bytes);
					
					os.flush();
					
				}
				
				sc.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			} finally {
				
				try {
					
					if(socket != null && socket.isClosed()) {
						
						socket.close();
						
					}
					
				} catch(Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		});
		
		t.start();
		
	}

}