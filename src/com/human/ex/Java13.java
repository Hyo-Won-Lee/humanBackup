package com.human.ex;

class Car1{
	public String model=" ";
	public int speed=10;
	
	public void statement() {
		System.out.println("현재차종:"+model+" 속력은"+speed+"입니다.");
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
	public String fromName="홍길동";
	public String toName="";
	public String text=" ";
	
	public void sendMessage(String toName,String text) {
		System.out.println("'"+fromName+"'"+"이"+"'홍길남"+"'"+"에게 "+"'"+text+"'"+"이라는 메시지를 보냈습니다.");
	}	
	public String send(String phoneNumber) {
		System.out.println("'"+fromName+"'님이 "+phoneNumber+"에 전화를 겁니다.");
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
		Car1 c1=new Car1("벤츠");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();
		
		CellPhone phone=new CellPhone("홍길동","010-1111-1111");
		phone.sendMessage("홍길남","안녕");
		phone.send("010-2222-2222");
	}
}
