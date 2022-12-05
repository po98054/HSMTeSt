package Day31;

import java.util.*;

public interface ProductServiceVer01ByTeacher {
	
	// 새로운 제품 정보를 제품 리스트에 등록하는 메소드 (매개 변수 : productList 제품 리스트 product 새로운 제품 정보 리턴 타입 : 제품 등록 여부 (True/False)
	
	boolean insertProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product);
	
	// 기존 제품 정보를 수정하는 메소드 (매개 변수 : productList 기존 제품 리스트 product 수정할 제품 정보, index 수정할 제품의 번지 리턴 타입 : 제품 수정 여부 (True/False)
	
	boolean updateProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product, int index);
	
	// 기존 제품 정보를 삭제하는 메소드 (매개 변수 : productList 제품 리스트 product 삭제할 제품 정보 리턴 타입 : 제품 삭제 여부 (True/False)
	
	boolean deleteProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product);
	
	// 제품 리스트에서 index 번지에 있는 제품을 가져오는 메소드 (매개 변수 : productList 제품 리스트 index 가져올 번지, 리턴 타입 : index 번지에 있는 제품 정보, 없으면 null)
	
	ProductVer01ByTeacher getProduct(List<ProductVer01ByTeacher> productList, int index);
	
	ProductVer01ByTeacher getProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product);
	
	// 제품 수량 변경 메소드 (매개 변수 : Product 제품 정보 amount 제품 수량(+면 제품을 구매 -면 제품을 판매)
	
	void productStock(ProductVer01ByTeacher product, int amount);
	
	// 제품 정보를 입력 받아 제품 객체를 반환하는 메소드 (리턴 타입 : product 입력 받은 정보로 만든 제품 객체)
	
	ProductVer01ByTeacher inputProduct();

	

}