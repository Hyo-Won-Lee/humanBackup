package com.human.ex;

class Animal{
	public static void displayName(Animal a) {
		a.getName();
		a.move();
	}
//	public static void displayName(Human a) {
//		a.getName();
//		a.move();
//	}
//	
//	public static void displayName(Eagle a) {
//		a.getName();
//		a.move();
//	}
//	
//	public static void displayName(Tiger a) {
//		a.getName();
//		a.move();
//	}
	
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	public Animal() {}
	public void getName() {
		System.out.println(name);
	}
	public void eat() {
		System.out.println("�Դ´�.");
	}
	public void move() {
		System.out.println("�����δ�.");
	}
	
}


class Human extends Animal{
	
	public Human() {};
	public Human(String name) {
		super(name);
	}
	@Override	//�ǹ� : �������ִ� �޼ҵ带 �������ض�. �̰��� ������ �ؿ� �޼ҵ� �̸��� �ٲ� ������ �ȳ���.
	public void move() {	//������ override
		//@ ������̼� Spring������ ������̼����� ���α׷���
		System.out.println("�ȴ´�.");
	}
	public void read() {
		System.out.println("å�� �д´�.");
	}
	
}


class Tiger extends Animal{
	
	public Tiger(String name) {
		super(name);
	}
	public void move() {	//�������� �� ������ ����!
		System.out.println("�� �߷� �پ�ٴ�");
	}
	public void hunting() {
		System.out.println("�����");
	}
	
}


class Eagle extends Animal{
	
	public Eagle(String name) {
		super(name);
	}
	public void move() {
		System.out.println("����ٴ�");
	}
	
}


public class Java012 {

	public static void main(String[] args) {
		
//		Animal a = new Animal("cat1");
//		a.getName();
//		a.move();
//		a.eat();
//		a.read();
//		a.hunting();
//		Human h = new Human("ȫ�浿");
//		h.getName();
//		h.move();	//�ڽ� human��
//		h.eat();
//		h.read();
//		h.hunting();
		//������ : �θ� �ڽ��� ���� �� �ִ�.
		//��� ȣ���� �������� �ϳ��� �迭�� �־ ����غ���.
		//?
	Animal a0 = new Animal("ȫ�浿0");
	Animal a1 = new Human("ȫ�浿1");
	Animal a2 = new Tiger("ȫ�浿2");
	Animal a3 = new Eagle("ȫ�浿3");
	//new Animal�� ��쿡�� �Ʒ� 3������ ��� Animal���·δ� 
	//�Ʒ��� 3������ ��°����ϴ�. ����ȯ�Ͽ��� ����� �� ����.
	//a0.eat();
	//a0.getName();
	//a0.move();
	//a0.read();
	//((Human)a0).read();	�Ұ���
	//new Human�� ��� �Ʒ� 3���� ���
	//a1.eat();
	//a1.getName();
	//a1.move();	//AnimalŬ���������� ����ִ� ��ü�� �����ǵ� move�� human�� move�� ����ȴ�.
	//a1.read(); //������ ���� ������ �θ� ���ؼ� ����� �� ����.
	//((Human)a1).read();//����ȯ�ϸ� ���� �����ϴ�.
	
	//overload : �޼ҵ� �̸��� ������ �Ű������� �ٸ� �޼ҵ�
	//override : ����� ���ؼ� �����ǵ� �޼ҵ�
	
	//�θ�Ŭ������ �ڽ�Ŭ������ ���� �ν��Ͻ�����
	//�⺻������ �θ� �ִ� �޼ҵ峪 �ʵ忡 �����Ѵ�.
	//���������� override�� �޼ҵ�� �ڽ� �޼ҵ尡 ��µȴ�.
	//�ڽĿ� �ִ� �޼ҵ带 �����ų �� ����. �����Ű�� ������ ����ȯ�� ���ؼ� ������ Ŭ������ ��ȯ���Ѿ� �Ѵ�.
	
	//human,eagle,tiger Ŭ�������� �ϳ��� �迭�� �־ ó���ϴ� ���
	//�������� �̿��ؼ� ó���Ѵ�.
	Animal[] arr = new Animal[4];
	arr[0]=a0;arr[1]=a1;arr[2]=a2;arr[3]=a3;
	
//	for(Animal ani:arr) {
//		ani.move();
//	}
	//������ �Ű������� �޾Ƽ� name�� ����ϴ� �Լ��� ������.
//	Animal.displayName(a0);
//	Animal.displayName(a1);
//	Animal.displayName(a2);
//	Animal.displayName(a3);
//	
	
	
	
	}

}
