package com.human.ex;

class Printer3{
	private int numOfPapers;
	private boolean duplex;
	public int amount;
	public int duplexNumOfPapers;
	
	public Printer3() {}
	public Printer3(int numOfPapers, boolean duplex) {
		super();
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if(duplex == true) {
			duplexNumOfPapers = (int)Math.round(25/2+0.5);
			numOfPapers -= duplexNumOfPapers;
			System.out.print("양면으로 " + duplexNumOfPapers + "장 출력했습니다.");
			System.out.println(" 현재 " + numOfPapers + "장 남아 있습니다.");
		}else {
			if(amount > numOfPapers) {
				System.out.print("단면으로 모두 출력하려면 용지가 " + (amount-numOfPapers) + "매 부족합니다. ");
				System.out.println(numOfPapers + "장만 출력합니다.");
			}
		}
	}
	public boolean getDuplex() {
		return duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
}

public class Java16_No3 {

	public static void main(String[] args) {
		
		Printer3 p = new Printer3(20,true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);

	}

}
