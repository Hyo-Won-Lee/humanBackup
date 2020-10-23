package com.human.ex;

public class H_1015_4 {

	public static void main(String[] args) {
		int a,b;
		a=3;
		b=6;
		System.out.println("("+a+","+b+")");
		
		while(a<8) {
			for(int i=0; i<1; i++) {
				for(int j=0; j<1; j++) {
					a++;
					b++;
					if(a%5==0) {
						System.out.println("("+a+","+b+")");
					}
					if(b%5==0) {
						System.out.println("("+a+","+b+")");
					}
				}
			}
		}
	}
}
