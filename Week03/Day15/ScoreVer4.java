package Day15;

public class ScoreVer4 {
	
	// 필드
	
				private String sub;
				
				private int dict;
				
				private int middle;
				
				private int fin;
				
				private int perfor;
				
				private double total;
				
				private double midRate = 0.4;
				
				private double finalRate = 0.5;
				
				private double performanceRate = 0.1;

				// 메소드 : equals() <= 성적 추가시 활용 toString <= 성적 출력시 활용 getter/setter
				
				@Override
				public int hashCode() {
					
					final int prime = 31;
					
					int result = 1;
					
					result = prime * result + dict;
					
					result = prime * result + ((sub == null) ? 0 : sub.hashCode());
					
					return result;
					
				}


				@Override
				public boolean equals(Object obj) {
					
					if (this == obj)
						
						return true;
					
					if (obj == null)
						
						return false;
					
					if (getClass() != obj.getClass())
						
						return false;
					
					ScoreVer4 other = (ScoreVer4) obj;
					
					if (dict != other.dict)
						
						return false;
					
					if (sub == null) {
						
						if (other.sub != null)
							
							return false;
						
					} else if (!sub.equals(other.sub))
						
						return false;
					
					return true;
					
				}

				
				// toString

				@Override
				
				public String toString() {
					
					return sub + "의 " + dict + "학기의 중간 성적은 " + middle + " " + dict + "학기의 기말 성적은 " + fin + " " + dict + "학기의 수행 평가 성적은 " + perfor + "입니다.";
					
				}
				

				// 생성자 : 과목 학기 중간 기말 수행평가가 필요한 생성자

				

				public ScoreVer4(String sub, int dict, int middle, int fin, int perfor) {
					
					this.sub = sub;
					
					this.dict = dict;
					
					this.middle = middle;
					
					this.fin = fin;
					
					this.perfor = perfor;
					
					this.total = (midRate * middle) + (fin * finalRate) + (perfor * performanceRate);
					
				}
				
				// 과목 학기가 필요한 생성자 <= 성적이 같은지 확인할 때
				
				public ScoreVer4(String sub, int dict) {
					
					this.sub = sub;
					
					this.dict = dict;
					
				}
				
				// 복사 생성자 
				
				public ScoreVer4(ScoreVer4 s) {
					
					this(s.sub, s.dict, s.middle, s.fin, s.perfor);
					
				}

}