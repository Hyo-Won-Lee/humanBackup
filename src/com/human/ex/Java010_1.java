package com.human.ex;

import java.util.Scanner;

class Rectangle{	//붕어빵 틀을 만든 것.	
	public static double unit=100;
	private double height=20;
	private double width=40;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<0) {
			height = 0;
		}
		this.height=height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double periphery() {
		return ((2*height)+(2*width));
	}	
	public static double area(double height,double width) {	//static붙은 애들은 객체 생성없이 사용해도 된다. 고정 값들은 static으로 선언한다.
//		this.height=height;
//		this.width=width;
//		return this.height*this.width;
		return height*width*unit;
	}
	public double area() {
		return (height*width);
	}
	public Rectangle() {}	//안써도 동작하지만 쓰자
	public Rectangle(double width) {
		this(width,width);	//첫 번째 줄에 써야 한다.
//		this.width=width;
//		this.height=height;
	}
	public Rectangle(double height, double width) {
		super();	//부모에 있는 생성자를 호출
		this.height = height;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]"+this.area();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area());
		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(height);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(width);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if(this.area()!=other.area()) {
			return false;
		}
//		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
//			return false;
//		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
//			return false;
		return true;
	}
}

class Triangle{
	public double width=10;
	public double height=20;
	public double area() {
		return ((width*height)/2);
	}
}

class Circle{
	public double radius=10;
	public double area() {
		return (3.14*radius*radius);
	}
	public double periphery() {
		return (2*3.14*radius);
	}
}

public class Java010_1 {
	
	public static void main(String[] args) {	//class에서는 변수를 field라고 한다.
//		Rectangle.unit=100;
		System.out.println(Rectangle.area(40, 10));
//		Rectangle r1=new Rectangle();
//		Rectangle r1=new Rectangle(40);
		
//		Rectangle r2=new Rectangle();
//		Rectangle r2=new Rectangle(40,40);
		Rectangle r1=new Rectangle(40,30);
		Rectangle r2=new Rectangle(40,30);
		System.out.println(r1.equals(r2));
		
//		r1.height=-30;	r1.width=40;
		r1.setHeight(50);
		System.out.println(r1.getHeight());
		System.out.println(r1);
//		System.out.println(r1.area());
//		System.out.println(r1.periphery());
		
//		r2.height=40;	r2.width=40;
//		System.out.println(r2.area());
//		System.out.println(r2.periphery());
//		System.out.println(r1);
		
		//삼각형, 원 클래스를 만들어보자.
//		Triangle t1=new Triangle();
//		t1.width=20;	t1.height=30;
//		System.out.println("삼각형의 넓이 : "+t1.area());
//		
//		Circle c1=new Circle();
//		c1.radius=30;
//		System.out.println("원의 넓이 : "+c1.area());
//		System.out.println("원의 지름 : "+c1.periphery());
		
		
//		직사각형 넓이 둘레를 구하는 프로그램을 만들어보자.
//		height=40;
//		width=50;
//		System.out.println(area());
//		System.out.println(periphery());
		
	}

}
