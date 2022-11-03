package Day09;

public class abstraction02 {

	public static void main(String[] args) {
		
		Student2 st = new Student2(1,3,24,"하성민");
		
		// 초기에 기본 생성자는 아무런 값도 주어지지 않으면 초기값으로 생성이 되며..
		
		st.print();
		
		// 위 성적 메소드를 통해 성적이 수정이 되면.
		st.updateScore(95, 100, 85);
		
		// 다시 생성자를 호출하면 성적이 수정이 된 상태로 호출이 된다.
		st.print();
		
		st.updateSum(95, 100, 85);
		
		st.print();
		
	}

}

class Student2 {
	
	private int hak;
	
	private int ban;
	
	private int bunho;
	
	private String name;
	
	private int kor;
	
	private int eng;
	
	private int math;
	
	private int sum;
	
	public void print() {
		
		System.out.println(" 당신의 학년 : " + hak + " 당신의 반 : " + ban + " 당신의 번호 : " + bunho + " 당신의 이름 : " + name + " 당신의 국어 성적 : " + kor + " 당신의 수학 성적 : "
				+ math + " 당신의 영어 성적 : " + eng + " 당신의 합계 성적 : " + sum);
		
	}
	
	public Student2(int hak1, int ban1, int bunho1, String name1) {
		
		hak = hak1;
		
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
	
	public int updateSum(int kor1, int eng1, int math1) {
		
		return sum = kor1 + eng1 + math1;
		
	}
	
}