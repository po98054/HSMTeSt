package Day02;

import java.util.Scanner;

public class scanner03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 단어를 입력하세요 : ");
		
		String str = sc.next();
		
		System.out.println("입력 받은 단어 : " + str);
		
		String str3 = sc.nextLine();
		
		System.out.println("남은 문장 : " + str3);
		
		System.out.println("한 문장을 입력하세요 : ");
		
		String str2 = sc.nextLine();
		
		System.out.println("입력 받은 문장 : " + str2);
		
		sc.close();

	}

}
