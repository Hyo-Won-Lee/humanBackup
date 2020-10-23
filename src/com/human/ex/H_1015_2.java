package com.human.ex;

import java.util.Scanner;

public class H_1015_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		int d;
		System.out.println("숫자 3개를 입력하세요.");
		System.out.print("첫번째 숫자를 입력하세요:: ");
		a=input.nextInt();
		System.out.print("두번째 숫자를 입력하세요:: ");
		b=input.nextInt();
		System.out.print("세번째 숫자를 입력하세요:: ");
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
		System.out.println("종료");
	}
}
