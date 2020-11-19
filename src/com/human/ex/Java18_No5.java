package com.human.ex;


class Complex{
	public double complexNum1 = 0.0;
	public double complexNum2 = 0.0;
	
	public Complex() {}
	
	public Complex(double complexNum1) {
		super();
		this.complexNum1 = complexNum1;
	}
	
	public Complex(double complexNum1, double complexNum2) {
		super();
		this.complexNum1 = complexNum1;
		this.complexNum2 = complexNum2;
	}
	public double getComplexNum1() {
		return complexNum1;
	}
	public void setComplexNum1(double complexNum1) {
		this.complexNum1 = complexNum1;
	}
	public double getComplexNum2() {
		return complexNum2;
	}
	public void setComplexNum2(double complexNum2) {
		this.complexNum2 = complexNum2;
	}
	public String print() {
		return (complexNum1+" + "+complexNum2+"i");
	}
	
}

public class Java18_No5 {

	public static void main(String[] args) {
		
		Complex c = new Complex(2.0);
		System.out.println(c.print());
		Complex c1 = new Complex(1.5, 2.5);
		System.out.println(c1.print());
		
	}

}
