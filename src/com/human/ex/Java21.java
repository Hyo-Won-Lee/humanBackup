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
		System.out.println("속도가 증가한다.");
	}
	public void state() {
		System.out.println("달리고 있는 중이다.");
	}
}


class Maserati extends Benz{
	public Maserati() {}
	public Maserati(String name) {
		super(name);
	}
	@Override	
	public void speedUp() {	
		System.out.println("속도가 더 빨라진다.");
	}
	public void stop() {
		System.out.println("멈춘다.");
	}
}


class Hyundai extends Benz{
	public Hyundai() {}
	public Hyundai(String name) {
		super(name);
	}
	public void speedUp() {
		System.out.println("기차보다 더 빠르다.");
	}
	public void rotate() {
		System.out.println("회전한다.");
	}
}


public class Java21 {

	public static void main(String[] args) {
		
		Benz b = new Benz("E class");
//		b.getName();
//		b.speedUp();
//		b.state();
		
		Maserati m = new Maserati("콰르토포르테");
//		m.getName();
//		m.state();
//		m.speedUp();
//		m.stop();
		
		Hyundai h = new Hyundai("아반떼");
//		h.getName();
//		h.state();
//		h.speedUp();
//		h.rotate();
		
		//다형성
		Benz b0 = new Benz("C class");
		Benz b1 = new Maserati("르반떼");
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
