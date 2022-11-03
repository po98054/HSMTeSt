package Day09;

public class highstudent {

	private int grade;
	
	private int ban;
	
	private int bunho;
	
	private String name;
	
	private int kor;
	
	private int eng;
	
	private int math;
	
	public void print() {
		
		System.out.println("당신의 학년 : " + grade + " 당신의 반 : " + ban + " 당신의 번호 : " + bunho + " 당신의 이름 : " + name);
		System.out.println("당신의 국어 성적 : " + kor + " 당신의 영어 성적 : " + eng + " 당신의 수학 성적 : " + math);
		
	}
	
	public highstudent() {
		
		this(1,1,1,"");
		
	}
	
	public highstudent(int grade1, int ban1, int bunho1, String name1) {
		
		grade = grade1;
		
		ban = ban1;
		
		bunho = bunho1;
		
		name = name1;
		
	}

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