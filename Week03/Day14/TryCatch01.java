package Day14;

public class TryCatch01 {
	
	public static void main(String[] args) {
		
		/*
		 * try{
		 * 
		 *      예외가 발생할 수 있는 코드
		 *      
		 *    } catch(예외클래스1 e) {
		 *    
		 *       예외 처리;
		 *       
		 *    } finally {
		 *    
		 *      실행문;
		 *      
		 *    }
		 *
		 *    try, catch는 필수
		 *    catch는 1개 이상 catch가 여러개인 경우 위에 있는 예외클래스는 아래 클래스의 조상클래스가 오면 안됨
		 *    ex) 예외클래스1에 RuntineException이 오고 예외클래스2에 ArithmeticException이 오면 안됨.
		 *    finally는 선택(없거나 1개 있거나)
		 * */
		
		exception();
		
	}
	
	public static void exception() {
		
		try {
			
			System.out.println(1/0);
			
		} catch(ArithmeticException e) {
			
			System.out.println("0을 나눌수 없습니다.");
			//return;
			System.exit(0);
			
		} catch(RuntimeException e) {
			
			System.out.println("실행 시 예외 발생!!!");
			
		} finally {
			
			System.out.println("메소드 종료");
			
		}
		
		System.out.println("Bye Bye !!!!");
		
	}

}