package human;

public class Java003 {
	public static void main(String[] args) {
	
	//�ִ�����
	//	java.util.Scanner scanner=new java.util.Scanner(System.in);
	//	System.out.print("ù ��° ���ڸ� �Է��ϼ���>>");
	//	int a=Integer.parseInt(scanner.nextLine());
	//	System.out.print("�� ��° ���ڸ� �Է��ϼ���>>");
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
			
		
	//2�� ��� ���ϱ�
	//i�� 2�� ������� �Ǻ��ϸ鼭 i�� �����غ���.
	//�ּҰ����
//	java.util.Scanner scanner=new java.util.Scanner(System.in);
//	System.out.print("ù ��° ���ڸ� �Է��ϼ���>>");
//	int a=Integer.parseInt(scanner.nextLine());
//	System.out.print("�� ��° ���ڸ� �Է��ϼ���>>");
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
		
	//100������ ���а��� ������ 5�� �Է¹޾� 60���� Ż���ڰ� ������� ����ϴ� ���α׷��� ������ ����.
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
		
		
		
		//1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ ������� ������� ����Ͻÿ�. 
		//1:1 2:3 3:6 4:10 5:15 6:21 ��  100������ ���յ��� ������ ���� ��µǸ� �ȴ�.
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
//			if(i%count==1) { //1~25���� ���ڰ� �����ϸ鼭 6,11,15,21(5�� ���� �������� 1)���� �ٹ�ȣ ����.
//				lineCount++;
//			}
//			
//			if(lineCount%2==0) { 
//				System.out.print((2*count)*(lineCount/2)-(i-1)%5+"\t"); //¦�����̸� ���ڰ� ����
//			}else {
//				System.out.print(i+"\t"); //Ȧ�����̸� �״�� ����
//			}
//			
//			if(i%count==0) {
//				System.out.println(); //5�� ����� ����
//			}
//		}


/*
		//�ִ����� ���� Ǯ�� ����
		//6�� ���
		
//		for(int i=1;i<=6;i++) {
//			if(6%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//10�� ���
		
//		for(int i=1;i<=10;i++) {
//			if(10%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//6��10�� �����
		
//		for(int i=1;i<=10;i++) {
//			if(6%i==0 && 10%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//6�� 10�� �ִ�����
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
		//�ּҰ����
		//2�� ���
		//2%2==0, 4%2==0, 6%2==0
//		for(int i=1;i<=20;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//6�� ���
		//6%6==0, 12%6==0, 18%6==0
//		for(int i=1;i<=20;i++) {
//			if(i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		//2�� 6�� �����
//		for(int i=1;i<=20;i++) {
//			if(i%2==0&&i%6==0) {
//				System.out.println(i);
//			}
//		}
		
		//2�� 6�� �ּҰ����
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
		
		
		//100������ ���а��� ������ 5�� �Է¹޾� 60���� Ż���ڰ� ������� ����ϴ� ���α׷��� ������ ����.
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
		
		
		//1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ ������� ������� ����Ͻÿ�. 
//		int sum=0;
//		for(int i=1;i<20;i++) {
//			sum+=i;
//			if(sum>100) {
//				break;
//			}
//			System.out.println(i+","+sum);
//		}
		
		
		//������ ���� ��� �ǵ��� ���α׷��� �ϼ��� ����.
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
