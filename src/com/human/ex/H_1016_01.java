package com.human.ex;

import java.util.Scanner;

public class H_1016_01 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		int i=num.nextInt();
		switch(i) {
		case 5:
			System.out.println("최우수");
			break;
		case 4:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("보통");
			break;
		default:
			System.out.println("불합격");
			break;
		}

	}

}
