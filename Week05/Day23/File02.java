package Day23;

import java.io.File;

public class File02 {
	
	public static void main(String[] args) {
		
		File file = new File("D:/test"); // 폴더 생성
		
			if(file.mkdir()) {
				
				System.out.println("폴더가 생성되었습니다.");
				
			} else {
				
				System.out.println("폴더 생성에 실패했습니다.");
				
			}
			
			System.out.println("폴더 명 : " + file.getName());
			
			if(file.isDirectory()) {
				
				System.out.println("폴더 명 : " + file.getName());
				
			} 
			
			if(file.isFile()) {
				
				System.out.println("파일 명 : " + file.getName());
				
			}
			
	}

}