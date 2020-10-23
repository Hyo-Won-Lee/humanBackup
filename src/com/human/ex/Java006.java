package com.human.ex;

import java.util.Arrays;

public class Java006 {
	
//	//리턴값이 없고 매개변수도 없는 함수
//	public static void function1(){
//		System.out.println("안녕하세요.");
//		//return; 리턴값이 없으면 생략할 수 있다.
//	}
//	
//	//리턴값이 없고 매개변수가 있는 함수
//	public static void function2(int a) {
//		System.out.println("함수 매개변수 a값은: "+a);
//		return; //리턴값이 없으면 생략가능
//	}
//	
//	//매개변수가 없고 리턴값이 있는 함수
//	public static int function3() {
//		int returnValue=10;
//		returnValue+=11;
//		return returnValue;
//	}
//	
//	//매개변수가 있고 리턴값이 있는 함수
//	public static int function4(int a, int b, int c) {
//		int result=0;
//		result=a+b-c;
//		return result;
//	}
	
	
	//배열을 매개변수로 가지는 함수
	public static void function5(int a) {
		a=10;
	}
	
	public static int function6(int a) {
		a=10;
		return a;
	}

	public static void function7(int a[]) {
		a[0]=10;
	}
	
	public static int[] function8(int a[]) {
		a[0]=10;
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		
//		function1();
//		
//		function2(10);
//		
//		
//		int a=function3();
//		System.out.println(a);
//		
//		System.out.println(function3());
//		
//		
//		
//		int b=function4(1,2,3);
//		System.out.println(b);
//		
//		System.out.println(function4(3,4,5));
		
		
		int a=5;
		int arr[]= {1,2};
		
//		function5(a);
//		System.out.println(a);
//		
//		int rValue=function6(a);
//		System.out.println(a);
//		System.out.println(rValue);
//		
//		function7(arr);
//		System.out.println(Arrays.toString(arr));
		
		int rArr[]=function8(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));  //과제2  1개만 생성된 배열로 응용함
		
		
		
	}
}
