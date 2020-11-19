package com.human.ex;

interface Animal2{
	
	abstract public void leg();
	abstract public void move();
	abstract public void wing();
	
}

class Cat1 implements Animal2{
	
	public void leg() {
		System.out.println("����̴� �� ���� ������ �ִ�.");
	}
	public void move() {
		System.out.println("����̴� �� �߷� �����δ�.");
	}
	public void wing() {
		System.out.println("����̴� ������ ����.");
	}

}

class Bird implements Animal2{
	
	public void leg() {
		System.out.println("���� �� ���� ���� ������ �ִ�.");
	}
	public void move() {
		System.out.println("���� �� �߷� ����.");
	}
	public void wing() {
		System.out.println("���� �� ���� ������ �ִ�.");
	}
}

public class Java27 {

	public static void main(String[] args) {
		
		Animal2 am0 = new Cat1();
		Animal2 am1 = new Bird();
		
		Animal2 animal[] = {am0, am1};
		
		for(int i=0;i<animal.length;i++) {
			animal[i].leg();
			animal[i].move();
			animal[i].wing();
			System.out.println();
		}

	}

}
