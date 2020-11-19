package com.human.ex;

class Printer{
	public int numOfPapers = 0;
	public int totalPapers = 0;
	public int amount = 0;
	
	public void print(int amount) {
		 totalPapers-=amount;
		 numOfPapers=totalPapers;
	}
}


public class Java16_No1 {
	public static void main(String[] args) {
		Printer p=new Printer();
		p.totalPapers = 100;
		p.print(70);
		System.out.println(p.numOfPapers);
	}
}