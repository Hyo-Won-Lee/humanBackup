package com.human.ex;

public class Java001 {
	public static void main(String[] args) {
		// 7~21������ ���� ���غ���.
		/*
		int sum=0;
		for(int i=7;i<22;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		sum=0;
		
		
		int i=7;
		while(i<22) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);*/
		
		
		
		
		//2. ���� 3���� �Է¹޾� ���������� ����غ���.
		/*
		int a=10;
		int b=99;
		int c=56;
		boolean isA=false;
		boolean isB=false;
		boolean isC=false;
		//��ȯ ���� ���
		if(a>b) {
			if(b>c) {
				isC=true;
				System.out.println(c);
			}else {
				isB=true;
				System.out.println(b);
			}
		}else {
			if(a>c) {
				isC=true;
				System.out.println(c);
			}else {
				isA=true;
				System.out.println(a);
			}
		}   //���� ���� �� ����
		
		
		if(isA==true) {
			if(b>c) {
				System.out.println(c);
				System.out.println(b);
			}else {
				System.out.println(b);
				System.out.println(c);
			}
		}else if(isB==true) {
			if(a>c) {
				System.out.println(c);
				System.out.println(a);
			}else {
				System.out.println(a);
				System.out.println(c);
			}
		}else {
			if(a>b) {
				System.out.println(b);
				System.out.println(a);
			}else {
				System.out.println(a);
				System.out.println(b);
			}
		}   //�� ���� ���� �� ����
		*/
		/*
		int a=3;
		int b=22;
		int c=1;
		
		if(a>b) {
			int t;	t=a;	a=b;	b=t;
		}
		if(b>c) {
			int t; 	t=b;	b=c;	c=t;
		}
		if(a>b) {
			int t;	t=a;	a=b;	b=t;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		
		/*�����
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");//3 2 1 0
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");//1 2 3 4
			}
			System.out.print("\n");
		}*/
		
		//(3,6) (5,8) (7,10)�� 2�� for���� while������
		/*
		int countJ=0;
		for(int j=3;j<=7;j=j+2) {
			countJ++;
			int countI=0;
			for(int i=6;i<=10;i=i+2) {
				countI++;
				if(countJ==countI) {
					System.out.println(j+":"+i);
				}
			}
		}*/
		
		//5. 10��¥�� �迭�� 3�� ����� �ְ� �迭�� ����ִ� �� �� 2�� ����� ���
		/*
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i*3;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}*/
		/*
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i*3;
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}*/
		
		
		
		//10/20�� ����
		//Math.random();�� �������� ����� �Լ�
		//'0<=Math.random()<1'�� ���� ����Ѵ�.
		//Math.random()�� �Ǽ��̹Ƿ� int�� ����ȯ�ϸ� ������ ���� �� �ִ�.
		//���ϴ� ���� ������ ���ϱ⸦ ���ؼ� �����, ���� ���� ��ġ�� ���ϱ⸦
		//�̿��ؼ� ����� �ȴ�. 
		
	
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
}