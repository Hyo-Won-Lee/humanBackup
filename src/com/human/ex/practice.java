package com.human.ex;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(">>");
		int num=Integer.parseInt(sc.nextLine());
		int cCount=0,dCount=0,lCount=0,tCount=0;
		System.out.println("<"+num+"ȸ �ݺ� �մϴ�.");
		
		for(int i=1;i<=num;i++) {
			System.out.print(i+".");
			if(i%3==0) {
				System.out.print("cat");
				cCount++;
			}
			if(i%4==0) {
				System.out.print("dog");
				dCount++;
			}
			if(i%5==0) {
				System.out.print("lion");
				lCount++;
			}
			if(i%8==0) {
				System.out.print("tiger");
				tCount++;
			}
			System.out.println();
		}
		
		System.out.println("<Animal Count List>");
		System.out.println("cat: "+cCount+"ȸ");
		System.out.println("dog: "+dCount+"ȸ");
		System.out.println("lion: "+lCount+"ȸ");
		System.out.println("tiger: "+tCount+"ȸ");
		
		
		
	}
}

