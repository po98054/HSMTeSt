package Day23;

import java.io.*;

public class DataStream01 {
	
	public static void main(String[] args) {
		
		FileInputStream is = null;
		
		FileOutputStream os = null;
		
		DataInputStream dis = null;
				
		DataOutputStream dos = null;
		
		try {
			
			is = new FileInputStream("Test.txt");
			
			os = new FileOutputStream("Test.txt");
			
			dis = new DataInputStream(is);
			
			dos = new DataOutputStream(os);
			
			dos.writeUTF("유재석");
			
			dos.writeUTF("2002-02.02");
			
			dos.writeUTF("김국진");
			
			dos.writeUTF("1991-11-08");
			
			dos.writeUTF("박수홍");
			
			dos.writeUTF("2005-11-05");
			
			while(true) {
				
				String name = dis.readUTF();
				
				String birth = dis.readUTF();
				
				System.out.println("이름 : " + name + " 생년월일 : " + birth);
				
			}
			
		} catch (EOFException e) {
			
			System.out.println("파일 읽기가 완료되었습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				is.close();
				
				os.close();
				
				dis.close();
				
				dos.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
				
			}
		}
		
	}

}