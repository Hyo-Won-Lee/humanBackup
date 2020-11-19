package com.human.ex;

class Circle2{
	public int radius;
	public Circle2() {}
	public Circle2(int radius) {
		this.radius = radius;
	}
	public void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}


class ColoredCircle extends Circle2{
	public String color;
	public ColoredCircle() {}
	public ColoredCircle(int radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}
}


public class Java24_No1 {

	public static void main(String[] args) {

		Circle2 c = new Circle2(5);
		ColoredCircle cc = new ColoredCircle(10,"빨간색");
		c.show();
		cc.show();
		
	}

}
