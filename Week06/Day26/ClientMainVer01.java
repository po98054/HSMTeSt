package Day26;

import java.io.*;

import java.net.*;

import java.util.*;

public class ClientMainVer01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final String encode = "UTF-8";
		
		// 소켓 생성 (포트 번호 연결)
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress(5006));
			
			System.out.println("연결이 완료되었습니다. ");
			
			// Output 스트림 연결
			
			OutputStream os = socket.getOutputStream();
			
			// 보내려는 문자열을 byte 배열로 변환 UTF-8(한글 안 깨짐.)
			
			System.out.print("입력하고자 하는 문자열 : ");
			
			String str = sc.nextLine();
			
			byte [] bytes = str.getBytes(encode);
			
			// 전송
			
			os.write(bytes);
			
			os.flush();
			
			System.out.println("Client측 문자열이 전송이 완료되었습니다.");
			
			InputStream is = socket.getInputStream();
			
			byte [] bytes2 = new byte[1024];
			
			int readCount = is.read(bytes2);
			
			String str2 = new String(bytes2, 0, readCount, encode);
			
			System.out.println("출력할 문자열 : " + str2);
			
			os.close();
			
			is.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}