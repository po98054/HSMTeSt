package Day23;

import java.io.*;

import lombok.Data;

public class DataStream02 {
	
	public static void main(String [] args) {
		
		FileOutputStream os = null;
		
		FileInputStream is = null;
		
		ObjectInputStream ois = null;
		
		ObjectOutputStream oos = null;
		
		try {
			
			os = new FileOutputStream("Test.txt");
			
			oos = new ObjectOutputStream(os);
			
			oos.writeObject(new Student("유재석", "2002-11-02"));
			
			oos.writeObject(new Student("박수홍", "2002-11-03"));
			
			oos.writeObject(new Student("김국진", "2002-11-04"));
			
		} catch (EOFException e) {
			
			System.out.println("파일 읽기가 완료되었습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				os.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		try {
			
			is = new FileInputStream("Test.txt");
			
			ois = new ObjectInputStream(is);
			
			while(true) {
				
				Student std = (Student) ois.readObject();
				
				System.out.println(std.toString());
				
			}
			
			
		} catch (EOFException e) {
			
			System.out.println("파일 읽기가 완료되었습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				is.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}

@Data
class Student implements Serializable {
	
	private static final long serialVersionUID = -8948055516687514504L;

	private String name;
	
	private String birthday;

	public Student(String name, String birthday) {
		
		this.name = name;
		
		this.birthday = birthday;
		
	}

	@Override
	public String toString() {
		
		return "이름 : " + name + " " + " 생일  : " + birthday;
		
	}
	
	
	
}