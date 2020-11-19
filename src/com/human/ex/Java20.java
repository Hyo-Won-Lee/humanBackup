package com.human.ex;

class Circle1{
	public int radius = 0;
	public double area() {
		return 3.14*radius*radius;
	}
	public double around() {
		return 2*3.14*radius;
	}
	public Circle1() {}
	public Circle1(int radius) {
		this.radius = radius;
	}
}


class Sphere extends Circle1{
	public double volume() {
		return (area()*radius*4)/3;
	}
	public Sphere() {}
	public Sphere(int radius) {
		super(radius);
		this.radius = radius;
	}
}


public class Java20 {

	public static void main(String[] args) {
		Circle1 c = new Circle1(5);
		System.out.println(c.area());
		System.out.println(c.around());
		
		//구의 부피를 구하는 기능을 추가해보자.
		Sphere s = new Sphere(10);
		//s.radius = 10;
		System.out.println(s.volume());
	}

}
