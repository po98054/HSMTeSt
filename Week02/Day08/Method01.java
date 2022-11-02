package Day08;

import java.util.Arrays;
import java.util.Scanner;

public class Method01 {
	
	public static void main(String[] args) {
		
		int min = 1, max = 45;
		
		int size = 6;
		
		int array[] = createRandomArray(size, min, max);
		
		System.out.print("로또 번호 : ");
		
		Arrays.sort(array);
		
		printArray(array);
		
		int bonus;
		
		do {
			
			bonus = random(min,max);
			
		}
		
		while(contains(array,bonus));
		
		System.out.println(" 보너스 : " + bonus);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n당첨 번호 입력 : ");
		
		int user[] = new int[size];
		
		for(int i = 0; i<size; i++) {
			
			user[i] = scan.nextInt();
			
		}
		
		int same = sameArray(array,user);
		
		System.out.println("일치하는 개수 = " + same);
		
		lotto(lottoNum(array,user,bonus));
		
		/*switch(same) {
		
		case 6:
			
			System.out.println("1등");
			
			break;
			
		case 5:
			
			boolean isDuplicated = false;
			
			for(int i = 0; i < user.length; i++) {
				
				if(user[i] == bonus) {
					
					isDuplicated = true;
					
				}
			}
			
			contains(user, bonus);
			
			if(contains(user, bonus)) {
				
				System.out.println("2등");
				
				
			}else {
				
				System.out.println("3등");
			}
			
			break;
			
		case 4:
			
			System.out.println("4등");
			
			break;
			
		case 3:
			
			System.out.println("5등");
			
			break;
			
		default:
			
			System.out.println("꽝!");
			
		}*/
		
		scan.close();
		
	}
			
	public static void printArray(int array[]) {
		
		if(array == null) {
			
			return;
			
		}
		
		for(int i = 0; i < array.length; i++ ) {
			
			System.out.print(array[i] + " ");
			
		}
		
	}
	
	public static int [] createRandomArray(int size, int min, int max) {
		
		if(max - min + 1 <= size) {
			
			return null;
			
		}
		
		int array[] = new int[size];
		
		for(int i = 0; i < array.length;) {
			
			int r = random(min, max);
			
			if(!contains(array, r)) {
				
				array[i] = r;
				i++;
				
			}
			
		}
		
		return array;
	}
	
	public static int random(int min, int max) {
		
		if(min > max) {
			
			int tmp = min;
			
			min = max;
			
			max = tmp;
			
		}
		
		return (int)(Math.random()*(max - min + 1) + min);
		
	}
	
	// 숫자 중복 여부 체크 함수
	
	public static boolean contains(int []array, int num) {
		
		if(array == null || array.length == 0) {
			
			return false;
			
		}
		
		for(int tmp : array) {
			
			if(num == tmp) {
				
				return true;
				
			}
			
		}
		
		return false;
	}
	
	public static int sameArray(int array[], int user[]) {
		
		int sameCount = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < user.length; j++) {
				
				if(array[i] == user[j]) {
					
					sameCount++;
				}
			}
		}
		
		return sameCount;
		
	}
	
	public static int lottoNum(int array[], int user[], int bonus) {
		
		int count = sameArray(array,user);
		
		switch(count) {
		
		case 6 :
			
			return 1;
			
		case 5 :
			
			if(contains(user,bonus)) {
				
				return 2;
				
			}else {
				
				return 3;
				
			}
			
		case 4 :
			
			return 4;
			
		case 3 :
			
			return 5;
			
		default :
			
			return -1;
		
		}
		
		//return 0;
		
		//return num;
		
	}
	
	public static void lotto(int lottoNum) {
		
		switch(lottoNum) {
		
		case 1:
			
			System.out.println("1등");
			
			break;
			
		case 2:
			
			System.out.println("2등");
			
			break;
			
		case 3 : 
			
			System.out.println("3등");
			
			break;
			
		case 4:
			
			System.out.println("4등");
			
			break;
			
		case 5:
			
			System.out.println("5등");
			
			break;
			
		case -1:
			
			System.out.println("꽝!");
			
		}
		
	}
	
}