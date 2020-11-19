package com.human.ex;

class GolfClub{
	public Object number;
	public String name;
	
	public GolfClub() {
		super();
		this.number = 7;
		this.name = "아이언";
	}
	public GolfClub(int number) {
		super();
		this.number = number;
		this.name = "아이언";
	}
	public GolfClub(String name) {
		super();
		this.name = name;
	}
	public void print() {
		if(number != null) System.out.println(number+"번 "+name+"입니다.");
		else System.out.println(name+"입니다.");
	}
	
}

public class Java18_No6 {

	public static void main(String[] args) {
		
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();

		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
		
	}

}
