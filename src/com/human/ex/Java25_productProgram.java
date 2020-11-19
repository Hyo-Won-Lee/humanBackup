package com.human.ex;

class Product{
	public static int productCount;	//��� ��ǰ ����
	public String name;			//��ǰ��
	public int count;			//������
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
	
	//���� ��ǰ ���
	Product p0 = new Product("tv",1000); 
	Product p1 = new Product("camera",500);
	Product p2 = new Product("refrigerator",100);
	Product p3 = new Product("airConditioner",800);
	Product p4 = new Product("cleaner",300);
	
	public void init() {
		p[0]=p0;p[1]=p1;p[2]=p2;p[3]=p3;p[4]=p4;
	}
	public void inputProduct() {	//�԰�
		System.out.print("�԰��� ��ǰ�� �Է�>>");
		String pName = sc.nextLine();
		System.out.print("�԰� ���� �Է�>>");
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
	public void outputProduct() {	//���
		System.out.print("����� ��ǰ�� �Է�>>");
		String pName = sc.nextLine();
		System.out.print("��� ���� �Է�>>");
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
	public void productInfo() {		//����
		System.out.print("ã�� ��ǰ�� �Է�>>");
		String pName = sc.nextLine();		
		for(int i=0;i<p.length;i++) {
			if(p[i].name.equals(pName)) {
				System.out.println("��ϵ� ��ü ��ǰ ����: " + Product.productCount);
				System.out.println("��ǰ �̸�: " + p[i].name);
				System.out.println("��ǰ ����: " + p[i].count);
			}
		}
	}
	public void mainMenu() {
		System.out.println("1.�԰� 2.��� 3.�����Ȯ�� 4.����");
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
				System.out.println("���α׷� ����");
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
