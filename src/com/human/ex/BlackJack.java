package com.human.ex;

import java.util.Scanner;

public class BlackJack {
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static int deck[]=new int[52]; //카드 저장 공간 생성
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false;
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"스페이드", "다이아", "하트", "클로버"};
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
		System.out.println("현재점수 : "+p1Score());
		System.out.println();
	}
	public static void displayP2Card() {
		System.out.print("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+""+cardNumber[p2Deck[i]%13]+",");
		}
		System.out.println("현재점수 : "+p2Score());
		System.out.println();
	}
	public static void getP1Card() {
		//deck배열에서 p1Deck으로 카드 옮기기
		//deck이 가지고 있는 카드 수는 deckIndex
		//p1Deck이 가지고 있는 카드 수는 p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		// deck배열에서 p2Deck으로 카드 옮기기
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	public static int p1Score() {
		int  returnValue=0;
		//A 1 or 11
		//J Q K 10   11,12,13 --> 10점으로 계산
		//나머지는 그대로
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int i=0;i<p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {//A가 있으면
				if((returnValue+10)>21) {//A를 11로 변경해서 21보다 크면
					
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
				//J Q K 10   11,12,13 --> 10점으로 계산
				//나머지는 그대로
				for(int i=0;i<p2DeckIndex;i++) {
					int countNum=p2Deck[i]%13+1;
					if(countNum>10) {
						countNum=10;
					}
					
					returnValue+=countNum;
				}
				for(int i=0;i<p2DeckIndex;i++) {
					if(p2Deck[i]%13==0) {//A가 있으면
						if((returnValue+10)>21) {//A를 11로 변경해서 21보다 크면
							
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
			result="p2가 승리하였습니다.";
		}else if(p2Score()>21) {
			result="p1이 승리하였습니다.";
		}else if(p1Score()<p2Score()) {
			result="p2가 승리하였습니다.";
		}else if(p1Score()==p2Score()) {
			result="무승부입니다.";
		}else {
			result="p1이 승리하였습니다.";
		}
		System.out.println(result);
	}
	public static void play() {
		for(int i=0;i<10;i++) {
			
			System.out.println((i+1)+"번째 Card 수령중...");
			
			if(!isP1GEnd) {
				System.out.println("카드를 받으시겠습니까? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP1Card();	//p1 카드 1장 취득
					if(p1Score()>21) {	//p1이 게임에 진 상태로 종료
						break;
					}
				}else {
					isP1GEnd=true;
				}
			}
			
			if(!isP2GEnd) {
				System.out.println("카드를 받으시겠습니까? 1.yes 2.no");
				if(1==Integer.parseInt(sc.nextLine())) {
					getP2Card();	//p1 카드 1장 취득
					if(p2Score()>21) {	//p1이 게임에 진 상태로 종료
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
//		System.out.println("----------결과----------");
//		if(Math.abs(p1Score()-21)<Math.abs(p2Score()-21)) {
//			System.out.println("P1 점수 : "+p1Score()+"--> 승");
//			System.out.println("P2 점수 : "+p2Score()+"--> 패");
//		}else if(Math.abs(p1Score()-21)>Math.abs(p2Score()-21)) {
//			System.out.println("P1 점수 : "+p1Score()+"--> 패");
//			System.out.println("P2 점수 : "+p2Score()+"--> 승");
//		}else {
//			System.out.println("P1 점수 : "+p1Score()+"--> 무승부");
//			System.out.println("P2 점수 : "+p2Score()+"--> 무승부");
//		}
//	}
//	public static void showCard() {
//		System.out.println("------선수별 카드 덱-------");
//		displayP1Card();
//		displayP2Card();
//	}
//	public static void showScore() {
//		System.out.println("----------점수----------");
//		System.out.println("P1 점수 : "+p1Score());
//		System.out.println("P2 점수 : "+p2Score());
//	}
//	public static void play() {
//		boolean p1Flag=true,p2Flag=true;
//		for(int i=0;i<10;i++) {
//			//새로운 카드 1벌 세팅하기
//			newCard();	
//			//카드를 섞는다.
//			mixCard();	
//		
//			while(p1Flag) {
//				//p1카드 받기
//				getP1Card();
//				if(p1Score()>21){
//					p1Deck[p1DeckIndex-1]=0;
//					p1Flag=false;
//				}
//			}
//					
//			while(p2Flag) {
//				//p2카드 받기
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
				newCard();	//새로운 카드 1deck 세팅하기
				mixCard();	//카드를 섞는다.
				play();	//게임 실행
				System.out.println("게임을 계속 진행하시겠습니까? 1. 계속 진행  2. 종료");
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
		
		

	


