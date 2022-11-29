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
			
			socket.connect(new InetSocketAddress(5001));
			
			System.out.println("클라이언트 시작");
			
			System.out.println("연결 성공");
			
			send(socket, "sm");
			
			recieve(socket);
			
			
		} catch (Exception e) {
			
			System.out.println("연결 실패");
			
		}
		
	}
	
	public static void recieve(Socket socket) {
		
		Thread t = new Thread(() -> {
			
			try {
				
					byte [] bytes = new byte[1024];
					
					InputStream is = socket.getInputStream();
					
					// read() : 1바이트를 읽어와서 정수로 알려줌 
					
					// read(byte [] bytes) : bytes 크기만큼 한번에 읽어와서 , bytes 배열 저장하고 , 읽어온 갯수를 정수로 알려줌
					
					while(true) {
						
						int readCount = is.read(bytes); 
						
						// byte[] 에 있는 byte들을 문자열로 변환, 0번지 ~ readCount 개수만큼 변환, 인코딩은 UTF-8(한글 안 깨짐)
						
						if(readCount == -1) {
							
							break;
							
						}
						
						String str = new String(bytes, 0, readCount, "UTF-8");
						
						int index = str.indexOf(",");
						
						if(index == -1) {
							
							continue;
							
						}
						
						String name = str.substring(0, index);
						
						String message = str.substring(index + 1);
						
						System.out.println(name + ">" + message);
						
					}
					
					is.close();
					
			} catch(Exception e) {
				
				
					
			} finally {
				
				// 읽기 위해서 대기하다가 예외가 발생하면 socket 닫기
				
				// => 클라이언트에서 접속을 종료함
				
				try {
				
				if(socket != null && socket.isClosed()) {
					
						socket.close();
						
					}
				
				System.out.println("클라이언트 종료");
						
				} catch (IOException e1) {
						
						System.out.println("클라이언트 소켓 닫기 실패");
						
				}
				
			}
			
		});
		
		t.start();
		
	}
	
	public static void send(Socket socket, String name) {
		
		Scanner sc = new Scanner(System.in);
		
		Thread t = new Thread(() -> {
			
			try {
				
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					
					String str = sc.nextLine();
					
					if(str.equals("exit")) {
						
						if(socket != null && !socket.isClosed()) {
							
							socket.close();
							
						}
						
						os.close();
						
						break;
						
					}
					
					str = name + "," + str;
					
					byte [] bytes = str.getBytes("UTF-8");
					
					os.write(bytes);
					
					os.flush();
					
				}
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			} finally {
				
				System.out.println("종료");
				
				try {
					
					if(socket != null && !socket.isClosed()) {
						
						socket.close();
						
					}
					
				} catch(Exception e) {
					
					System.out.println("클라이언트 소켓 종료 실패");
					
				}
				
				sc.close();
				
			}
			
		});
		
		t.start();
		
	}

}