package com.human.ex;

public class H_1015_3 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
				for(int j=0; j<4-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<i; k++) {
					System.out.print("*");
				}
				System.out.println("");
		}
	}

}
