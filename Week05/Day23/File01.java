package Day23;

import java.io.File;

import java.io.IOException;

public class File01 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Test.txt"); // 상대 경로
		
		try {
			
			if(file.createNewFile()) {
				
				System.out.println("파일이 생성되었습니다.");
				
			} else {
				
				System.out.println("파일 생성에 실패했습니다.");
				
			}
			
		} catch(IOException e) {
			
			System.out.println("IOException이 발생했습니다.");
			
		}
		
		File file2 = new File("C:\\Users\\user2\\Downloads\\test.txt"); // 절대 경로
		
		try {
			
			if(file2.createNewFile()) {
				
				System.out.println("파일이 생성되었습니다.");
				
			} else {
				
				System.out.println("파일 생성에 실패했습니다.");
				
			}
			
		} catch(IOException e) {
			
			System.out.println("IOException이 발생했습니다.");
			
		}
		
	}

}