package com.human.ex;

import java.util.Arrays;

public class Java006 {
	
//	//���ϰ��� ���� �Ű������� ���� �Լ�
//	public static void function1(){
//		System.out.println("�ȳ��ϼ���.");
//		//return; ���ϰ��� ������ ������ �� �ִ�.
//	}
//	
//	//���ϰ��� ���� �Ű������� �ִ� �Լ�
//	public static void function2(int a) {
//		System.out.println("�Լ� �Ű����� a����: "+a);
//		return; //���ϰ��� ������ ��������
//	}
//	
//	//�Ű������� ���� ���ϰ��� �ִ� �Լ�
//	public static int function3() {
//		int returnValue=10;
//		returnValue+=11;
//		return returnValue;
//	}
//	
//	//�Ű������� �ְ� ���ϰ��� �ִ� �Լ�
//	public static int function4(int a, int b, int c) {
//		int result=0;
//		result=a+b-c;
//		return result;
//	}
	
	
	//�迭�� �Ű������� ������ �Լ�
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
		System.out.println(Arrays.toString(rArr));  //����2  1���� ������ �迭�� ������
		
		
		
	}
}
