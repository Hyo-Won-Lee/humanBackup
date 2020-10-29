package com.human.ex;

public class Java005 {
	
		//함수
		public static int sum(int a,int b) {
			int sum=0;
			sum=a+b;
			return sum;
		}
	
		public static int min(int a,int b) {
			int min=0;
			min=a-b;
			return min;
		}
	
		public static int mul(int a,int b) {
			int mul=0;
			mul=a*b;
			return mul;
		}
		
		public static int div(int a,int b) {
			int div=0;
			div=a/b;
			return div;
		}
	
	public static void main(String[] args) {
		
//		int a[]= {0,1,2,3};
//		int b[];
//		b=a;
//		b[1]=10;
//		System.out.println(a[1]);
		//공유되서 10이나온다.
		//a 0,1,2,3
		//b 0,10,2,3
		
		
		
//		int a[]= {0,1,2,3};
//		int b[]=new int[4];
//		b=a;
//		b[1]=10;
//		System.out.println(a[1]);
//		//a 0,10,2,3
//		//c 0,10,2,3
//		
//		//고유돼서 10이 나온다.
//		//a 0,1,2,3
//		//c 0,10,2,3
//		
//		int c[]=new int[4];
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}
//		c[1]=20;
//		System.out.println(a[1]);
//	
//		for(int i=0;i<c.length;i++) {
//			System.out.print(c[i]);
//		}
		
		
		
//		Human arr1[]=new Human[2];
//		arr1[0]=new Human("홍길동",10,155.5);
//		arr1[1]=new Human("홍길동",10,155.5);
//		Human arr2[]=arr1;
//		Human arr3[]=new Human[2];
//		for(int i=0;i<arr3.length;i++) {
//			arr3[i]=arr2[i];
//		}
//		//홍길동 나이 10을 20으로 변경해보세요.
//		arr1[1].age=20;
//		System.out.println(arr1[1].age); //20
//		System.out.println(arr2[1].age); //20
//		System.out.println(arr3[1].age); //20
		
		
//		Human arr1[]=new Human[2];
//		arr1[0]=new Human("홍길동",10,155.5);
//		arr1[1]=new Human("홍길동",10,155.5);
//		Human arr2[]=arr1;
//		Human arr3[]=new Human[2];
//		for(int i=0;i<arr3.length;i++) {
//			arr3[i]=arr2[i];
//		}
//		//arr1과 arr3가 다른 값을 가질 수 있도록 설계해보자.
//		for(int i=0;i<arr1.length;i++) {
//			arr3[i]=new Human();
//			arr3[i].name=arr1[i].name;
//			arr3[i].age=arr1[i].age;
//			arr3[i].height=arr1[i].height;
//		}
//		arr3[1].age=99;
//		//arr1[1].age arr3[1].age은 서로 다른값을 가지게 된다.
//		System.out.println(arr1[1].age); //20
//		System.out.println(arr2[1].age); //20
//		System.out.println(arr3[1].age); //20                  //과제1
		
		
//		Human arr1[]=new Human[2];
//		arr1[0]=new Human("홍길동",10,155.5);
//		arr1[1]=new Human("홍길동",10,155.5);
//		Human arr2[]=arr1;
//		Human arr3[]=new Human[2];
//		
//		Human arr4[]=new Human[2];
//		arr4[0]=new Human("홍길동",10,155.5);
//		arr4[1]=new Human("홍길동",10,155.5);
//		
//		for(int i=0;i<arr3.length;i++) {
//			arr3[i]=arr4[i];
//		}
//		arr3[1].age=20;
//		//arr1과 arr3가 다른 값을 가질 수 있도록 설계해보자.
//		System.out.println(arr1[1].age); //20
//		System.out.println(arr2[1].age); //20
//		System.out.println(arr3[1].age); //20
		
		
		
//		int i=sum(10,20);
//		int j=min(5,3);
//		int k=mul(8,6);
//		int l=div(8,2);
//		
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		System.out.println(l);
		

		
		
		
		

		
	}
}
