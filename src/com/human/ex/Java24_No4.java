package com.human.ex;

class Parent{
	public String name = "����";
	public Parent() {}
	public void print() {
		System.out.println(name);
	}
}

class Child extends Parent{
	public String name = "�絵����";
	public Child() {}
	public void print() {
		System.out.println("���� " + name + "�̴�.");
	}
}


public class Java24_No4 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
		
	}

}
