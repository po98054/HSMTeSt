package Day12;

public class Object01 {
	
	private int grade;
	
	private int ban;
	
	private int num;
	
	private String name;
	
	public Object01(int grade, int ban) {
		
		this.grade = grade;
		
		this.ban = ban;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) // 같은 객체를 공유하는지.
			
			return true;
		
		if (obj == null) // 매개변수가 있는지 없는지
			
			return false;
		
		if (getClass() != obj.getClass()) // obj가 같은 클래스의 객체가 아닌 경우
			
			return false;
		
		Object01 other = (Object01) obj;
		
		if (ban != other.ban)
			
			return false;
		
		if (grade != other.grade)
			
			return false;
		
		if (name == null) {
			
			if (other.name != null)
				
				return false;
			
		} else if (!name.equals(other.name))
			
			return false;
		
		if (num != other.num)
			
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		
		return "Object01 [grade=" + grade + ", ban=" + ban + ", num=" + num + ", name=" + name + "]";
		
	}
	
	
	
}