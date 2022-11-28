package Day26;

import java.io.OutputStream;
import java.net.*;

import java.util.*;

public class ClientMainEx02Ver02ByTeacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress("192.168.10.6", 5001));
			
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