package com.human.ex;

public class Java6 {

	public static void main(String[] args) {
		//�����
		
		//1��
		/*
		for(int i=0;i<9;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//2��
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
		
		//3��
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
		
		
		
		
		
		
		
		
		
		
		
		//������Ʈ ����
		//3��
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[][] table=new int[3][4];
		table[0][0]=46000;table[0][1]=38000;table[0][2]=20000;table[0][3]=74000; //����
		table[1][0]=39000;table[1][1]=32000;table[1][2]=17000;table[1][3]=62000; //û�ҳ�
		table[2][0]=36000;table[2][1]=29000;table[2][2]=16000;table[2][3]=58000; //����/���
		int adult=0;int adultPrice=0;
		int youth=0;int youthPrice=0;
		int infantSenior=0;int infantSeniorPrice=0;
		for(int i=1;i<3;) {
			System.out.print("1. ����� ����  2. ���  3. ����>>");
			i=Integer.parseInt(sc.nextLine());
			if(i==1) {
				System.out.print("1. ����  2. û�ҳ�  3. ����/���>>");
				int j=Integer.parseInt(sc.nextLine());
				if(j==1) {
					System.out.print("1. �ְ���  2. ���ı�  3. ���;߰���  4. 2�ϱ�>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("�ο� �� �Է�>>");
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
					System.out.print("1. �ְ���  2. ���ı�  3. ���;߰���  4. 2�ϱ�>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("�ο� �� �Է�>>");
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
					System.out.print("1. �ְ���  2. ���ı�  3. ���;߰���  4. 2�ϱ�>>");
					int k=Integer.parseInt(sc.nextLine());
					System.out.print("�ο� �� �Է�>>");
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
				System.out.print("�� ���ұݾ� : "+sum+"��");
				System.out.println();
			}
		}
		System.out.println("����");*/
		
		//4��
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int challenger=0;
		int opportunity=1;
		int rand=0;
		boolean isFlag=false;
		for(int i=0;isFlag==false;) {
			rand=(int)(Math.random()*10)+1;
			for(int j=0;isFlag==false;) {
				System.out.print("���ڸ� �Է��ϼ���>>");
				challenger=Integer.parseInt(sc.nextLine());
				if(challenger==rand) {
					System.out.println("�����մϴ�! ������ ���߼̱���. �� "+opportunity+"ȸ�� ���� ���� �����ϼ̽��ϴ�!");
					isFlag=true;
				}else {
					if(rand<=challenger) {
						System.out.print("������ ���� ���� ������ ������ ���Դϴ�.");
						System.out.println();
					}else {
						System.out.print("������ ���� ���� ������ ū ���Դϴ�.");
						System.out.println();
						opportunity++;
					}
				}
			}
		}
		System.out.println("���� ����!");*/
		
		
		//5��
		//while��
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		boolean isFlag=false;
		while(isFlag==false) {
			System.out.println("'����'�� �Է��� ������ ���� �ݺ��ϴ� ���α׷�");
			str=sc.nextLine();
			if(str.equals("����")) {
				isFlag=true;
			}
		}
		System.out.println("���α׷� ����");*/
		
		//for��
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		boolean isFlag=false;
		for(String str="";isFlag==false;) {
			System.out.println("'����'�� �Է��� ������ ���� �ݺ��ϴ� ���α׷�");
			str=sc.nextLine();
			if(str.equals("����")) {
				isFlag=true;
			}
		}
		System.out.println("���α׷� ����");*/
		
		//break��
		/*
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String str="";
		for(int i=0;;i++) {
			System.out.println("'����'�� �Է��� ������ ���� �ݺ��ϴ� ���α׷�");
			System.out.println(i);
			str=sc.nextLine();
			if(str.equals("����")) {
				break;
			}
		}
		System.out.println("���α׷� ����");*/
		
		
	}

}
