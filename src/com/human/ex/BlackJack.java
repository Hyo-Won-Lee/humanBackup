package com.human.ex;

import java.util.Scanner;

public class BlackJack {
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static int deck[]=new int[52]; //ī�� ���� ���� ����
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false;
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"�����̵�", "���̾�", "��Ʈ", "Ŭ�ι�"};
	public static String cardNumber[]= 
		{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public static void newCard() {
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		deckIndex=52;p1DeckIndex=0;p2DeckIndex=0;
		isP1GEnd=isP2GEnd=false;
	}	
	public static void mixCard() {
		for(int i=0;i<10000;i++) {
			int randomIndex=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	public static void displayDeckCard() {
		for(int i=0;i<deckIndex;i++) {
			System.out.println(cardShape[deck[i]/13]+""+cardNumber[deck[i]%13]);
		}
	}
	public static void displayP1Card() {
		System.out.print("p1Card : ");
		for(int i=0;i<p1DeckIndex;i++) {
			System.out.println(cardShape[p1Deck[i]/13]+""+cardNumber[p1Deck[i]%13]+",");
		}
		System.out.println("�������� : "+p1Score());
		System.out.println();
	}
	public static void displayP2Card() {
		System.out.print("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+""+cardNumber[p2Deck[i]%13]+",");
		}
		System.out.println("�������� : "+p2Score());
		System.out.println();
	}
	public static void getP1Card() {
		//deck�迭���� p1Deck���� ī�� �ű��
		//deck�� ������ �ִ� ī�� ���� deckIndex
		//p1Deck�� ������ �ִ� ī�� ���� p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		// deck�迭���� p2Deck���� ī�� �ű��
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	public static int p1Score() {
		int  returnValue=0;
		//A 1 or 11
		//J Q K 10   11,12,13 --> 10������ ���
		//�������� �״��
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int i=0;i<p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {//A�� ������
				if((returnValue+10)>21) {//A�� 11�� �����ؼ� 21���� ũ��
					
				}else {
					returnValue=returnValue+10;
				}
				break;
			}
		}
		return returnValue;
	}
	public static int p2Score() {
		int  returnValue=0;
		//A 1 or 11
				//J Q K 10   11,12,13 --> 10������ ���
				//�������� �״��
				for(int i=0;i<p2DeckIndex;i++) {
					int countNum=p2Deck[i]%13+1;
					if(countNum>10) {
						countNum=10;
					}
					
					returnValue+=countNum;
				}
				for(int i=0;i<p2DeckIndex;i++) {
					if(p2Deck[i]%13==0) {//A�� ������
						if((returnValue+10)>21) {//A�� 11�� �����ؼ� 21���� ũ��
							
						}else {
							returnValue=returnValue+10;
						}
						break;
					}
				}
		return returnValue;
	}
	public static void displayGEnd() {
		String result="";
		displayP1Card();
		displayP2Card();
		if(p1Score()>21) {
			result="p2�� �¸��Ͽ����ϴ�.";
		}else if(p2Score()>21) {
			result="p1�� �¸��Ͽ����ϴ�.";
		}else if(p1Score()<p2Score()) {
			result="p2�� �¸��Ͽ����ϴ�.";
		}else if(p1Score()==p2Score()) {
			result="���º��Դϴ�.";
		}else {
			result="p1�� �¸��Ͽ����ϴ�.";
		}
		System.out.println(result);
	}
	public static void play() {
		for(int i=0;i<10;i++) {
			
			System.out.println((i+1)+"��° Card ������...");
			
			if(!isP1GEnd) {
				System.out.println("ī�带 �����ðڽ��ϱ�? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP1Card();	//p1 ī�� 1�� ���
					if(p1Score()>21) {	//p1�� ���ӿ� �� ���·� ����
						break;
					}
				}else {
					isP1GEnd=true;
				}
			}
			
			if(!isP2GEnd) {
				System.out.println("ī�带 �����ðڽ��ϱ�? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP2Card();	//p1 ī�� 1�� ���
					if(p2Score()>21) {	//p1�� ���ӿ� �� ���·� ����
						break;
					}
				}else {
					isP2GEnd=true;
				}
			}
			
			if(isP1GEnd&&isP2GEnd) {
				break;
			}
			displayP1Card();
			displayP2Card();
		}
		displayGEnd();
	}
	//	public static void showResult() {
//		System.out.println("----------���----------");
//		if(Math.abs(p1Score()-21)<Math.abs(p2Score()-21)) {
//			System.out.println("P1 ���� : "+p1Score()+"--> ��");
//			System.out.println("P2 ���� : "+p2Score()+"--> ��");
//		}else if(Math.abs(p1Score()-21)>Math.abs(p2Score()-21)) {
//			System.out.println("P1 ���� : "+p1Score()+"--> ��");
//			System.out.println("P2 ���� : "+p2Score()+"--> ��");
//		}else {
//			System.out.println("P1 ���� : "+p1Score()+"--> ���º�");
//			System.out.println("P2 ���� : "+p2Score()+"--> ���º�");
//		}
//	}
//	public static void showCard() {
//		System.out.println("------������ ī�� ��-------");
//		displayP1Card();
//		displayP2Card();
//	}
//	public static void showScore() {
//		System.out.println("----------����----------");
//		System.out.println("P1 ���� : "+p1Score());
//		System.out.println("P2 ���� : "+p2Score());
//	}
//	public static void play() {
//		boolean p1Flag=true,p2Flag=true;
//		for(int i=0;i<10;i++) {
//			//���ο� ī�� 1�� �����ϱ�
//			newCard();	
//			//ī�带 ���´�.
//			mixCard();	
//		
//			while(p1Flag) {
//				//p1ī�� �ޱ�
//				getP1Card();
//				if(p1Score()>21){
//					p1Deck[p1DeckIndex-1]=0;
//					p1Flag=false;
//				}
//			}
//					
//			while(p2Flag) {
//				//p2ī�� �ޱ�
//				getP2Card();	
//				if(p2Score()>21) {
//					p2Deck[p2DeckIndex-1]=0;
//					p2Flag=false;
//				}
//			}
//					
//			if(p1Flag==false && p2Flag==false) {
//				break;
//			}
//		}
//	}
	
	public static void main(String[] args) {
			int i=0;
			while(true) {
				newCard();	//���ο� ī�� 1deck �����ϱ�
				mixCard();	//ī�带 ���´�.
				play();	//���� ����
				System.out.println("������ ��� �����Ͻðڽ��ϱ�? 1. ��� ����  2. ����");
				i=Integer.parseInt(sc.nextLine());
				if(i==2){
					break;
				}
			}
//			play();
//			showScore();
//			showCard();
//			showResult();
	}
}
		
		

	


