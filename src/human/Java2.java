package human;

public class Java2 {
	public static void main (String[] args) {
		//if문 예제
		//6번
		/*
		boolean b1=5!=3;//t
		boolean b2=5==3;//f
		if(b1) { 
			if(b2) {
				System.out.println("1번");
			}else {
				System.out.println("2번");
			}
		}else { 
		System.out.println("3번");
		System.out.println("4번");
		}*/
		
		//if심화 문제
		//1번
		/*
		int i=15;
		if(i>14) {
			System.out.println("14보다 큰 수");
		}
		
		int j=25;
		if(j<=12 || j>22) {
			System.out.println("12이하 22보다 큰 수");
		}
		
		int k=8;
		if(k>5 && k<=9) {
			System.out.println("5보다 크고 9이하인 수");
		}*/
			
		//2번
		/*
		int i=12;
		if(i<=14) {
			System.out.println("14이하인 수");
		}
		
		int j=20;
		if(j>12 && j<=22) {
			System.out.println("12보다 크고 22이하인 수");
		}
		
		int k=4;
		if(k<=5 || k>9) {
			System.out.println("5이하이고 9보다 큰 수");
		}*/
		
		//3번
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
		
		//4번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("x좌표를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("y좌표를 입력하세요");
		int j=Integer.parseInt(scanner.nextLine());
		if(i>0 && j>0) {
			System.out.println("2번 위치");
		}else if(i<0 && j<0) {
			System.out.println("4번 위치");
		}else if(i>0 && j<0) {
			System.out.println("3번 위치");
		}else if(i<0 && j>0) {
			System.out.println("1번 위치");
		}else if(i==0 || j==0) {
			System.out.println("x축이나 y축 위에 있다.");
		}*/
		
		
		//else if  혹은 switch문
		//1번
		//else if문
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		int a=5;
		int b=7;
		if(i==0) {
			a+=2;
		}else if(i==1) {
			b+=4;
		}else if(i==2) {
			a=a+b;
		}else {
			b=b+5;
		}
		System.out.println(a+b);
		
		//switch문
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=Integer.parseInt(scanner.nextLine());
		int a=5;
		int b=7;
		switch(i) {
			case 0:
				a+=2;
				break;
			case 1:
				b+=4;
				break;
			case 2:
				a+=b;
				break;
			default:
				b+=5;
				break;
		}
		System.out.println(a+b);*/
		
		//2번
		//(1)번문제
		/*
		String a="아침 밥 먹었음";
		if(a=="아침 밥 먹었음") {
			System.out.println("밥을 먹었음");
		}else {
		
		}*/
		
		//(2)번문제
		/*
		String a="아침에 빵 먹었음";
		if(a=="아침에 빵 먹었음") {
			System.out.println("빵을 먹었음");
		}else {
			System.out.println("밥을 먹었음");
		}*/
		
		//(3)번문제
		/*
		String a="아침 밥 먹었음";
		if(a=="아침 밥 먹었음") {
			System.out.println("밥을 먹었음");
		}else {
			System.out.println("빵을 먹었음");
		}*/
		
		//(4)번문제
		/*
		String a="아침 밥 먹었음";
		if(a=="아침 밥 먹었음") {
			System.out.println("밥을 먹었음");
		}else {
			System.out.println("아무것도 안먹었음");
		}*/
		
		
		//5번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("밥을 먹었습니까? 먹었으면 '밥'을 입력하세요");
		String message=scanner.next();
		if(message.equals("밥")) {
			System.out.println("아침으로 밥을 먹음");
		}else if(message.equals("빵")) {
			System.out.println("아침으로 빵을 먹음");
		}else if(message.equals("국")) {
			System.out.println("아침으로 국을 먹음");
		}else if(message.equals("우유")){
			System.out.println("아침으로 우유를 먹음");
		}*/
		
		//6번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("밥, 빵 둘 중 하나를 입력하세요");
		String i=scanner.next();
		if(i.equals("밥")) {
			System.out.println("후식으로 '국'과 '아이스크림'중 하나를 택하세요.");
			String j=scanner.next();
			System.out.println(j+"를 맛있게 드세요.");
		}else if(i.equals("빵")) {
			System.out.println("후식으로 '우유'와 '커피'중 하나를 택하세요.");
			String k=scanner.next();
			System.out.println(k+"를 맛있게 드세요.");
		}*/

		//7번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("밥을 먹었습니까? 먹었으면 '밥'을 입력하세요");
		String i=scanner.next();
		if(i.equals("밥")) {
			System.out.println("밥을 먹었음"+" 국을 먹었음");
		}else {
			System.out.println("빵을 먹었음"+" 우유를 먹었음");
		}*/
		
		//8번
		//if문
		/*
		String sun="해";
		String cloud="구름";
		String moon="달";
		String star="별";
		boolean isFlag1=true;
		boolean isFlag2=true;
		if(isFlag1) {
			for(int i=0;i<1;i++) {
				for(int j=i;j<i+1;j++) {
					System.out.println(sun);
				}
				System.out.println(sun+","+cloud);
			}
			System.out.println(cloud);
		}
		
		if(isFlag2) {
			for(int i=0;i<1;i++) {
				for(int j=i;j<i+1;j++) {
					System.out.println(moon);
				}
				System.out.println(moon+","+star);
			}
			System.out.println(star);
		}*/
		
		
		
		//3번
		/*
		int i=(new java.util.Date()).getDay();
		if(i==0) {
			System.out.println("일요일");
		}else if(i==1) {
			System.out.println("월요일");
		}else if(i==2) {
			System.out.println("화요일");
		}else if(i==3) {
			System.out.println("수요일");
		}else if(i==4) {
			System.out.println("목요일");
		}else if(i==5) {
			System.out.println("금요일");
		}else {
			System.out.println("토요일");
		}*/
		
		//4번
		/*
		int i=(new java.util.Date()).getMonth();
		if(i==0) {
			System.out.println("1월이고 31일입니다.");
		}else if(i==1) {
			System.out.println("2월이고 28일입니다");
		}else if(i==2) {
			System.out.println("3월이고 31일입니다.");
		}else if(i==3) {
			System.out.println("4월이고 30일입니다.");
		}else if(i==4) {
			System.out.println("5월이고 31일입니다.");
		}else if(i==5) {
			System.out.println("6월이고 30일입니다.");
		}else if(i==6){
			System.out.println("7월이고 31일입니다.");
		}else if(i==7){
			System.out.println("8월이고 31일입니다.");
		}else if(i==8){
			System.out.println("9월이고 30일입니다.");
		}else if(i==9){
			System.out.println("10월이고 31일입니다.");
		}else if(i==10){
			System.out.println("11월이고 30일입니다.");
		}else if(i==11){
			System.out.println("12월이고 31일입니다.");
		}*/
		
		//5번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("사이즈를 입력하세요");
		int i=Integer.parseInt(scanner.next());
		if(i>=90 && i<95) {
			System.out.println("S");
		}else if(i>=95 && i<100) {
			System.out.println("M");
		}else if(i>=100 && i<105) {
			System.out.println("L");
		}else if(i>=105 && i<120) {
			System.out.println("XL");
		}else if(i>=110) {
			System.out.println("XXL");
		}*/
		
		//6번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("java 점수를 입력하세요");
		int i=Integer.parseInt(scanner.next());
		System.out.println("html 점수를 입력하세요");
		int j=Integer.parseInt(scanner.next());
		System.out.println("db 점수를 입력하세요");
		int k=Integer.parseInt(scanner.next());
		if(i<=40 || j<=40 || k<=40) {
			if(i<=40) {
				System.out.println("java "+i);
			}else if(j<=40) {
				System.out.println("html "+j);
			}else if(k<=40) {
				System.out.println("db "+k);
			}
			System.out.println("과락");
		}else if((i+j+k)/3>=60) {
			System.out.println("합격");
		}else if((i+j+k)/3<60) {
			System.out.println("불합격");
		}*/
		
		//2번 신체사이즈
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("목둘레(cm), 가슴둘레(cm), 팔길이(cm), 허리둘리(inch) 중 하나를 입력하세요");
		System.out.println("목둘레(cm)는 33부터 45까지 입력");
		System.out.println("가슴둘레(cm)는 86부터 132까지 입력");
		System.out.println("팔길이(cm)는 78부터 91까지 입력");
		System.out.println("허리둘레(inch)는 28부터 40까지 입력");
		int i=Integer.parseInt(scanner.next());
		if((i>=33 && i<=35) || (i>=86 && i<=91) || (i>=78 && i<=81) || (i>=28 && i<=29)) {
			System.out.println("미국 사이즈: S");
			System.out.println("한국 사이즈: 90~95");
		}else if((i>=36 && i<=37) || (i>=96 && i<=102) || (i>=81 && i<=84) || (i>=30 && i<=31)) {
			System.out.println("미국 사이즈: M");
			System.out.println("한국 사이즈: 95~100");
		}else if((i>=38 && i<=39) || (i>=107 && i<=112) || (i>=84 && i<=86) || (i>=32 && i<=34)) {
			System.out.println("미국 사이즈: L");
			System.out.println("한국 사이즈: 100~105");
		}else if((i>=41 && i<=42) || (i>=117 && i<=122) || (i>=86 && i<=89) || (i>=34 && i<=37)) {
			System.out.println("미국 사이즈: XL");
			System.out.println("한국 사이즈: 105~120");
		}else if((i>=43 && i<=45) || (i>=127 && i<=132) || (i>=89 && i<=91) || (i>=38 && i<=40)) {
			System.out.println("미국 사이즈: XXL");
			System.out.println("한국 사이즈: 110~");
		}*/
		
		
		//최종 프로젝트
		//1번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("첫 번째 수 입력>>");
		int i=Integer.parseInt(scanner.next());
		System.out.println("연산자 선택>>1. '+'  2. '-'  3. 'x'  4. '/' ");
		int a=Integer.parseInt(scanner.next());
		System.out.println("두 번째 수 입력>>");
		int j=Integer.parseInt(scanner.next());
		if(a==1) {
			int sum=i+j;
			System.out.println(i+"+"+j+"="+sum+"입니다.");
		}else if(a==2) {
			int minus=i-j;
			System.out.println(i+"-"+j+"="+minus+"입니다.");
		}else if(a==3) {
			int mul=i*j;
			System.out.println(i+"x"+j+"="+mul+"입니다.");
		}else if(a==4) {
			int div=i/j;
			System.out.println(i+"/"+j+"="+div+"입니다.");
		}*/
		
		//2번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("가위, 바위, 보 게임을 시작합니다.");
		System.out.println("1. 가위, 2. 바위, 3.보 중 숫자 하나를 선택하세요.>>");
		int i=Integer.parseInt(scanner.next());
		if(i==1) {
			int j= (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("상대방은 '가위'를 냈습니다.");
			}else if(j==2) {
				System.out.println("상대방은 '바위'를 냈습니다.");
			}else if(j==3) {
				System.out.println("상대방은 '보'를 냈습니다.");
			}
		}else if(i==2) {
			int j= (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("상대방은 '가위'를 냈습니다.");
			}else if(j==2) {
				System.out.println("상대방은 '바위'를 냈습니다.");
			}else if(j==3) {
				System.out.println("상대방은 '보'를 냈습니다.");
			}
		}else if(i==3) {
			int j=  (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("상대방은 '가위'를 냈습니다.");
			}else if(j==2) {
				System.out.println("상대방은 '바위'를 냈습니다.");
			}else if(j==3) {
				System.out.println("상대방은 '보'를 냈습니다.");
			}
		}*/
			
		//3번
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("소득금액을 입력하세요. (단위: 만원)>>");
		int i=Integer.parseInt(scanner.next());
		int total=0;
		if(i<=1200) {
			total=(i*6)/100;
			System.out.println("양도소득세: "+total+"만원 입니다.");
		}else if(i>1200 && i<=4600) {
			total=((i*15)/100)-108;
			System.out.println("양도소득세: "+total+"만원 입니다." );
		}else if(i>4600 && i<=8800) {
			total=((i*24)/100)-522;
			System.out.println("양도소득세: +total+만원 입니다.");
		}else if(i>8800 && i<=10500) {
			total=((i*35)/100)-1490;
			System.out.println("양도소득세: "+total+"만원 입니다.");
		}else if(i>10500 && i<=30000) {
			total=((i*38)/100)-1940;
			System.out.println("양도소득세: "+total+"만원 입니다.");
		}else if(i>30000 && i<=50000) {
			total=((i*40)/100)-2540;
			System.out.println("양도소득세: "+total+"만원 입니다.");
		}else if(i>50000) {
			total=((i*42)/100)-3540;
			System.out.println("양도소득세: "+total+"만원 입니다.");
		}*/
		
		
		
		
		
		
		
		
		
		
	}
}
