package Day09;

public class abstraction01 {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setKor(90);
		st.setName("하성민");
		st.setBan(3);
		st.setBunho(21);
		st.setEng(95);
		st.setMath(85);
		st.setHak(3);
		
		System.out.println("당신의 이름 : " + st.getName());
		System.out.println("당신의 반 : " + st.getBan());
		System.out.println("당신의 번호 : " + st.getBunho());
		System.out.println("당신의 국어 성적 : " + st.getKor());
		System.out.println("당신의 영어 성적 : " + st.getEng());
		System.out.println("당신의 수학 성적 : " + st.getMath());
		System.out.println("당신의 학년 : " + st.getHak());
		System.out.println("당신의 합계 : " + st.getSum());
		System.out.println("당신의 평균 : " + st.getAvg());

	}

}

// 학생 성적 관리 프로그램에서 필요한 학생 클래스를 만들어 보세요.

class Student {
	
	int kor;
	int eng;
	int math;
	String name;
	int ban;
	int hak;
	int bunho;
	double avg;
	int sum;
	
	public int getKor() {
		
		return kor;
		
	}
	
	public void setKor(int kor) {
		
		this.kor = kor;
		
	}
	
	public int getEng() {
		
		return eng;
		
	}
	
	public void setEng(int eng) {
		
		this.eng = eng;
		
	}
	
	public int getMath() {
		
		return math;
		
	}
	
	public void setMath(int math) {
		
		this.math = math;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public int getBan() {
		
		return ban;
		
	}
	
	public void setBan(int ban) {
		
		this.ban = ban;
		
	}
	
	public int getHak() {
		
		return hak;
		
	}
	
	public void setHak(int hak) {
		
		this.hak = hak;
		
	}
	
	public int getBunho() {
		
		return bunho;
		
	}
	
	public void setBunho(int bunho) {
		
		this.bunho = bunho;
		
	}
	
	public double getAvg() {
		
		return (kor + math + eng) / 3.0;
		
	}
	
	public void setAvg(double avg) {
		
		this.avg = avg;
		
	}
	
	public int getSum() {
		
		return kor + math + eng;
		
	}
	
	public void setSum(int sum) {
		
		this.sum = sum;
		
	}
	
}