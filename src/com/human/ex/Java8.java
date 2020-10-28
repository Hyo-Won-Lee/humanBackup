package com.human.ex;

public class Java8 {

	public static void main(String[] args) {
		//배열
		//32page~
		
		//1번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a[]=new int[5];
		System.out.println("숫자 입력(5번)>>");
		for(int k=0;k<5;k++) {
			int i=Integer.parseInt(sc.nextLine());
				a[k]=i;
		}
		System.out.print(">>");
		int j=Integer.parseInt(sc.nextLine());
		for(int k=0;k<5;k++) {
			if(a[k]==j) {
				System.out.println("a["+k+"]"+"번째 인덱스에 들어있습니다.");
			}
		}*/
		
		//2번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		char a[]=new char[5];
		System.out.println("문자 입력(5번)>>");
		for(int k=0;k<5;k++) {
			char i=sc.nextLine().charAt(0);
				a[k]=i;
		}
		System.out.print(">>");
		char j=sc.nextLine().charAt(0);
		for(int k=0;k<5;k++) {
			if(a[k]==j) {
				System.out.println("a["+k+"]"+"번째 인덱스에 들어있습니다.");
			}
		}*/
		
		//3번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(">>");
		int i=Integer.parseInt(sc.nextLine());
		int a[]=new int[i];
		for(int j=0,k=1;j<i;j++,k++) {
			a[j]=k;
			if(k==3)
				k=0;
		}
		for(int j=0;j<i;j++) {
			System.out.println(a[j]);
		}*/
		
		//4번
		//정순
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("숫자 입력(5번)>>");
		int a[]= new int[5];
		for(int k=0;k<5;k++) {
			int i=Integer.parseInt(sc.nextLine());
				a[k]=i;
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=4;i>=0;i--) {
			System.out.print(a[i]+",");
		}*/
		
		//역순
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("숫자 입력(5번)>>");
		int a[]= new int[5];
		for(int k=0;k<5;k++) {
			int i=Integer.parseInt(sc.nextLine());
				a[k]=i;
		}
		for(int i=4;i>=0;i--) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+",");
		}*/
		
		//5번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("이동방향>>");
		String str=sc.nextLine();
		System.out.println("이동 칸 수>>");
		int i=Integer.parseInt(sc.nextLine());
		System.out.println("채울 숫자>>");
		int j=Integer.parseInt(sc.nextLine());
		if(str.equals("왼쪽")) {
			for(int l=0;l<i;l++) {
				for(int k=0;k<8;k++) {
					a[k]=a[k+1];
				}
			}
			for(int k=9-i;k<9;k++) {
				a[k]=j;
			}
			for(int k=0;k<9;k++) {
				System.out.print(a[k]+",");
			}
		}else {
			for(int l=0;l<i;l++) {
				for(int k=8;k>0;k--) {
					a[k]=a[k-1];
				}
			}
			for(int k=0;k<i;k++) {
				a[k]=j;
			}
			for(int k=0;k<9;k++) {
				System.out.print(a[k]+",");
			}
		}*/
		
		//6번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("회전방향>>");
		String str=sc.nextLine();
		System.out.println("횟수>>");
		int i=Integer.parseInt(sc.nextLine());
		if(str.equals("왼쪽")) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<8;k++) {
					a[k]=a[k+1];
				}		
			}
			for(int k=0,l=1;k<i;k++,l++) {
				a[k+(9-i)]=l;
			}
			for(int k=0;k<9;k++) {
				System.out.print(a[k]+",");
			}
		}else if(str.equals("오른쪽")) {
			for(int j=0;j<i;j++) {
				for(int k=8;k>0;k--) {
					a[k]=a[k-1];
				}		
			}
			for(int k=0,l=(9+1)-i;k<i;k++,l++) {
				a[k]=l;
			}
			for(int k=0;k<9;k++) {
				System.out.print(a[k]+",");
			}
		}*/
		
		//7번
		int a[]=new int[100];
		for(int i=0,count=0;i<100;i++,count++) {
			a[i]=count;
		}
		for(int k=2;k<=50;k++) {
			for(int i=0;i<100;i++) {
				if(i==k) {
					continue;
				}
				if(a[i]%k==0) {
					a[a[i]]=a[i];
				}else {
					a[i]=0;
				}
			}
		}
		for(int i=0;i<100;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
