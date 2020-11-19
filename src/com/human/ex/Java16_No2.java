package com.human.ex;

class Printer2{
	private int numOfPapers;
	public int amount;
	
	public Printer2() {}
	public Printer2(int numOfPapers) {
		super();
		this.numOfPapers = numOfPapers;
	}
	public int getNumOfPapers() {
		return numOfPapers;
	}
	public void setNumOfPapers(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}
	public void print(int amount) {
		
		if(numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		}else if(amount > numOfPapers) {
			System.out.print("모두 출력하려면 용지가 "+(amount-numOfPapers)+"매 부족합니다.");
			System.out.println(numOfPapers+"장만 출력합니다.");
			numOfPapers-=numOfPapers;
		}else {
			numOfPapers-=amount;
			System.out.println(amount+"장 출력했습니다. 현재"+numOfPapers+"장 남아 있습니다.");
		}
	}
}

public class Java16_No2 {
	public static void main(String[] args) {
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}
}
