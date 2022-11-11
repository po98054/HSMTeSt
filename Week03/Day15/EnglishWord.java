package Day15;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;

public class EnglishWord {
	
	// 영어 단어장 프로그램을 구현하세요.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Word> list = new ArrayList<Word>();
		
		int menu = -1;
		
		//반복
		
		do {
			
			// 메뉴 출력
			
			printMenu();
			
			try {
			
			// 메뉴 선택
			
			menu = scan.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			
			runMenu(menu, list);
			
			} catch(InputMismatchException e) {
				
				System.out.println("-------------");
				
				System.out.println("예외 발생 : 정수를 입력하세요");
				
				System.out.println("-------------");
				
				scan.nextLine();
				
			} catch(Exception e) {
				
				System.out.println("-------------");
				
				System.out.println(e.getMessage());
				
				System.out.println("-------------");
				
			}
		
	} while(menu != 5);
		
	}

	private static void runMenu(int menu, ArrayList<Word> list) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 1;

		switch(menu) {
		
		case 1 :
			
			addWord(list);
			
			break;
			
		case 2 :
			
			System.out.println("--------------");
	    	 
			printTodoList(list);
	    	 
	        break;
	        
		case 3 :
			
			System.out.println("--------------");
			
			updateWord(list);
			
			break;
		
		case 4 :
			
			System.out.println("--------------");
			
			deleteWord(list);
			
			break;
	    	 
	    	 
		case 5 :
				
			System.out.println("--------------");
			
			System.out.println("프로그램 종료");
				
			System.out.println("--------------");
				
			break;
				
				
		default :
				
			throw new Exception("예외 발생 : 잘못된 메뉴입니다.");
				
			}
		
	}

	private static void deleteWord(ArrayList<Word> list) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		
		String word = scan.next();
		
		System.out.println("--------------");
		
		ArrayList<Integer> indexList = findWordList(list, word);
		
		if(indexList == null || indexList.size() == 0) {
			
			throw new Exception("예외 발생 : 삭제하려는 단어가 단어장에 없습니다.");
			
		}
		
		for(int i = 0; i < indexList.size(); i++) {
			
			System.out.println((i + 1) + ". " + list.get(indexList.get(i)));
			
		}
		
		System.out.println("--------------");
		
		System.out.print("삭제할 단어 번호 선택 : ");
		
		int index = scan.nextInt() - 1;
		
		if(index < 0 || index >= indexList.size()) {
			
			throw new Exception("예외 발생 : 삭제할 번호를 잘못 입력하셨습니다.");
			
		}
		
		list.remove((int)indexList.get(index));
		
		System.out.println("--------------");
		
		System.out.println("삭제가 완료되었습니다.");
	}

	private static void updateWord(ArrayList<Word> list) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 단어 입력
		
		System.out.print("단어 입력 : ");
		
		String word = scan.next();
		
		System.out.println("--------------");
		
		// 2. 단어장에서 입력 단어와 일치하는 단어 객체들을 가져옴 : 실제 단어 번지 : 1, 2, 4 => 0번지 : 1 1번지 : 2 2번지 : 4
		
		ArrayList<Integer> indexList = findWordList(list, word);
		
		// 3. 가져온 단어 객체들을 출력 : 화면상 보여주는 단어 번호 : 1. 2. 3.
		
		if(indexList == null || indexList.size() == 0) {
			
			throw new Exception("예외 발생 : 수정하려는 단어가 단어장에 없습니다.");
			
		}
		
		for(int i = 0; i < indexList.size(); i++) {
			
			System.out.println((i + 1) + ". " + list.get(indexList.get(i)));
			
		}
		
		// 4. 수정할 단어 번호를 입력 : 3번 입력 => 4번지 객체
		
		System.out.println("--------------");
		
		System.out.print("수정할 단어 번호 선택 : ");
		
		int index = scan.nextInt() - 1;
		
		if(index < 0 || index >= indexList.size()) {
			
			throw new Exception("예외 발생 : 수정할 번호를 잘못 입력하셨습니다.");
			
		}
		
		// 5. 수정할 뜻을 입력
		
		System.out.println("--------------");
		
		System.out.print("뜻 : ");
		
		scan.nextLine();
		
		String mean = scan.nextLine();
		
		// 6. 선택된 단어의 뜻을 수정
		
		Word temp = list.get(indexList.get(index)); // Word 와 list 객체의 주소값을 공유한다. => list 객체의 값이 변경이 되면 Word 객체의 값도한 변경이 된다.
		
		temp.setMean(mean);
		
		System.out.println("--------------");
		
		System.out.println("수정이 완료되었습니다.");
		
	}

	private static ArrayList<Integer> findWordList(ArrayList<Word> list, String word) {
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).equals(word)) {
				
				list2.add(i);
				
			}
			
		}
		
		return list2;
		
	}

	private static void addWord(ArrayList<Word> list) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------");
		
		System.out.print("영어 단어를 입력하세요 : ");
		
		String word = scan.next();
		
		scan.nextLine();
		
		System.out.print("영어 단어에 맞는 뜻을 입력하세요 : ");
		
		String mean = scan.nextLine();
		
		list.add(new Word(word, mean));
		
		System.out.println("--------------");
		
	}

	private static void printTodoList(ArrayList<Word> list) {
		
		if(list == null || list.size() == 0) {
    		
    		System.out.println("저장된 단어가 없습니다.");
    		
    		return;
    		
    	}
    	
    	for(Word temp : list) {
    		
    		System.out.println(temp);
    		
    	}
		
	}

	private static void printMenu() {
		
		System.out.println("------메뉴-----");
		
		System.out.println("1. 단어 추가");
		
		System.out.println("2. 단어 확인");
		
		System.out.println("3. 단어 수정");
		
		System.out.println("4. 단어 삭제");
		
		System.out.println("5. 프로그램 종료");
		
		System.out.println("--------------");
		
		System.out.print("메뉴 선택 : ");
		
	}

}

class Word {
	
	private String word;
	
	private String mean;
	
	public Word(String word, String mean) {
		
		this.word = word;
		
		this.mean = mean;
		
	}
	
	public void setMean(String mean) {
		
		this.mean = mean;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass()) {
			
			if(! (obj instanceof String)) {
				
				return false;
				
			}
			
			return word.equals(obj);
			
		}
			
		Word other = (Word) obj;
		
		if (word == null) {
			
			if (other.word != null)
				
				return false;
			
		} else if (!word.equals(other.word))
			
			return false;
		
		return true;
		
	}

	@Override
	public String toString() {
		
		return word + " : " + mean;
		
	}
	
}