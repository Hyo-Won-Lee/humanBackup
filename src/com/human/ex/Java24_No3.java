package com.human.ex;

class Point{
	private int x;
	private int y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void toString1() {
		System.out.println("ÁÂÇ¥ [x : " + x + ", y : " + y + "]");
	}
}

class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	public MovablePoint() {}
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void toString1() {
		System.out.print("ÁÂÇ¥ [x : " + getX() + ", y : " + getY() + "], ");
		System.out.println("ÀÌµ¿¼Óµµ [xSpeed : " + xSpeed + ", ySpeed : " + ySpeed + "]");
	}
}


public class Java24_No3 {

	public static void main(String[] args) {
		
		Point p = new Point(3,5);
		MovablePoint m = new MovablePoint(3,5,10,50);
		p.toString1();
		m.toString1();

	}

}
