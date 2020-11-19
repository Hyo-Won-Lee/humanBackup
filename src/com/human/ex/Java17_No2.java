package com.human.ex;


class Triangle1{
	
	public double width = 0.0;
	public double height = 0.0;
	public double findArea() {
		return (width*height)/2;
	}
	public Triangle1(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public boolean isSameArea(Triangle1 t) {
		double t1Area = findArea();
		double t2Area = t.findArea();
		if(t1Area == t2Area) return true;
		else return false;
	}

}


public class Java17_No2 {

	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1(10.0, 5.0);
		Triangle1 t2 = new Triangle1(5.0, 10.0);
		Triangle1 t3 = new Triangle1(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t2.isSameArea(t3));
	}

}
