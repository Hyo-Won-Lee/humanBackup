package com.human.ex;

class Car1{
	public String model=" ";
	public int speed=10;
	
	public void statement() {
		System.out.println("��������:"+model+" �ӷ���"+speed+"�Դϴ�.");
	}	
	public void speedUp() {
		speed+=10;
	}	
	public void speedDown() {
		speed-=10;
	}
	public Car1() {}
	@Override
	public String toString() {
		return "Car1 [model=" + model + "]";
	}
	public Car1(String model) {
		super();
		this.model = model;
	}
}

class CellPhone{
	public String phoneNumber="";
	public String fromName="ȫ�浿";
	public String toName="";
	public String text=" ";
	
	public void sendMessage(String toName,String text) {
		System.out.println("'"+fromName+"'"+"��"+"'ȫ�泲"+"'"+"���� "+"'"+text+"'"+"�̶�� �޽����� ���½��ϴ�.");
	}	
	public String send(String phoneNumber) {
		System.out.println("'"+fromName+"'���� "+phoneNumber+"�� ��ȭ�� �̴ϴ�.");
		return phoneNumber;
	}
	public CellPhone() {}
	public CellPhone(String fromName,String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
		this.fromName = fromName;
	}
	
}

public class Java13 {
	public static void main(String[] args) {
		Car1 c1=new Car1("����");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();
		
		CellPhone phone=new CellPhone("ȫ�浿","010-1111-1111");
		phone.sendMessage("ȫ�泲","�ȳ�");
		phone.send("010-2222-2222");
	}
}
