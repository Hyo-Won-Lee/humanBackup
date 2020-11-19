package com.human.ex;

class Man{
	
	public int age=40;
	public int childCount=3;
	public String name="James";
	public boolean isMarried=true;
	public String isMarried2="";
	public String isMarried() {
		if(isMarried == true) isMarried2 = "Married";
		else isMarried2 = "Single";
		return isMarried2;
	}
	public Man(int age, int childCount, String name, boolean isMarried) {
		super();
		this.age = age;
		this.childCount = childCount;
		this.name = name;
		this.isMarried = isMarried;
	}
	public Man() {}
	@Override
	public String toString() {
		return "이 사람의 나이: " + age +
				"\n이 사람의 이름: " + name +
				"\n이 사람의 결혼 여부: " + isMarried() +
				"\n이 사람의 자녀 수: " + childCount;
	}
	
}


public class Java15_No1 {

	public static void main(String[] args) {
		Man m=new Man();
		System.out.println(m);

	}

}
