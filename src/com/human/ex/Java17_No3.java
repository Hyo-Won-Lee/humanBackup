package com.human.ex;

class Car2{
	public static int numOfCar = 10;
	public static int numOfRedCar = 5;
	public String carColor="";
	
	public static int getNumOfCar() {
		return numOfCar;
	}
	public void setNumOfCar(int numOfCar) {
		this.numOfCar = numOfCar;
	}
	public static int getNumOfRedCar() {
		return numOfRedCar;
	}
	public void setNumOfRedCar(int numOfRedCar) {
		this.numOfRedCar = numOfRedCar;
	}
	public Car2() {}
	public Car2(String carColor) {
		super();
		this.carColor = carColor;
	}
	
}

public class Java17_No3 {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2("red");
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car2.getNumOfCar(), Car2.getNumOfRedCar());

	}

}
