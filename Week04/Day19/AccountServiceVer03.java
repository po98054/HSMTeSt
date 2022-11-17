package Day19;

import java.text.ParseException;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.function.Predicate;

public interface AccountServiceVer03 {
	
	void insertItem(ArrayList<ItemVer03> list, ItemVer03 item); // 내역 리스트, 추가 아이템
	
	void printItem(ArrayList<ItemVer03> list); // 가계부에 있는 내역 리스트
	
	void printItem(ArrayList<ItemVer03> list, int ...dates);
	
	void printItem(ArrayList<ItemVer03> list, Predicate<ItemVer03> p);
	
	boolean updateItem(ArrayList<ItemVer03> list, int index, ItemVer03 item); // 가계부에 있는 내역 리스트, 수정할 아이템, 몇번지 => 성공/실패인지 알아야 하기에.
	
	boolean deleteItem(ArrayList<ItemVer03> list, int index); // 가계부에 있는 내역 리스트, 몇번지 => 성공/실패인지 알아야 하기에.

	void printMenu();

	void runMenu(ArrayList<ItemVer03> list, int menu, Scanner sc) throws ParseException;
	
	ItemVer03 inputItem(Scanner sc) throws ParseException;
	
	int selectItem(ArrayList<ItemVer03> list, Scanner sc, String date); 
	
	String inputDate(Scanner sc) throws ParseException;
	
	int inputYear(Scanner sc);
	
	int inputMonth(Scanner sc);
	
	int inputDay(Scanner sc);
	
	void printSubMenu();
	
	void runPrint(int subMenu, Scanner sc, ArrayList<ItemVer03> list);

}