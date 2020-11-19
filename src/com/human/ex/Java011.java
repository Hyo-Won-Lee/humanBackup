package com.human.ex;

class Rectangle1{	//class Rectangle1 extends Object와 같다. 모든 클래스는 Object클래스를 상속한다.
	
	public double width = 0;
	public double height = 0;
	public double area() {
		return width*height;
	}
	public double around() {
		return width*2+height*2;
	}
	public Rectangle1() {}	//기본생성자를 꼭 만들자
	public Rectangle1(double width, double height) {
		super();	
		this.width = width;
		this.height = height;
	}
	
}


class RectanglePillar extends Rectangle1{
	
	public double pillar = 0;
	public double volume() {
		return area()*pillar;
	}
	public RectanglePillar() {}
	public RectanglePillar(double width, double height, double pillar) {
		super(width,height);	//반드시 맨 첫줄에 작성해야한다. 중간에 쓰게되면 에러발생!
		//this.width = width;
		//this.height = height;
		super.width = width;
		super.height = height;
		
		this.pillar = pillar;
	}
	
}

public class Java011 {
	
	public static void main(String[] args) {
	
		Rectangle1 re = new Rectangle1(10,30);
		System.out.println(re.area());
		System.out.println(re.around());
		
		//사각기둥의 넓이를 구하는 기능을 추가해보자.
		RectanglePillar rp = new RectanglePillar();
		rp.height = 10;
		rp.width = 30;
		System.out.println(rp.area());
		System.out.println(rp.around());
		
		RectanglePillar rp1 = new RectanglePillar(10,20,30);
		System.out.println(rp1.area());
		System.out.println(rp1.around());
		System.out.println(rp1.volume());
		
	}
	
}
