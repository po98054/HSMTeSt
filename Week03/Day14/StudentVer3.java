package Day14;

import java.util.ArrayList;

import lombok.Data;

@Data
public class StudentVer3 {
	
	// 필드
	
		private int grade;
		
		private int ban;
		
		private int bunho;
		
		private String name;
		
		private ArrayList<ScoreVer3> scoreList = new ArrayList<ScoreVer3>();
		
		// 각 학생 별 성적을 추가
		// 추가할 성적 추가 여부
		
		public boolean addScore(ScoreVer3 score) {
			
			if(score == null) {
				
				throw new RuntimeException("성적 정보가 없어서 추가 할 수 없습니다.");
				
			}
			
			boolean res = scoreList.contains(score);
			
			if(res) {
				
				return false;
				
			}
			
			scoreList.add(new ScoreVer3(score));
			
			return true;
			
		}

		// 메소드 : getter/setter , equals() : 같은 객체 비교 여부, toString() : 객체를 쉽게 문자열 생성
		
		@Override
		public boolean equals(Object obj) {
			
			if (this == obj)
				
				return true;
			
			if (obj == null)
				
				return false;
			
			if (getClass() != obj.getClass())
				
				return false;
			
			StudentVer3 other = (StudentVer3) obj;
			
			if (ban != other.ban)
				
				return false;
			
			if (bunho != other.bunho)
				
				return false;
			
			if (grade != other.grade)
				
				return false;
			
			return true;
			
		}

		@Override
		public int hashCode() {
			
			final int prime = 31;
			
			int result = 1;
			
			result = prime * result + ban;
			
			result = prime * result + bunho;
			
			result = prime * result + grade;
			
			return result;
			
		}
		

		// toString()
		
		@Override
		public String toString() {
			
			return grade + "학년 " + ban + "반 " + bunho + "번 " + name + "입니다.";
			
		}
		
		// printScore
		
		public void printScore() {
			
			for(ScoreVer3 temp : scoreList) {
				
				System.out.println(temp);
				
			}
			
		}
		
		// 생성자 : 초기화, 
		
		// 학년, 반, 번호, 이름이 필요한 생성자 <= 학생 정보 추가시 활용
		
		public StudentVer3(int grade, int ban, int bunho, String name) {
			
			this.grade = grade;
			
			this.ban = ban;
			
			this.bunho = bunho;
			
			this.name = name;
			
		}

		// 학년, 반, 번호가 필요 <= 성적 추가 시 학생이 있는지 없는지 판별할 때 활용
		
		public StudentVer3(int grade, int ban, int bunho) {
			
			this.grade = grade;
			
			this.ban = ban;
			
			this.bunho = bunho;
			
		}

}