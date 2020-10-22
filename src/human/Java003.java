package human;

public class Java003 {
	public static void main(String[] args) {
	
	//최대공약수
	//	java.util.Scanner scanner=new java.util.Scanner(System.in);
	//	System.out.print("첫 번째 숫자를 입력하세요>>");
	//	int a=Integer.parseInt(scanner.nextLine());
	//	System.out.print("두 번째 숫자를 입력하세요>>");
	//	int b=Integer.parseInt(scanner.nextLine());
	//	
	//	int max=1;
	//	int ab=a<b?a:b;
	//	for(int i=1;i<=ab;i++) {
	//		if(a%i==0&&b%i==0) {
	//			max=i;
	//			System.out.println(i);
	//		}
	//	}
	//	System.out.println(max);
			
		
	//2의 배수 구하기
	//i가 2의 배수인지 판별하면서 i를 증가해보자.
	//최소공배수
//	java.util.Scanner scanner=new java.util.Scanner(System.in);
//	System.out.print("첫 번째 숫자를 입력하세요>>");
//	int a=Integer.parseInt(scanner.nextLine());
//	System.out.print("두 번째 숫자를 입력하세요>>");
//	int b=Integer.parseInt(scanner.nextLine());
//	int result=0;
//	for(int i=1;i<100;i++) {
//		if(i%a==0&&i%b==0) {
//			result=i;
//
//			break;
//		}
//	}
//	System.out.println(result);
		
	//100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램을 구현해 보자.
//	int failCount=0;
//	java.util.Scanner scanner=new java.util.Scanner(System.in);
//	for(int i=0;i<5;i++) {
//		int input=Integer.parseInt(scanner.nextLine());
//		if(input<=100) {
//			if(input<=60) {
//				failCount++;
//			}
//		}else {
//			i--;
//		}
//	}
//	System.out.println(failCount);
		
		
		
		//1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로 출력하시오. 
		//1:1 2:3 3:6 4:10 5:15 6:21 …  100이전의 총합들을 다음과 같이 출력되면 된다.
//		int sum=0;
//		for(int i=0;sum<100;i++) {
//			if(sum<100) {
//				sum+=i;
//				if(sum>100) {
//					break;
//				}
//				System.out.println(i+":"+sum);
//			}
//		}
		
		
//		int count=5;
//		int lineCount=0;
//		int total=25;
//	
//		for(int i=1;i<=total;i++) {
//			if(i%count==1) { //1~25까지 숫자가 증가하면서 6,11,15,21(5로 나눈 나머지가 1)에서 줄번호 증가.
//				lineCount++;
//			}
//			
//			if(lineCount%2==0) { 
//				System.out.print((2*count)*(lineCount/2)-(i-1)%5+"\t"); //짝수줄이면 숫자가 감소
//			}else {
//				System.out.print(i+"\t"); //홀수줄이면 그대로 증가
//			}
//			
//			if(i%count==0) {
//				System.out.println(); //5의 배수는 엔터
//			}
//		}


/*
		//최대공약수 문제 풀이 과정
		//6의 약수
		
//		for(int i=1;i<=6;i++) {
//			if(6%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//10의 약수
		
//		for(int i=1;i<=10;i++) {
//			if(10%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//6과10의 공약수
		
//		for(int i=1;i<=10;i++) {
//			if(6%i==0 && 10%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//6과 10의 최대공약수
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		int a=Integer.parseInt(scanner.nextLine());
//		int b=Integer.parseInt(scanner.nextLine());
//		int GCD=0;
//		for(int i=1;i<=10;i++) {
//			if(a%i==0 && b%i==0) {
//				GCD=i;
//			}
//		}
//		System.out.println(GCD);*/
		
		
/*	
		//최소공배수
		//2의 배수
		//2%2==0, 4%2==0, 6%2==0
//		for(int i=1;i<=20;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//6의 배수
		//6%6==0, 12%6==0, 18%6==0
//		for(int i=1;i<=20;i++) {
//			if(i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		//2와 6의 공배수
//		for(int i=1;i<=20;i++) {
//			if(i%2==0&&i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		//2와 6의 최소공배수
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		int a=Integer.parseInt(scanner.nextLine());
//		int b=Integer.parseInt(scanner.nextLine());
//		int min=0;
//		for(int i=1;i<=a*b;i++) {
//			if(i%a==0&&i%b==0) {
//				min=i;
//				break;
//			}
//		}
//		System.out.println(min);*/
		
		
		//100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램을 구현해 보자.
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		int failer=0;
//		for(int i=0;i<5;i++) {
//			int score=Integer.parseInt(scanner.nextLine());
//			if(score<=100) {
//				if(score<=60) {
//					failer++;
//				}
//			}else {
//				i--;
//			}
//		}
//		System.out.println(failer);
		
		
		//1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로 출력하시오. 
//		int sum=0;
//		for(int i=1;i<20;i++) {
//			sum+=i;
//			if(sum>100) {
//				break;
//			}
//			System.out.println(i+","+sum);
//		}
		
		
		//다음과 같이 출력 되도록 프로그램을 완성해 보자.
//		1   2   3   4   5
//		10  9   8   7   6
//		11 12  13  14  15
//		20 19  18  17  16
//		21 22  23  24  25

//		int count=5;
//		int total=25;
//		int lineCount=0;
//		
//		for(int i=1;i<=total;i++) {
//			
//			if(i%5==1) {
//				lineCount++;
//			}
//			
//			if(lineCount%2==0) {
//					System.out.print((2*count)*(lineCount/2)-(i-1)%5+"\t");
//			}else {
//				System.out.print(i+"\t");
//			}
//			
//			if(i%5==0) {
//				System.out.println();
//			}
//			
//		}
		
		
		
		
		
		
		
	}
}
