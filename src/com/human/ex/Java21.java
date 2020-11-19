package com.human.ex;

class Benz{
	public static void displayName(Benz b) {
		b.getName();
		b.speedUp();
	}
	public String name;
	public Benz() {}
	public Benz(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println(name);
	}
	public void speedUp() {
		System.out.println("�ӵ��� �����Ѵ�.");
	}
	public void state() {
		System.out.println("�޸��� �ִ� ���̴�.");
	}
}


class Maserati extends Benz{
	public Maserati() {}
	public Maserati(String name) {
		super(name);
	}
	@Override	
	public void speedUp() {	
		System.out.println("�ӵ��� �� ��������.");
	}
	public void stop() {
		System.out.println("�����.");
	}
}


class Hyundai extends Benz{
	public Hyundai() {}
	public Hyundai(String name) {
		super(name);
	}
	public void speedUp() {
		System.out.println("�������� �� ������.");
	}
	public void rotate() {
		System.out.println("ȸ���Ѵ�.");
	}
}


public class Java21 {

	public static void main(String[] args) {
		
		Benz b = new Benz("E class");
//		b.getName();
//		b.speedUp();
//		b.state();
		
		Maserati m = new Maserati("�⸣��������");
//		m.getName();
//		m.state();
//		m.speedUp();
//		m.stop();
		
		Hyundai h = new Hyundai("�ƹݶ�");
//		h.getName();
//		h.state();
//		h.speedUp();
//		h.rotate();
		
		//������
		Benz b0 = new Benz("C class");
		Benz b1 = new Maserati("���ݶ�");
		Benz b2 = new Hyundai();
		
//		b0.getName();
//		b0.speedUp();
//		b0.state();
		
//		b1.speedUp();
//		((Maserati)b1).stop();
		
		Benz[] arr = new Benz[3];
		arr[0]=b0;arr[1]=b1;arr[2]=b2;
		
//		for(Benz B:arr) {
//			B.speedUp();
//		}
		
		Benz.displayName(b0);
		Benz.displayName(b1);
		Benz.displayName(b2);

	}

}
