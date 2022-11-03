package Day09;

import java.util.Scanner;

/* 메뉴
 * 1. 학생 추가
 * 2. 학생 성적 추가
 * 3. 학생 정보 출력
 * 4. 프로그램 종료
 * */

public class StudentManager {

	public static void main(String[] args) {
		
		int menu;
		
		highstudent Student[] = new highstudent[30];
		
		int count = 0;
		
		do {
			
			printMenu();
			
			menu = selectMenu();
			
			count = playMenu(menu, Student, count);
			
			
		} while(menu != 4);
		
	}
		
		public static void printMenu() {
			
			System.out.println("=============== 메뉴 ===========");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 성적 추가");
			System.out.println("3. 학생 정보 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("====================");
			System.out.println("메뉴를 선택하세요.");
			
		}
		
		public static int selectMenu() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원하는 메뉴를 입력하세요 : ");
			
			int menu = sc.nextInt();

			return menu;
			
		}
		
		public static int playMenu(int menu, highstudent [] Student, int count) {
			
			int grade, ban, bunho;
			
			String name;
			
			Scanner sc = new Scanner(System.in);
			
			switch(menu) {
			
			case 1 :
				
				System.out.print("학생 정보를 입력하세요 (학년, 반, 번호, 이름순) : ");
				
				grade = sc.nextInt();
				
				ban = sc.nextInt();
				
				bunho = sc.nextInt();
				
				name = sc.next();
				
				Student[count] = new highstudent(grade, ban, bunho, name); 
				
				count++;
				
				break;
				
			case 2 :
				
				// 학생 성적 추가
				// 학생을 선택 => 학생 정보를 출력 후, 학생 선택
				for(int i = 0; i < count; i++) {
					
					System.out.println("====================================================");
					
					System.out.println((i + 1) + "번");
					
					System.out.println("====================================================");
					
					Student[i].print();
					
					System.out.println("====================================================");
					
				}
				
				int index = sc.nextInt() - 1;
				
				// 성적 입력
				
				System.out.println("성적 입력 (국어, 영어, 수학 순) : ");
				
				int kor = sc.nextInt();
				
				int eng = sc.nextInt();
				
				int math = sc.nextInt();
				
				// 해당 학생의 성적을 입력받은 성적으로 변경
				
				Student[index].updateScore(kor, eng, math);
				
				break;
				
			case 3 :
				
				for(int i = 0; i < count; i++) {
					
					Student[i].print();
					
				}
	
				break;
	
			case 4 :
	
				System.out.println("프로그램을 종료합니다.");
				
				break;
			
			}
			
			return count;
			
		}
		
	}