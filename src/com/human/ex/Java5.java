package com.human.ex;

public class Java5 {
	public static void main(String[] args) {
		//1. 369게임 해답지를 만들어 보자.
		//1부터 차례대로 숫자를 출력하다가 숫자에 3,6,9중 하나라도
		//들어가면 박수를 치면된다.
		//1,2,짝,4,5,짝,7,8,짝,10,11,12,짝,14......
		//그런데 만약 33,66같이 두 개가 들어가면 박수를 두 번 친다.
		//27,28,짝(29),짝(30),짝(31),짝(32),짝짝(33),......
	
//		for(int i=1;i<=1000;i++) {
//			//100자리수
//			int equation1=i/100; //100의 자리
//			int equation2=(i-(i/100*100))/10; //10의 자리
//			int equation3=(i-(i/100*100))-(i-(i/100*100))/10*10; //1의 자리
//			
//			//10자리수
//			int equation4=i/10; //10의 자리
//			int equation5=i%10; //1의 자리
//			if(i<100) {
//				if(i==3 || i==6 || i==9) {
//					System.out.println(i+" 짝");
//				}else if((equation4==3 || equation4==6 || equation4==9) && (equation5==3 || equation5==6 || equation5==9)) {
//					System.out.println(i+" 짝짝");
//				}else if((equation4==3 || equation4==6 || equation4==9) || (equation5==3 || equation5==6 || equation5==9)) {
//					System.out.println(i+" 짝");
//				}else {
//					System.out.println(i);
//				}
//			}else {
//				if((equation1==3 || equation1==6 || equation1==9) && (equation2==3 || equation2==6 || equation2==9) && (equation3==3 || equation3==6 || equation3==9)) {
//					System.out.println(i+" 짝짝짝");
//				}else if(((equation1==3 || equation1==6 || equation1==9) && (equation2==3 || equation2==6 || equation2==9)) || 
//						((equation2==3 || equation2==6 || equation2==9) && (equation3==3 || equation3==6 || equation3==9)) || 
//						((equation1==3 || equation1==6 || equation1==9) && (equation3==3 || equation3==6 || equation3==9))){
//					System.out.println(i+" 짝짝");
//				}else if((equation1==3 || equation1==6 || equation1==9) || (equation2==3 || equation2==6 || equation2==9) || (equation3==3 || equation3==6 || equation3==9)) {
//					System.out.println(i+" 짝");
//				}else {
//					System.out.println(i);
//				}
//			}
//		}
		

		
		
		
		//2. 랜덤하게 덧셈,뺄셈,곱셈,나눗셈 문제를 내서 사용자가 맞추는 프로그램을 구현해 보자.
		//레벨이 4단계로 되어있어 처음에는 더하기 문제만 나오다가 레벨이 업되면 뺄셈,곱셈,나눗셈을 차례대로
		//추가하여 문제가 나오도록 해보자. 2자리 이하 정수 계산만 하자.
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		//i가 1이면 1단계, 2면 2단계, 3이면 3단계, 4이면 4단계, 5이면 게임 종료
		for(int i=0,score=0;i<5;) {
			System.out.println("번호를 입력하세요");
			System.out.print("1. 1단계, 2. 2단계, 3. 3단계, 4. 4단계, 5. 게임 종료>>");
			System.out.println();
			i=Integer.parseInt(scanner.nextLine());;
			int rand1=(int)(Math.random()*99)+1;
			int rand2=(int)(Math.random()*99)+1;
			if(i==1) {
				//1단계 덧셈
				int sum=rand1+rand2;
				System.out.print(rand1+"+"+rand2+"=");
				int a=Integer.parseInt(scanner.nextLine());
				if(a==sum) {
					System.out.println("정답!");
					score++;
					System.out.println("레벨: "+score);
				}else {
					System.out.println("땡!");
					score--;
					System.out.println("레벨: "+score);
				}
			}else if(i==2) {
				//2단계 덧셈+뺄셈
				if(rand1%2==0) {  //덧셈
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else {  //뺄셈
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}
			}else if(i==3) {
				//3단계 덧셈+뺄셈+곱셈
				if(rand1>=1 && rand1<=10) { //덧셈
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else if(rand1>10 && rand1 <=20) { //뺄셈
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else { //곱셈
					int rand3=(int)(Math.random()*10)+1; //곱셈은 10이하끼리만(두 자리수끼리는 어려워서)
					int rand4=(int)(Math.random()*10)+1;
					int mul=rand3*rand4;
					System.out.print(rand3+"x"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==mul) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}
				
			}else if(i==4) {
				System.out.println("4단계--------->나눗셈은 정수형으로 입력");
				//4단계 덧셈+뺄셈+곱셈+나눗셈
				if(rand1>=1 && rand1<=10) { //덧셈
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else if(rand1>10 && rand1 <=20) { //뺄셈
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else if(rand1>20 && rand1<=30){ //곱셈
					int rand3=(int)(Math.random()*10)+1; //곱셈은 10이하끼리만(두 자리수끼리는 어려워서)
					int rand4=(int)(Math.random()*10)+1;
					int mul=rand3*rand4;
					System.out.print(rand3+"x"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==mul) {
						System.out.println("정답!");
						score++;
						System.out.println("레벨: "+score);
					}else {
						System.out.println("땡!");
						score--;
						System.out.println("레벨: "+score);
					}
				}else if(rand1>30) { //나눗셈
					int rand3=(int)(Math.random()*10)+1; //나눗셈은 10이하끼리만(두 자리수끼리는 어려워서)
					int rand4=(int)(Math.random()*10)+1;
					System.out.print(rand3+"/"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(rand3>rand4) {
						int div=rand3/rand4;
						if(a==div) {
							System.out.println("정답!");
							score++;
							System.out.println("레벨: "+score);
						}else {
							System.out.println("땡!");
							score--;
							System.out.println("레벨: "+score);
						}
					}else if(rand3<rand4) {
						int div=rand4/rand3;
						System.out.print(rand4+"/"+rand3+"=");
						if(a==div) {
							System.out.println("정답!");
							score++;
							System.out.println("레벨: "+score);
						}else {
							System.out.println("땡!");
							score--;
							System.out.println("레벨: "+score);
						}
					}else {
						int div=rand4/rand3;
						if(a==div) {
							System.out.println("정답!");
							score++;
							System.out.println("레벨: "+score);
						}else {
							System.out.println("땡!");
							score--;
							System.out.println("레벨: "+score);
						}
					}
				}
			}
			System.out.println();
		}
		System.out.println("게임 종료");
		
	}
}
