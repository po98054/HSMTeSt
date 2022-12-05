package Day31;

import java.util.*;

public class ProductControllerVer01ByTeacher {
	
	private ProductServiceVer01ByTeacher productService = new ProductServiceImpVer01ByTeacher();
	
	private List<ProductVer01ByTeacher> productList;
	
	public ProductControllerVer01ByTeacher(List<ProductVer01ByTeacher> productList) {
		
		this.productList = productList;
		
	}

	public void insertProduct() {
		
		// 제품 정보를 입력
		
		ProductVer01ByTeacher product = productService.inputProduct();
		
		// 제품 리스트에 새 제품을 추가
		
		if(productService.insertProduct(productList, product)) {
			
			System.out.println("--------------------------------");
			
			System.out.println(" 새 제품이 등록되었습니다. ");
			
			System.out.println("---------------------------------");
			
		} else {
			
			System.out.println("----------------------------------");
			
			System.out.println(" 제품 등록에 실패했습니다. ");
			
			System.out.println("-----------------------------------");
			
		}
		
	}
	
	public void updateProduct() {
		
		// 수정 할 제품 내용을 입력
		
		ProductVer01ByTeacher newProduct = productService.inputProduct();
		
		// 기존 제품 정보를 가져옵니다.
		
		int index = productList.indexOf(newProduct);
		
		ProductVer01ByTeacher Product = productService.getProduct(productList, index);
		
		System.out.println(Product + ".." + index);
		
		// 제품 정보 수정
		
		if(productService.updateProduct(productList, newProduct, index)) {
			
			System.out.println("----------------------------------------");
			
			System.out.println("성공적으로 제품 정보가 수정되었습니다.");
			
			System.out.println("----------------------------------------");
			
		} else {
			
			System.out.println("----------------------------------------");
			
			System.out.println("제품 정보가 수정이 안되었습니다.");
			
			System.out.println("----------------------------------------");
			
		}
		
	}
	
	public void deleteProduct() {}
	
	public void buy() {}
	
	public void sel() {}
	
}