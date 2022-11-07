package Day11;

public class String03 {
	
	public static void main(String[] args) {
		
		// 주어진 파일명들 중에서 이미지 파일들을 찾아 파일명을 출력하세요.
		// 이미지 파일 확장자는 jpg png
		
		String list [] = { "이미지1.jpg" , "음악1.bmp" , "이미지2.mp4", "이미지3.png", "예제.txt" };
		
		int count = 0;
		
		String tmp;
				
		for(int i = 0; i < list.length; i++) {
			
			list[i].substring(5);
			
			if(list[i].substring(5).equals("jpg") || list[i].substring(5).equals("png")) {
				
				tmp = list[i];
				
				System.out.println(tmp);
				
				count = count + 1;
				
			}
			
		}
		
		System.out.println("최종 존재 횟수 : " + count);
		
	}

}
