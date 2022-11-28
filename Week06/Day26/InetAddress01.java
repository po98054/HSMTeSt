package Day26;

import java.net.*;

public class InetAddress01 {
	
	public static void main(String[] args) {
		
		InetAddress ia = null;
		
		try {
			
			ia = InetAddress.getByName("localhost");
			
			System.out.println("IP 주소 : " + ia);
			
			ia = InetAddress.getByName("www.naver.com");
			
			System.out.println("네이버 IP 주소 : " + ia);
			
			ia = InetAddress.getLocalHost();
			
			System.out.println("내 PC IP 주소 : " + ia);
			
			InetAddress ias [] = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress temp : ias) {
				
				System.out.println("네이버 IP 주소 : " + temp);
				
			}
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			
		}
		
	}

}