package com.human.ex;

class Dice{
	
	public int face;
	public int roll() {
		face=(int)(Math.random()*6)+1;
		return face;
	}
	
}

public class Java18_No7 {

	public static void main(String[] args) {
		
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());

	}

}
