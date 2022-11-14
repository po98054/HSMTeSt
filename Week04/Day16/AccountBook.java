package Day16;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ListModel;

public class AccountBook {
	
	ArrayList<Item> list = new ArrayList<Item>();
	
	AccountService accountService = new AccountServiceImp();
	
	Scanner sc;
	
	public void run() {
		
		System.out.println("가계부 프로그램 실행합니다.");
		
		int menu = -1;
		
		do {
			
			accountService.printMenu();
			
			menu = sc.nextInt();
			
			accountService.runMenu(list, menu, sc);
			
			
		} while (menu != 5);
		
		System.out.println("가계부 프로그램 종료합니다.");
		
	}
	
	public AccountBook(Scanner sc) {
		
	if(sc == null) {
		
		this.sc = new Scanner(System.in);
		
	} else {
		
		this.sc = sc;
		
	}
		
}
	
}