package com.human.ex;

class GolfClub{
	public Object number;
	public String name;
	
	public GolfClub() {
		super();
		this.number = 7;
		this.name = "���̾�";
	}
	public GolfClub(int number) {
		super();
		this.number = number;
		this.name = "���̾�";
	}
	public GolfClub(String name) {
		super();
		this.name = name;
	}
	public void print() {
		if(number != null) System.out.println(number+"�� "+name+"�Դϴ�.");
		else System.out.println(name+"�Դϴ�.");
	}
	
}

public class Java18_No6 {

	public static void main(String[] args) {
		
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();

		GolfClub g3 = new GolfClub("����");
		g3.print();
		
	}

}
