package com.human.ex;

public class Java6 {

	public static void main(String[] args) {
		//별찍기
		
		//1번
		/*
		for(int i=0;i<9;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//2번
		/*
		int k=9;
		for(int i=0;i<9;i++) {
			for(int j=0;j<k-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			k--;
		}*/
		
		//3번
		/*
		int k=9;
		for(int i=0;i<9;i++) {
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			System.out.println();
			k--;
		}*/
		
		
		
		
		
		
		
		
		
		
		
		//프로젝트 문제
		//3번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[][] table=new int[3][4];
		table[0][0]=46000;table[0][1]=38000;table[0][2]=20000;table[0][3]=74000; //대인
		table[1][0]=39000;table[1][1]=32000;table[1][2]=17000;table[1][3]=62000; //청소년
		table[2][0]=36000;table[2][1]=29000;table[2][2]=16000;table[2][3]=58000; //소인/경로
		int adult=0;int adultPrice=0;
		int youth=0;int youthPrice=0;
		int infantSenior=0;int infantSeniorPrice=0;
		for(int i=1;i<3;) {
			System.out.print("1. 입장권 구매  2. 계산  3. 종료>>");
			i=Integer.parseInt(sc.nextLine());
			if(i==1) {
				System.out.print("1. 대인  2. 청소년  3. 소인/경로>>");
				int j=Integer.parseInt(sc.nextLine());
				if(j==1) {
					System.out.print("1. 주간권  2. 오후권  3. 윈터야간권  4. 2일권>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("인원 수 입력>>");
					adult=Integer.parseInt(sc.nextLine());
					switch(k) {
					case 1:
						adultPrice=table[0][0]*adult;
						break;
					case 2:
						adultPrice=table[0][1]*adult;
						break;
					case 3:
						adultPrice=table[0][2]*adult;
						break;
					case 4:
						adultPrice=table[0][3]*adult;
						break;
					default:
						break;
					}			
				}else if(j==2) {			
					System.out.print("1. 주간권  2. 오후권  3. 윈터야간권  4. 2일권>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("인원 수 입력>>");
					youth=Integer.parseInt(sc.nextLine());
					switch(k) {
					case 1:
						youthPrice=table[1][0]*youth;
						break;
					case 2:
						youthPrice=table[1][1]*youth;
						break;
					case 3:
						youthPrice=table[1][2]*youth;
						break;
					case 4:
						youthPrice=table[1][3]*youth;
						break;
					default:
						break;
					}				
				}else if(j==3) {	
					System.out.print("1. 주간권  2. 오후권  3. 윈터야간권  4. 2일권>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("인원 수 입력>>");
					infantSenior=Integer.parseInt(sc.nextLine());
					switch(k) {
					case 1:
						infantSeniorPrice=table[2][0]*infantSenior;
						break;
					case 2:
						infantSeniorPrice=table[2][1]*infantSenior;
						break;
					case 3:
						infantSeniorPrice=table[2][2]*infantSenior;
						break;
					case 4:
						infantSeniorPrice=table[2][3]*infantSenior;
						break;
					default:
						break;
					}			
				}
			}else if(i==2) {
				int sum=adultPrice+youthPrice+infantSeniorPrice;
				System.out.print("총 지불금액 : "+sum+"원");
				System.out.println();
			}
		}
		System.out.println("종료");*/
		
		//4번
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int challenger=0;
		int opportunity=1;
		int rand=0;
		boolean isFlag=false;
		for(int i=0;isFlag==false;) {
			rand=(int)(Math.random()*10)+1;
			for(int j=0;isFlag==false;) {
				System.out.print("숫자를 입력하세요>>");
				challenger=Integer.parseInt(sc.nextLine());
				if(challenger==rand) {
					System.out.println("축하합니다! 정답을 맞추셨군요. 총 "+opportunity+"회의 도전 끝에 성공하셨습니다!");
					isFlag=true;
				}else {
					if(rand<=challenger) {
						System.out.print("정답은 현재 내신 값보다 이하의 값입니다.");
						System.out.println();
					}else {
						System.out.print("정답은 현재 내신 값보다 큰 값입니다.");
						System.out.println();
						opportunity++;
					}
				}
			}
		}
		System.out.println("게임 종료!");*/
		
		
		//5번
		//while문
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		boolean isFlag=false;
		while(isFlag==false) {
			System.out.println("'종료'를 입력할 때까지 무한 반복하는 프로그램");
			str=sc.nextLine();
			if(str.equals("종료")) {
				isFlag=true;
			}
		}
		System.out.println("프로그램 종료");*/
		
		//for문
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean isFlag=false;
		for(String str="";isFlag==false;) {
			System.out.println("'종료'를 입력할 때까지 무한 반복하는 프로그램");
			str=sc.nextLine();
			if(str.equals("종료")) {
				isFlag=true;
			}
		}
		System.out.println("프로그램 종료");*/
		
		//break문
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		for(int i=0;;i++) {
			System.out.println("'종료'를 입력할 때까지 무한 반복하는 프로그램");
			System.out.println(i);
			str=sc.nextLine();
			if(str.equals("종료")) {
				break;
			}
		}
		System.out.println("프로그램 종료");*/
		
		
	}

}
