package com.human.ex;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		int[] num=new int[5];
		int max, min;
		Scanner sc=new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오.");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		max=num[0];
		min=num[0];
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
}
