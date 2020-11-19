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
			System.out.print("������� " + duplexNumOfPapers + "�� ����߽��ϴ�.");
			System.out.println(" ���� " + numOfPapers + "�� ���� �ֽ��ϴ�.");
		}else {
			if(amount > numOfPapers) {
				System.out.print("�ܸ����� ��� ����Ϸ��� ������ " + (amount-numOfPapers) + "�� �����մϴ�. ");
				System.out.println(numOfPapers + "�常 ����մϴ�.");
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
