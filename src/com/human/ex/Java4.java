package com.human.ex;

class Car{
	public String color="";
	public Tire tire=new Tire();
	public String manufac="";
	public String carModel="";
	public int maxSpeed=250;
}

class Tire{
	public String manufac="";
	public int value=0;
	public int totalKiloMeter=0;
}

public class Java4 {
	public static void main(String[] arge) {
		
		Car c1=new Car();
		c1.color="회색";
		c1.manufac="현대";
		c1.maxSpeed=250;
		c1.carModel="벤츠 E300";
		
		c1.tire.manufac="(주)천안";
		c1.tire.value=5000;
		c1.tire.totalKiloMeter=100000;
		
		System.out.println("차종 1번");
		System.out.println();
		
		System.out.println("색상: "+c1.color);
		System.out.println("제조사: "+c1.manufac);
		System.out.println("최고속도: "+c1.maxSpeed);
		System.out.println("차종: "+c1.carModel);
		System.out.println();
		
		System.out.println("<바퀴>");
		System.out.println("제조사: "+c1.tire.manufac);
		System.out.println("가격: "+c1.tire.value);
		System.out.println("주행거리정보: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");
		
		
		
		c1.color="검정색";
		c1.manufac="삼성";
		c1.maxSpeed=250;
		c1.carModel="그렌저";
		
		
		c1.tire.manufac="(주)삼성";
		c1.tire.value=6000;
		c1.tire.totalKiloMeter=5000;
		
		System.out.println();
		System.out.println("차종 2번");
		System.out.println();
		
		System.out.println("색상: "+c1.color);
		System.out.println("제조사: "+c1.manufac);
		System.out.println("최고속도: "+c1.maxSpeed);
		System.out.println("차종: "+c1.carModel);
		System.out.println();
		
		System.out.println("<바퀴>");
		System.out.println("제조사: "+c1.tire.manufac);
		System.out.println("가격: "+c1.tire.value);
		System.out.println("주행거리정보: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");
	
		
		
		c1.color="빨간색";
		c1.manufac="쉐보레";
		c1.maxSpeed=220;
		c1.carModel="마세라티";
		
		c1.tire.manufac="(주)금호";
		c1.tire.value=7000;
		c1.tire.totalKiloMeter=8000;
		
		System.out.println();
		System.out.println("차종 3번");
		System.out.println();
		
		System.out.println("색상: "+c1.color);
		System.out.println("제조사: "+c1.manufac);
		System.out.println("최고속도: "+c1.maxSpeed);
		System.out.println("차종: "+c1.carModel);
		System.out.println();
		
		System.out.println("<바퀴>");
		System.out.println("제조사: "+c1.tire.manufac);
		System.out.println("가격: "+c1.tire.value);
		System.out.println("주행거리정보: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");		
	}
}		
		


