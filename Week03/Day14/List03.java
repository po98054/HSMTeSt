package Day14;

import java.util.ArrayList;

import lombok.Data;

public class List03 {
	
	// 클래스에 equals를 오버라이딩 하지 않으면 contains와 indexOf처럼 같은 객체인지를 제대로 판별하지 못해서 원하는 결과를 얻을 수 없다
	
	public static void main(String[] args) {
		
		ArrayList<Word> list = new ArrayList<Word>();
		
		list.add(new Word("apple", "사과"));
		
		list.add(new Word("house", "집"));
		
		System.out.println(list);
		
		System.out.println(list.contains(new Word("house", "집")));
		
	}

}

@Data
class Word {
	
	private String word;
	
	private String mean;
	
	public Word(String word, String mean) {
		
		this.word = word;
		
		this.mean = mean;
		
	}
	
	public String toString() {
		
		return word + " : " + mean;
		
	}
	
}