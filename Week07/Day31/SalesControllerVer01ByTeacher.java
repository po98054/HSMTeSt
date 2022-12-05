package Day31;

import java.util.*;

public class SalesControllerVer01ByTeacher {
	
	private List<SalesVer01ByTeacher> salesList;
	
	private List<ProductVer01ByTeacher> productList;
	
	private ProductServiceVer01ByTeacher productService;
	
	private SalesServiceVer01ByTeacher salesService;
	
	public SalesControllerVer01ByTeacher(List<SalesVer01ByTeacher> salesList, List<ProductVer01ByTeacher> productList) {
		
		this.salesList = salesList;
		
		this.productList = productList;
		
		productService = new ProductServiceImpVer01ByTeacher();
		
		salesService = new SalesServiceImpVer01ByTeacher();
		
	}
	
	public void buy() {}
	
	public void sel() {}

}