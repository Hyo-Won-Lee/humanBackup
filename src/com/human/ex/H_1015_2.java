package com.human.ex;

import java.util.Scanner;

public class H_1015_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		int d;
		System.out.println("���� 3���� �Է��ϼ���.");
		System.out.print("ù��° ���ڸ� �Է��ϼ���:: ");
		a=input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:: ");
		b=input.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���:: ");
		c=input.nextInt();
		
		if(a>b) {
			d=a; a=b; b=d;
		}
		if(a>c) {
			d=a; a=c; c=d;
		}
		if(b>c) {
			d=b; b=c; c=d;
		}
		System.out.printf("%d %d %d\n",a,b,c);
		System.out.println("����");
	}
}
