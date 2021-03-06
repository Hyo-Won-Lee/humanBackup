package com.human.ex;

class Line{
	
	public int length = 0;
	
	public boolean isSameLine(Line l) {
		int aLength = length;
		int bLength = l.length;
		if(aLength == bLength) return true;
		else return false;
	}
	public Line() {}
	public Line(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}


public class Java17_No4 {

	public static void main(String[] args) {
		
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);

	}

}
