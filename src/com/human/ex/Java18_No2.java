package com.human.ex;

class Sklass{
	static int i;
	Sklass(){
		i++;
	}
}

class Oklass{
	int i;
	Oklass(){
		i++;
	}
}


public class Java18_No2 {

	public static void main(String[] args) {
		
		new Sklass(); new Sklass(); Sklass s = new Sklass();
		new Oklass(); new Oklass(); Oklass o = new Oklass();
		System.out.printf("s.i = %d, o.i = %d",s.i, o.i);
	

	}

}
