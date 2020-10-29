package com.human.ex;

public class Java9 {

	public static void myFunction1(int a){
		for(int i=0;i<a;i++)
		System.out.println("안녕하세요.");
		
		myFunction2(a);
	}
	
	public static void myFunction2(int a) {
		for(int i=0;i<a;i++)
		System.out.println("반갑습니다.");
	}
	
	public static void myFunction3(int a) {
		for(int i=0;i<a;i++)
		System.out.println("테스트1");
	}
	
	public static void myFunction4(int a) {
		for(int i=0;i<a;i++)
		System.out.println("테스트2");
	}
	
	public static void main(String[] args) {
		
		myFunction1(3);
		myFunction3(3);
		myFunction4(3);
		
	}

	
	
	
	
}
