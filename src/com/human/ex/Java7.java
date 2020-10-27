package com.human.ex;

public class Java7 {

//	public static boolean myFunction(int count) {
//		boolean isFlag=false;
//		String temp=Integer.toString(count); //문자열로 변환
//		for(int i=0;i<temp.length();i++) {
//			if(temp.charAt(i)=='3'||temp.charAt(i)=='6'||temp.charAt(i)=='9') {
//				System.out.print("짝");
//				isFlag=true;
//			}
//		}
//		return isFlag;
//	}
//	public static void main(String[] args) {
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.print("숫자 입력>>");
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
			System.out.println("게임을 모두 완료하였습니다!");
		}
		return true;
	}
	
	
	public static int madeLevel(int score) {
		if(score==5) {
			System.out.print("레벨 업!");
			score=0;
		}else {
			System.out.print("게임을 계속 진행하세요.");
		}
		System.out.println();
		return score;
	}
	
	
	public static int madeQuestionAndDisplay1(int level) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int score=0;
//		System.out.print("1단계");
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		//1단계 덧셈
		int sum=rand1+rand2;
		System.out.print(rand1+"+"+rand2+"=");
		int a=Integer.parseInt(sc.nextLine());
		if(a==sum) {
			System.out.println("정답!");
			score++;
			System.out.println("점수: "+score);
		}else {
			System.out.println("땡!");
			score--;
			System.out.println("점수: "+score);
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
			System.out.println(level+"단계");

			madeQuestionAndDisplay1(level);
			score+=1;
			madeLevel(score);
			
			
//		int result=madeQuestionAndDisplay(level);

		

//		resultDisplay(score,level);

		}
//		resultDisplay(score,level);
//		System.out.println("게임종료");
	}
	


	}

			




