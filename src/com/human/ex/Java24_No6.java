package com.human.ex;

class Vehicle{
	public String color;
	public int speed;
	public Vehicle() {}
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	public void show() {
		System.out.println("color : " + color + ", speed : " + speed);
	}
}


class Car3 extends Vehicle{
	public int displacemant;
	public int gears;
	public Car3() {}
	public Car3(String color, int speed, int displacemant, int gears) {
		super(color, speed);
		this.displacemant = displacemant;
		this.gears = gears;
	}
	public void show() {
		System.out.println("color : " + color + ", speed : " + speed +
				", displacement : " + displacemant + ", gears : " + gears);
	}	
}


public class Java24_No6 {

	public static void main(String[] args) {
		
		Car3 c = new Car3("ÆÄ¶û", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
		
	}

}
