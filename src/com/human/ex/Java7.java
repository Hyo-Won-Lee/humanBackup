package com.human.ex;

public class Java7 {
	
	/* 369게임
	public static boolean myFunction(int count) {
		boolean isFlag=false;
		String temp=Integer.toString(count); //문자열로 변환
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i)=='3'||temp.charAt(i)=='6'||temp.charAt(i)=='9') {
				System.out.print("짝");
				isFlag=true;
			}
		}
		return isFlag;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("숫자 입력>>");
		int i=Integer.parseInt(sc.nextLine());
		for(int count=1;count<=i;count++) {
			if(myFunction(count)) {
				System.out.println(count);
			}else {
				System.out.println(count);
			}
		}
	}*/
	
	/* 사칙연산 */
	public static boolean madeLevel(int score) {
		boolean passOrContinue=false;
		if(score==5) {
			System.out.print("레벨 업!");
			passOrContinue=true;
		}else {
			System.out.print("게임을 계속 진행하세요.");
		}
		System.out.println();
		System.out.println();
		return passOrContinue;
	}
	
	
	public static boolean madeQuestionAndDisplay1(int level) {
		boolean score=false;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		int sum=rand1+rand2;
		System.out.print(rand1+"+"+rand2+"=");
		int a=Integer.parseInt(sc.nextLine());
		if(a==sum) {
			System.out.println("정답!");
			score=true;
		}else {
			System.out.println("땡!");
		}
		System.out.println();
		return score;
	}
	
	public static boolean madeQuestionAndDisplay2(int level) {
		boolean score=false;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		if(rand1%2==0) {
			int sum=rand1+rand2;
			System.out.print(rand1+"+"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==sum) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else {
			rand1=(int)(Math.random()*99)+1;
			rand2=(int)(Math.random()*99)+1;
			int minus=rand1-rand2;
			System.out.print(rand1+"-"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==minus) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}
		return score;
	}
	
	public static boolean madeQuestionAndDisplay3(int level) {
		boolean score=false;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		if(rand1>30 && rand1<=40) {
			int sum=rand1+rand2;
			System.out.print(rand1+"+"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==sum) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else if(rand1>40){
			rand1=(int)(Math.random()*99)+1;
			rand2=(int)(Math.random()*99)+1;
			int minus=rand1-rand2;
			System.out.print(rand1+"-"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==minus) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else if(rand1<=30){
			rand1=(int)(Math.random()*10)+1; //곱셈은 10이하끼리만(두 자리수끼리는 어려워서)
			rand2=(int)(Math.random()*10)+1;
			int mul=rand1*rand2;
			System.out.print(rand1+"x"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==mul) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}
		return score;
	}
	
	public static boolean madeQuestionAndDisplay4(int level) {
		boolean score=false;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int rand1=(int)(Math.random()*99)+1;
		int rand2=(int)(Math.random()*99)+1;
		if(rand1>35 && rand1<=40) {
			int sum=rand1+rand2;
			System.out.print(rand1+"+"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==sum) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else if(rand1>40){
			rand1=(int)(Math.random()*99)+1;
			rand2=(int)(Math.random()*99)+1;
			int minus=rand1-rand2;
			System.out.print(rand1+"-"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==minus) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else if(rand1>30 && rand1<=35){
			rand1=(int)(Math.random()*10)+1; //곱셈은 10이하끼리만(두 자리수끼리는 어려워서)
			rand2=(int)(Math.random()*10)+1;
			int mul=rand1*rand2;
			System.out.print(rand1+"x"+rand2+"=");
			int a=Integer.parseInt(sc.nextLine());
			if(a==mul) {
				System.out.println("정답!");
				score=true;
			}else {
				System.out.println("땡!");
			}
		}else if(rand1<=30) {
			rand1=(int)(Math.random()*10)+1; //나눗셈은 10이하끼리만(두 자리수끼리는 어려워서)
			rand2=(int)(Math.random()*10)+1;
			if(rand1>rand2) {
				System.out.print(rand1+"/"+rand2+"=");
				int a=Integer.parseInt(sc.nextLine());
				int div=rand1/rand2;
				if(a==div) {
					System.out.println("정답!");
					score=true;
				}else {
					System.out.println("땡!");
				}
			}else if(rand1<rand2) {
				System.out.print(rand2+"/"+rand1+"=");
				int a=Integer.parseInt(sc.nextLine());
				int div=rand2/rand1;
				if(a==div) {
					System.out.println("정답!");
					score=true;
				}else {
					System.out.println("땡!");
				}
			}else {
				System.out.print(rand1+"/"+rand2+"=");
				int a=Integer.parseInt(sc.nextLine());
				int div=rand2/rand1;
				if(a==div) {
					System.out.println("정답!");
					score=true;
				}else {
					System.out.println("땡!");
				}
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int score=0,level=1,k=1;
			for (;;) {
				switch(k) {
					case 1:
						System.out.println(level+"단계");
						if(madeQuestionAndDisplay1(level)==true) {
							score++;
							System.out.println("점수 : "+score);
							if(madeLevel(score)==true) {
								k=2;
								score=0;
								level++;
							}
						}
						break;
			
					case 2:
						System.out.println(level+"단계");
						if(madeQuestionAndDisplay2(level)==true) {
							score++;
							System.out.println("점수 : "+score);
							if(madeLevel(score)==true) {
								k=3;
								score=0;
								level++;
							}
						}
						break;
				
					case 3:
						System.out.println(level+"단계");
						if(madeQuestionAndDisplay3(level)==true) {
							score++;
							System.out.println("점수 : "+score);
							if(madeLevel(score)==true) {
								k=4;
								score=0;
								level++;
							}
						}
						break;
				
					case 4:
						System.out.println(level+"단계");
						if(madeQuestionAndDisplay4(level)==true) {
							score++;
							System.out.println("점수 : "+score);
							if(madeLevel(score)==true) {
								k=5;
							}
						}
						break;
				
					case 5:
						break;
				}
				if(k==5){
					System.out.println("게임을 모두 완료하였습니다.게임을 종료합니다.");
					break;
				}
			}
	}
}


			




