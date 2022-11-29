package Day27;

import java.io.*;

import java.net.*;

import java.util.*;

public class ServerMainEx01VerTeacher {
	
	private static ArrayList<ClientVer03> clientList = new ArrayList<ClientVer03>();
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			
			// 서버의 포트 번호 정함.
			
			serverSocket.bind(new InetSocketAddress(5001));
			
			System.out.println("서버 시작");
			
			while(true) {
				
				/*if(clientList.size() != 0) {
					
					for(ClientVer03 temp : clientList) {
						
						System.out.println(temp.socket.isClosed());
						
					}
					
					while(clientList.remove(new ClientVer03(null)));
					
				}*/
				
				Socket socket = serverSocket.accept();
				
				ClientVer03 client = new ClientVer03(socket);
				
				client.recieve();
				
				clientList.add(client);
				
				System.out.println("클라이언트 접속 - 현재 접속 인원 : " + clientList.size() + "명 입니다.");
				
			}
			
		} catch(Exception e) {
			
			System.out.println("서버 종료");
			
		}
		
	}
	
	static class ClientVer03 {
		
		private Socket socket;
		
		public Scanner sc = new Scanner(System.in);

		public ClientVer03(Socket socket) {
			
			this.socket = socket;
			
		}
		
		public void recieve() {
			
			Thread t = new Thread(() -> {
				
				try {
					
						byte [] bytes = new byte[1024];
						
						InputStream is = socket.getInputStream();
						
						// read() : 1바이트를 읽어와서 정수로 알려줌 
						
						// read(byte [] bytes) : bytes 크기만큼 한번에 읽어와서 , bytes 배열 저장하고 , 읽어온 갯수를 정수로 알려줌
						
						while(true) {
							
							int readCount = is.read(bytes); 
							
							// byte[] 에 있는 byte들을 문자열로 변환, 0번지 ~ readCount 개수만큼 변환, 인코딩은 UTF-8(한글 안 깨짐)
							
							String str = new String(bytes, 0, readCount, "UTF-8");
							
							if(readCount == -1) {
								
								break;
								
							}
							
							// 다른 클라이언트들에게 str 전송
							
							System.out.println("출력 결과 : " + str);
							
						}
						
						is.close();
						
				} catch(Exception e) {
					
					// 읽기 위해서 대기하다가 예외가 발생하면 socket 닫기
					
					// => 클라이언트에서 접속을 종료함
					
					try {
					
					if(socket != null && socket.isClosed()) {
						
							socket.close();
							
						}
					
					// 클라이언트 리스트에서 접속 종료한 클라이언트를 제거
					
					clientList.remove(this);
					
					System.out.println("클라이언트 종료 - 현재 접속 인원 : " + clientList.size() + "명 입니다.");
							
					} catch (IOException e1) {
							
							System.out.println("클라이언트 소켓 닫기 실패");
							
					}
						
				}
				
		});
			
			t.start();
			
	}
		
		public void send(String data) {
			
			Thread t = new Thread(() -> {
				
				try {
					
					OutputStream os = socket.getOutputStream();
					
					byte [] bytes = data.getBytes("UTF-8");
						
					os.write(bytes);
						
					os.flush();
					
				} catch (Exception e) {
					
					System.out.println("서버 예외 발생");
					
				}
				
			});
			
			t.start();
			
		}
		
	}

}