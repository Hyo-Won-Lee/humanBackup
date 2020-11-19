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
		System.out.println(owner + "�� ��ȭ ���̴�.");
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
		System.out.println(owner + "�� ����. " + when + " ���� ��ȭ �ٷ�.");
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
		System.out.println(owner + "�� " + game + "������ �ϴ� ���̴�.");
	}
}


public class Java24_No5 {

	public static void main(String[] args) {
		
		Phone[] phones = {new Phone("Ȳ����"), new Telephone("�浿��", "����"), 
				new Smartphone("�α���", "������")};
		
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
