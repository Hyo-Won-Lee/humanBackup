package com.human.ex;

public class Java1 {
	public static void main(String[] args) {
		//if문
		//1번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("양수 5를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("음수 5를 입력하세요");
		int j=Integer.parseInt(scanner.nextLine());
		
		if(i>0) {
			System.out.println(i);
		}
		
		if(j<0) {
			System.out.println(j*(-1));
		}*/
		
		// 2번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("두 번째 수를 입력하세요");
		int j=Integer.parseInt(scanner.nextLine());
		
		if(i==j) {
			System.out.println("두 수는 서로 같다.");
		}else if(i>j) {
			System.out.println("첫 번째 입력한 수가 두 번째 입력한 수보다 크다.");
		}else if(i<j) {
			System.out.println("두 번째 입력한 수가 첫 번째 입력한 수보다 크다");
		}*/
		
		//3번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i%126==0) {
			System.out.println("126의 약수");
		}else {
			System.out.println("126의 약수가 아니다.");
		}*/
		
		//4번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("영어 점수를 입력하세요");
		int j=Integer.parseInt(scanner.nextLine());
		System.out.println("수학 점수를 입력하세요");
		int k=Integer.parseInt(scanner.nextLine());
		
		if((i+j+k)/3>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}*/
		
		//5번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		if(i>=5) {
			System.out.println(i+15);
		}else if(i>5) {
			System.out.println(i+5);
		}*/
		
		
		//if ||
		//1번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i%3==0 || i%7==0) {
			System.out.println("3또는 7의 배수");
		}else if(i%2==0 && i%5==0) {
			System.out.println("2와 5의 배수");
		}else if((i%3==0 || i%7==0) && (i%2==0 && i%5==0)) {
			System.out.println("3또는 7의 배수이면서 2와 5의 배수");
		}*/
		
		//2번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i<=15) {
			System.out.println("1300원입니다.");
		}else if(i>15) {
			System.out.println("1600원입니다.");
		}
		
		System.out.print("버스카드로 결제하시겠습니까? 100원 할인합니다.");
		System.out.print("Y/N 둘 중 하나를 입력하세요.");
		char a= scanner.nextLine().charAt(0);
		
		if(i<=15) {
			System.out.println("1200원입니다.");
		}else if(i>15) {
			System.out.println("1500원입니다.");
		}*/
		
		//3번
		//else if문
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("키를 입력하세요");
		int x=Integer.parseInt(scanner.nextLine());
		System.out.println("몸무게를 입력하세요");
		int y=Integer.parseInt(scanner.nextLine());
		
		double result=y/((x-100)*0.9)*100;
		
		System.out.println();
		System.out.println("초중고교생");
		if(result<95) {
			System.out.println("체중 미달");
		}else if(result>=95 && result<=120) {
			System.out.println("정상");
		}else if(result>=120 && result<=130) {
			System.out.println("경도 비만");
		}else if(result>=130 && result<=150) {
			System.out.println("중도 비만");
		}else if(result>=150) {
			System.out.println("고도 비만");
		}
		
		System.out.println("120미만은 정상 체중");
		System.out.println();
		
		System.out.println("성인");
		if(result<100) {
			System.out.println("체중 미달");
		}else if(result>=100 && result<=110) {
			System.out.println("정상");
		}else if(result>=110 && result<=120) {
			System.out.println("과체중");
		}else if(result>=120 && result<=150) {
			System.out.println("비만");
		}else if(result>=150) {
			System.out.println("고도 비만");
		}
		
		System.out.println("95미만은 체중 미달");*/
		
		//switch문
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("키를 입력하세요");
		int x=Integer.parseInt(scanner.nextLine());
		System.out.println("몸무게를 입력하세요");
		int y=Integer.parseInt(scanner.nextLine());
		
		double result=y/((x-100)*0.9)*100;
		System.out.println();
		System.out.println("초중고교생");
		switch((int)result) {
			case 94:
				System.out.println("체중 미달");
				break;
				
			case 95:case 96:case 97:case 98:case 99:case 100:case 101:
			case 102:case 103:case 104:case 105:case 106:case 107:case 108:
			case 109:case 110:case 111:case 112:case 113:case 114:case 115:
			case 116:case 117:case 118:
			case 119:
				System.out.println("정상");
				break;
				
			case 120:case 121:case 122:case 123:case 124:case 125:
			case 126:case 127:case 128:
			case 129:
				System.out.println("경도비만");
				break;
				
			case 130:case 131:case 132:case 133:case 134:case 135:
			case 136:case 137:case 138:
			case 139:
				System.out.println("중도 비만");
				break;
				
			case 1000:
				System.out.println("고도 비만");
				break;
				
			default:
				break;
		}
		System.out.println("120미만은 정상 체중");
		System.out.println();
		
		System.out.println("성인");
		switch((int)result) {
			case 99:
				System.out.println("체중 미달");
				break;
			case 100:case 101:case 102:case 103:case 104: 
			case 105: case 106:case 107:case 108:
			case 109:
				System.out.println("정상");
				break;
			case 110:case 111:case 112:case 113:case 114:case 115:
			case 116:case 117:case 118:
			case 119:
				System.out.println("과체중");
				break;
			case 120:case 121:case 122:case 123:case 124:case 125:
			case 126:case 127:case 128:case 129:case 130:case 131:
			case 132:case 133:case 134:case 135:case 136:case 137:
			case 138:case 139:case 140:case 141:case 142:case 143:
			case 144:case 145:case 146:case 147:case 148:
			case 149:
				System.out.println("비만");
				break;
			case 500:
				System.out.println("고도 비만");
			default:
				break;
		}
		
		System.out.println("95미만은 체중 미달");*/
		
		
		//4번
		/*
		int i=1300;
		if(i>=1400 && i<1800) {
			System.out.println("1400이상 1800이하");
		}else {
			System.out.println("1400미만 1800초과");
		}*/
	}
}
