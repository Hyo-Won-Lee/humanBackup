package com.human.ex;

class Phone{
	protected String owner;
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}

class Telephone extends Phone{
	private String when;
	public Telephone() {}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getWhen() {
		return when;
	}
	public Telephone(String owner, String when) {
		super();
		this.owner = owner;
		this.when = when;
	}
	public void autoAnswering() {
		System.out.println(owner + "가 없다. " + when + " 내일 전화 줄래.");
	}
}

class Smartphone extends Telephone{
	private String game;
	public Smartphone() {}
	public Smartphone(String owner, String game) {
		super();
		this.owner = owner;
		this.game = game;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public void playGame() {
		System.out.println(owner + "가 " + game + "게임을 하는 중이다.");
	}
}


public class Java24_No5 {

	public static void main(String[] args) {
		
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), 
				new Smartphone("민국이", "갤러그")};
		
			for(Phone p : phones) {
				if(p instanceof Smartphone) {
					((Smartphone)p).playGame();
				}else if(p instanceof Telephone) {
					((Telephone)p).autoAnswering();
				}else if(p instanceof Phone){ 
					((Phone)p).talk();
				}
			}
		

	}

}
