package com.human.ex;

class Parent{
	public String name = "영조";
	public Parent() {}
	public void print() {
		System.out.println(name);
	}
}

class Child extends Parent{
	public String name = "사도세자";
	public Child() {}
	public void print() {
		System.out.println("나는 " + name + "이다.");
	}
}


public class Java24_No4 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
		
	}

}
