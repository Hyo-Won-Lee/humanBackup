package com.human.ex;

interface Animal2{
	
	abstract public void leg();
	abstract public void move();
	abstract public void wing();
	
}

class Cat1 implements Animal2{
	
	public void leg() {
		System.out.println("고양이는 네 발을 가지고 있다.");
	}
	public void move() {
		System.out.println("고양이는 네 발로 움직인다.");
	}
	public void wing() {
		System.out.println("고양이는 날개가 없다.");
	}

}

class Bird implements Animal2{
	
	public void leg() {
		System.out.println("새는 두 개의 발을 가지고 있다.");
	}
	public void move() {
		System.out.println("새는 두 발로 난다.");
	}
	public void wing() {
		System.out.println("새는 두 개의 날개가 있다.");
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
