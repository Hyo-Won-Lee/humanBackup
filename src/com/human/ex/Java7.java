package com.human.ex;

public class Java7 {

//	public static boolean myFunction(int count) {
//		boolean isFlag=false;
//		String temp=Integer.toString(count); //���ڿ��� ��ȯ
//		for(int i=0;i<temp.length();i++) {
//			if(temp.charAt(i)=='3'||temp.charAt(i)=='6'||temp.charAt(i)=='9') {
//				System.out.print("¦");
//				isFlag=true;
//			}
//		}
//		return isFlag;
//	}
//	public static void main(String[] args) {
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("���� �Է�>>");
//		int i=Integer.parseInt(sc.nextLine());
//		for(int count=1;count<=i;count++) {
//			if(myFunction(count)) {
//				System.out.println(count);
//			}else {
//				System.out.println(count);
//			}
//		}
//	}
	
	public static boolean resultDisplay(int score, int level) {
		if(score==5 && level==4) {
			System.out.println("������ ��� �Ϸ��Ͽ����ϴ�!");
		}
		return true;
	}
	
	
	public static int madeLevel(int score) {
		if(score==5) {
			System.out.print("���� ��!");
			score=0;
		}else {
			System.out.print("������ ��� �����ϼ���.");
		}
		System.out.println();
		return score;
	}
	
	
	public static int madeQuestionAndDisplay1(int level) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int score=0;
//		System.out.print("1�ܰ�");
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		//1�ܰ� ����
		int sum=rand1+rand2;
		System.out.print(rand1+"+"+rand2+"=");
		int a=Integer.parseInt(sc.nextLine());
		if(a==sum) {
			System.out.println("����!");
			score++;
			System.out.println("����: "+score);
		}else {
			System.out.println("��!");
			score--;
			System.out.println("����: "+score);
		}
		return score;
	}
	
	public static int madeQuestionAndDisplay2(int a, int b, int level) {

		return level;
	}
	
	public static int madeQuestionAndDisplay3(int a, int b, int level) {

		return level;
	}
	
	public static int madeQuestionAndDisplay4(int a, int b, int level) {

		return level;
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int score=0,level=1;
		for (;;) {
			System.out.println(level+"�ܰ�");

			madeQuestionAndDisplay1(level);
			score+=1;
			madeLevel(score);
			
			
//		int result=madeQuestionAndDisplay(level);

		

//		resultDisplay(score,level);

		}
//		resultDisplay(score,level);
//		System.out.println("��������");
	}
	


	}

			




