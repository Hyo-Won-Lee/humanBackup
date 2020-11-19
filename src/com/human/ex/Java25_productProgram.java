package com.human.ex;

class Product{
	public static int productCount;	//등록 상품 개수
	public String name;			//상품명
	public int count;			//재고수량
	public Product() {}
	public Product(String name, int count) {
		this.name = name;
		this.count = count;
		Product.productCount++;
	}
}

class ProductManager extends Product{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public ProductManager() {}
	public Product[] p = new Product[5];
	public int select;
	
	//기존 상품 등록
	Product p0 = new Product("tv",1000); 
	Product p1 = new Product("camera",500);
	Product p2 = new Product("refrigerator",100);
	Product p3 = new Product("airConditioner",800);
	Product p4 = new Product("cleaner",300);
	
	public void init() {
		p[0]=p0;p[1]=p1;p[2]=p2;p[3]=p3;p[4]=p4;
	}
	public void inputProduct() {	//입고
		System.out.print("입고할 상품명 입력>>");
		String pName = sc.nextLine();
		System.out.print("입고 수량 입력>>");
		int pCount = Integer.parseInt(sc.nextLine());
		if(pName == null) {
			System.out.println("dd");
		}else {
			for(int i=0;i<p.length;i++) {
				if(p[i].name.equals(pName)) {
					p[i].count += pCount;
				}
			}
		}
		
	}
	public void outputProduct() {	//출고
		System.out.print("출고할 상품명 입력>>");
		String pName = sc.nextLine();
		System.out.print("출고 수량 입력>>");
		int pCount = Integer.parseInt(sc.nextLine());
		if(pName == null) {
			
		}else {
			for(int i=0;i<p.length;i++) {
				if(p[i].name.equals(pName)) {
					p[i].count -= pCount;
				}
			}
		}
	}
	public void productInfo() {		//내용
		System.out.print("찾을 상품명 입력>>");
		String pName = sc.nextLine();		
		for(int i=0;i<p.length;i++) {
			if(p[i].name.equals(pName)) {
				System.out.println("등록된 전체 상품 종류: " + Product.productCount);
				System.out.println("상품 이름: " + p[i].name);
				System.out.println("상품 개수: " + p[i].count);
			}
		}
	}
	public void mainMenu() {
		System.out.println("1.입고 2.출고 3.재고내용확인 4.종료");
		select = Integer.parseInt(sc.nextLine());
	}
	public void play() {
		while(true) {
			mainMenu();
			init();
			if(select == 1) {
				inputProduct();
			}else if(select == 2) {
				outputProduct();
			}else if(select == 3){
				productInfo();
			}else if(select == 4){
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}


public class Java25_productProgram {

	public static void main(String[] args) {
		
		ProductManager pm = new ProductManager();
		pm.play();
		
	}

}
