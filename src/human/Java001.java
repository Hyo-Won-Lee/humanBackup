package human;

public class Java001 {
	public static void main(String[] args) {
		// 7~21까지의 합을 구해보자.
		/*
		int sum=0;
		for(int i=7;i<22;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		sum=0;
		
		
		int i=7;
		while(i<22) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);*/
		
		
		
		
		//2. 숫자 3개를 입력받아 작은수부터 출력해보자.
		/*
		int a=10;
		int b=99;
		int c=56;
		boolean isA=false;
		boolean isB=false;
		boolean isC=false;
		//교환 없이 출력
		if(a>b) {
			if(b>c) {
				isC=true;
				System.out.println(c);
			}else {
				isB=true;
				System.out.println(b);
			}
		}else {
			if(a>c) {
				isC=true;
				System.out.println(c);
			}else {
				isA=true;
				System.out.println(a);
			}
		}   //가장 작은 수 추출
		
		
		if(isA==true) {
			if(b>c) {
				System.out.println(c);
				System.out.println(b);
			}else {
				System.out.println(b);
				System.out.println(c);
			}
		}else if(isB==true) {
			if(a>c) {
				System.out.println(c);
				System.out.println(a);
			}else {
				System.out.println(a);
				System.out.println(c);
			}
		}else {
			if(a>b) {
				System.out.println(b);
				System.out.println(a);
			}else {
				System.out.println(a);
				System.out.println(b);
			}
		}   //그 다음 작은 수 추출
		*/
		/*
		int a=3;
		int b=22;
		int c=1;
		
		if(a>b) {
			int t;	t=a;	a=b;	b=t;
		}
		if(b>c) {
			int t; 	t=b;	b=c;	c=t;
		}
		if(a>b) {
			int t;	t=a;	a=b;	b=t;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		
		/*별찍기
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");//3 2 1 0
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");//1 2 3 4
			}
			System.out.print("\n");
		}*/
		
		//(3,6) (5,8) (7,10)를 2중 for문과 while문으로
		/*
		int countJ=0;
		for(int j=3;j<=7;j=j+2) {
			countJ++;
			int countI=0;
			for(int i=6;i<=10;i=i+2) {
				countI++;
				if(countJ==countI) {
					System.out.println(j+":"+i);
				}
			}
		}*/
		
		//5. 10개짜리 배열에 3의 배수를 넣고 배열에 들어있는 수 중 2의 배수만 출력
		/*
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i*3;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}*/
		/*
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=i*3;
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}*/
		
		
		
		//10/20일 강의
		//Math.random();은 랜덤숫자 만들기 함수
		//'0<=Math.random()<1'과 같이 사용한다.
		//Math.random()은 실수이므로 int로 형변환하면 정수를 얻을 수 있다.
		//원하는 정수 범위는 곱하기를 통해서 만들고, 정수 시작 위치는 더하기를
		//이용해서 만들면 된다. 
		
	
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
}
