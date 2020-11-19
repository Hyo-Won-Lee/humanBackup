package com.human.ex;

class Rectangle1{	//class Rectangle1 extends Object�� ����. ��� Ŭ������ ObjectŬ������ ����Ѵ�.
	
	public double width = 0;
	public double height = 0;
	public double area() {
		return width*height;
	}
	public double around() {
		return width*2+height*2;
	}
	public Rectangle1() {}	//�⺻�����ڸ� �� ������
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
		super(width,height);	//�ݵ�� �� ù�ٿ� �ۼ��ؾ��Ѵ�. �߰��� ���ԵǸ� �����߻�!
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
		
		//�簢����� ���̸� ���ϴ� ����� �߰��غ���.
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
