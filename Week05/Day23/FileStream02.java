package Day23;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

public class FileStream02 {
	
	public static void main(String[] args) {
	
		FileWriter fw = null;
		
		FileReader fr = null;
		
		try {
			
			fw = new FileWriter("Test.txt", true);
			
			fr = new FileReader("Test.txt");
			
			char ch = '\u0000';
			
			for(int i = 0; i < 200; i++) {
				
				fw.write(ch++);
				
			} 
			
			int num;
			
			for(int i = 0; i < 200; i++) {
				
				num = fr.read();
				
				System.out.print((char)num);
				
			}
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			
			try {
				
				fr.close();
				
				fw.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
			
	}

}