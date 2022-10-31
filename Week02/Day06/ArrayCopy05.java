// 정답 소스임..
// 복습할 때는 내가 계속 고민하고 나올 때 까지 해보고 완성되면 완성 본과 정답 소스와 비교하기..

package Day06;

public class ArrayCopy05 {

	public static void main(String[] args) {
		
		int array[] = new int[3]; // 랜덤 수 저장 배열
		
		int count = 0; // 저장된 랜덤 수의 개수
		
		// 배열에 저장된 중복되지 않은 수가 3개가 될때까지 반복
		while(count < 3) {
			
			// 랜덤 수 생성
			int random = (int)(Math.random()*10);
			
			boolean isDuplicated = false;
			
			// 배열에 저장된 수 중에서 랜덤한 수와 일치하는 숫자 여부 확인
			// 저장된 숫자 개수 만큼 반복 => i는 0번지부터 저장된 개수보다 작을 때까지
			
			for (int i = 0; i < count; i++) {
				
				// 배열에 저장된 숫자 개수 만큼 확인
				// i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 true로
				
				if(array[i] == random) {
					
					isDuplicated = true;
					
				}
				
			} // 있으면 다시 처음으로 (isDuplicated가 true이면)
			
			if (isDuplicated) {
				
				continue;
				
			} // 없으면 배열에 저장하고, 저장된 개수 1 증가 (isDuplicated가 false이면)
			
				array[count] = random;
				count++;
				
		}
		
		for (int tmp : array) {
			
			System.out.println(tmp + " ");
			
		}

}
	
}