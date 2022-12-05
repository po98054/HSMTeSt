package Day31;

import java.util.*;

import java.util.function.Predicate;

public interface SalesServiceVer01ByTeacher {

	SalesVer01ByTeacher inputSales(String type);
	
	void printByYear(List<SalesVer01ByTeacher> salesList);
	
	void printSales(List<SalesVer01ByTeacher> salesList, Predicate<SalesVer01ByTeacher> p);
	
	void printByMonth(List<SalesVer01ByTeacher> salesList);
	
	void printByDay(List<SalesVer01ByTeacher> salesList);

}