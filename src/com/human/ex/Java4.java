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
		c1.color="ȸ��";
		c1.manufac="����";
		c1.maxSpeed=250;
		c1.carModel="���� E300";
		
		c1.tire.manufac="(��)õ��";
		c1.tire.value=5000;
		c1.tire.totalKiloMeter=100000;
		
		System.out.println("���� 1��");
		System.out.println();
		
		System.out.println("����: "+c1.color);
		System.out.println("������: "+c1.manufac);
		System.out.println("�ְ�ӵ�: "+c1.maxSpeed);
		System.out.println("����: "+c1.carModel);
		System.out.println();
		
		System.out.println("<����>");
		System.out.println("������: "+c1.tire.manufac);
		System.out.println("����: "+c1.tire.value);
		System.out.println("����Ÿ�����: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");
		
		
		
		c1.color="������";
		c1.manufac="�Ｚ";
		c1.maxSpeed=250;
		c1.carModel="�׷���";
		
		
		c1.tire.manufac="(��)�Ｚ";
		c1.tire.value=6000;
		c1.tire.totalKiloMeter=5000;
		
		System.out.println();
		System.out.println("���� 2��");
		System.out.println();
		
		System.out.println("����: "+c1.color);
		System.out.println("������: "+c1.manufac);
		System.out.println("�ְ�ӵ�: "+c1.maxSpeed);
		System.out.println("����: "+c1.carModel);
		System.out.println();
		
		System.out.println("<����>");
		System.out.println("������: "+c1.tire.manufac);
		System.out.println("����: "+c1.tire.value);
		System.out.println("����Ÿ�����: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");
	
		
		
		c1.color="������";
		c1.manufac="������";
		c1.maxSpeed=220;
		c1.carModel="������Ƽ";
		
		c1.tire.manufac="(��)��ȣ";
		c1.tire.value=7000;
		c1.tire.totalKiloMeter=8000;
		
		System.out.println();
		System.out.println("���� 3��");
		System.out.println();
		
		System.out.println("����: "+c1.color);
		System.out.println("������: "+c1.manufac);
		System.out.println("�ְ�ӵ�: "+c1.maxSpeed);
		System.out.println("����: "+c1.carModel);
		System.out.println();
		
		System.out.println("<����>");
		System.out.println("������: "+c1.tire.manufac);
		System.out.println("����: "+c1.tire.value);
		System.out.println("����Ÿ�����: "+c1.tire.totalKiloMeter);
		System.out.println("------------------------");		
	}
}		
		


