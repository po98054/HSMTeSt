package Day12;

public class Student {
	
	private int grade;
	
	private int ban;
	
	private int bunho;
	
	private String name;
	
	private int kor;
	
	private int eng;
	
	private int math;
	
	public void updateKor(int kor1) {
		
		kor = kor1;
		
	}
	
	public void updateEng(int eng1) {
		
		eng = eng1;
		
	}

	public void updateMath(int math1) {
	
		math = math1;
	
	}
	
	public void updateScore(int kor1, int eng1, int math1) {
		
		updateEng(eng1);
		
		updateKor(kor1);
		
		updateMath(math1);
		
	}

}
