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
			System.out.println("������ �����ϴ�.");
		}else if(amount > numOfPapers) {
			System.out.print("��� ����Ϸ��� ������ "+(amount-numOfPapers)+"�� �����մϴ�.");
			System.out.println(numOfPapers+"�常 ����մϴ�.");
			numOfPapers-=numOfPapers;
		}else {
			numOfPapers-=amount;
			System.out.println(amount+"�� ����߽��ϴ�. ����"+numOfPapers+"�� ���� �ֽ��ϴ�.");
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
