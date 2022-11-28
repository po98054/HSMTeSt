package Day26;

import java.io.OutputStream;

import java.net.*;

import java.util.Scanner;

public class ClientMainEx02Ver02ByHSM {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 서버에 연결을 요청하고, 연결이 되면 exit를 입력하기 전까지 문자열을
		// 서버에 전송함.
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress(5010));
			
			System.out.println("연결이 완료되었습니다. ");
			
			// Output 스트림 연결
			
			OutputStream os = socket.getOutputStream();
			
			String str;
			
			do {
				
				System.out.print("입력하고자 하는 문자열 : ");
				
				str = sc.next();
				
				byte [] bytes = str.getBytes("UTF-8");
				
				os.write(bytes);
				
				os.flush();
				
				System.out.println("Client측 문자열이 전송이 완료되었습니다.");
				
			} while(!str.equals("exit"));
			
			/*byte [] bytes = str.getBytes("UTF-8");
			
			os.write(bytes);
			
			os.flush();
			
			System.out.println("Client측 문자열이 전송이 완료되었습니다.");*/
			
			os.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}