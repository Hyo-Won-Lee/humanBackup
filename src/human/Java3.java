package human;

import java.util.Calendar;

public class Java3 {
	public static void main(String[] args) {
		//���� 1.
		//while��
		/*
		int a=2;
		int b=1;
		b++;
		System.out.println("a: "+a+" b: "+b);
		while(b<15) {
			a+=1;
			b+=a;
		}
		System.out.println("a: "+a+" b: "+b);*/
		
		//for��
		/*
		int a=2;
		int b=1;
		b++;
		System.out.println("a: "+a+" b: "+b);
		for(;b<15;) {
			a+=1;
			b+=a;
		}
		System.out.println("a: "+a+" b: "+b);*/
		
		
		//���� 2.
		/*
		for(int i=1;i<101;i++) {
			if(100%i==0) {
				System.out.println(i);
			}
		}*/
		
		
		//���� 3
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.print("�� ��° ���� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		
		System.out.println(i+"�� ������� "+j+" �� ���");
		for(int k=1;k<i+j;k++) {
			if(i%k==0 && j%k==0) {
				System.out.println(k);
			}
		}*/
		
		//���� 4
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.print("�� ��° ���� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		int k=1;
		System.out.println(i+"��(��) "+j+"�� �ִ�����");
		while(k>0) {
			k=i%j;
			i=j;
			j=k;
		}
		System.out.println(i);*/
		
		//���� 5
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int sum=0;
		for(int i=1;;i++) {
			System.out.print(i +" ��° ���� �Է��ϼ���.>>");
			int j=Integer.parseInt(scanner.nextLine());
			sum+=j;
			if(sum>100) {
				System.out.println(sum);
				break;
			}
		}*/
		
		//���� 6
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int sum=0;
			for(int i=1;i<4;i++) {
				System.out.print(i +" ��° ���� �Է��ϼ���.>>");
				int j=Integer.parseInt(scanner.nextLine());
				if(j>1 && j<10) {
					System.out.println("����� �Է��� ȸ��>>"+i);
					sum+=j;
					System.out.println("����: "+sum);
				}
				if(j<=1 || j>=10){
					System.out.println("�߸� �Է��� ȸ��>>"+i);
				}
			}*/
		
		//���� 7
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.print("�� ��° ���� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		int temp1=i, temp2=j;
		if(i<j){
			i=temp2;
			j=temp1;
		}
		int k=1;
		while(k>0) {
			k=i%j;
			i=j;
			j=k;
		}
		int LCM=temp1*temp2/i;
		System.out.println("�� ���� �ּҰ������"+"'"+LCM+"'"+" �Դϴ�.");
		*/
		
		//���� 8
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.print("�� ��° ���� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		System.out.print("�� ��° ���� �Է��ϼ���.>>");
		int k=Integer.parseInt(scanner.nextLine());
	
		if(i>j) {
			if(j>k) {
				System.out.println("���� ū ��>>");
				System.out.println(i);
				System.out.println("���� ���� ��>>");
				System.out.println(k);
			}else if(j<k) {
				if(i>k) {
					System.out.println("���� ū ��>>");
					System.out.println(i);
					System.out.println("���� ���� ��>>");
					System.out.println(j);
				}else if(i<k) {
					System.out.println("���� ū ��>>");
					System.out.println(k);
					System.out.println("���� ���� ��>>");
					System.out.println(j);
				}
			}
		}else if(j>i) {
				if(i>k) {
					System.out.println("���� ū ��>>");
					System.out.println(j);
					System.out.println("���� ���� ��>>");
					System.out.println(k);
				}else if(k>i) {
					if(j>k) {
						System.out.println("���� ū ��>>");
						System.out.println(j);
						System.out.println("���� ���� ��>>");
						System.out.println(i);
					}else if(j<k) {
						System.out.println("���� ū ��>>");
						System.out.println(k);
						System.out.println("���� ���� ��>>");
						System.out.println(i);
					}
				}
		}*/
		
		//���� 9
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int a[]=new int[5];
		for(int i=1;i<=5;i++) {
			System.out.print(i+"��° ���� ������ �Է��ϼ���.>>");
			int j=Integer.parseInt(scanner.nextLine());
			a[i-1]=j;
		}
		int sum=0;
		for(int i=0;i<1;i++) {
			for(int k=0;k<5;k++) {
				if(a[k]<=60) {
					sum=i+1;
					i++;
				}
			}
		}
		System.out.println("60���� Ż���� ��: "+sum);*/
		
		//���� 10
		/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			System.out.println(sum);
			if(sum==100) {
				break;
			}
		}*/
		
		//���� 11
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("���ڿ��� �Է��ϼ���.>>");
		String str=scanner.nextLine();
		System.out.println(str.substring(0,i));*/
		
		//���� 12
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		int sum=0;
		if(i<j) {
			for(int count=i+1;count<j;count++) {
				sum+=count;
			}
		}else if(i>j){
			for(int count=j+1;count<i;count++) {
				sum+=count;
			}
		}
		System.out.println(sum);*/
		
		//���� 13
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		boolean result=true;
		for(int k=2;k<i;k++) {
			if(i%k==0) {
				result=false;
				break;
			}else {
				result=true;
			}
		}
		if(result) {
			System.out.println(i+" �� �Ҽ���.");
		}else {
			System.out.println(i+" �� �Ҽ��� �ƴ�.");
		}*/
		
		//���� 14
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		for(int k=i;k<=(i+j)-1;k++) {
			System.out.println(k);
		}*/
		
		//���� 15
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		int num=0;
		for(int j=1;j<10;j++) {
			num=i*j;
			System.out.printf("%d X %d = %d",i,j,num);
			System.out.println();
		}*/
		
		//���� 16
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		int a[]=new int[1000];
		int sum=0;
		for(int k=2;k<15;k++) {
			if(k%i==0) {
				a[k-2]=k;
				sum=1000/i;
			}
		}
		System.out.println(sum+"��");*/
		
		//���� 17
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���� ���ڸ� �Է��ϼ���.>>");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("���� ���ڸ� �Է��ϼ���.>>");
		int j=Integer.parseInt(scanner.nextLine());
		int count=1;
		for(int k=1;k<=i;k++) {
			for(int l=1;l<=j;l++) {
				System.out.printf("%d\t",count++);
			}
			System.out.println();
		}*/
		
		//���� 18
		/*
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%d\t",count++);
			}
			System.out.println();
		}*/
		
		//���� 19
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int year=Integer.parseInt(scanner.nextLine());
		System.out.println("���� �Է��ϼ���.>>");
		int month=Integer.parseInt(scanner.nextLine());
		System.out.println();
		System.out.println("\t\t"+"<"+year+"�� "+month+"�� �޷�"+">");
		System.out.println();
		System.out.print("��\t��\tȭ\t��\t��\t��\t��");

        int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
        
        
        int[] END_DAY= {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        if((year%4==0&&year%100!=0)||(year%400==0)){
            END_DAY[1]=29;
        }else {
            END_DAY[1]=28;
        }
        
        
        for(int i=0;i<month-1;i++) {
            total+=END_DAY[i];
        }
        
        
        //1������ ����
        total++;
        int day=total%7;
        

        for(int i=0;i<month-1;i++) {
            total+=END_DAY[i];
        }
        

        System.out.println();
        for(int i=1;i<=END_DAY[month-1];i++){
        	if(i==1){
        		for(int j=0;j<day;j++){
        			System.out.print("\t");
        		}
            }
        	System.out.printf("%2d\t",i);
        	day++;
        	if(day>6) {
        		day=0;
        		System.out.println();
            }
        }*/

	    
		//���� 20
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int win=0;
		int lose=0;
		int count1=0;
		int count2=0;
		for(int a=0;a<5;a++) {
			System.out.print("'�ո�'�Ǵ� '�޸�'�� �Է��ϼ���.>>");
			String str=scanner.nextLine();
			System.out.println();
			int i=(int)(Math.random()*2+1);
			//1�� �ո� 2�� �޸�
			if(str.equals("�ո�")) {
				if(i==1) {
					System.out.println("��ǻ�ʹ� �ո��� �½��ϴ�.");
					win=count1+1;
				}else {
					System.out.println("��ǻ�ʹ� �޸��� �½��ϴ�.");
					lose=count2+1;
				}
			}else if(str.equals("�޸�")){
				if(i==1) {
					System.out.println("��ǻ�ʹ� �ո��� �½��ϴ�.");
					lose=count2+1;
				}else {
					System.out.println("��ǻ�ʹ� �޸��� �½��ϴ�.");
					win=count1+1;
				}
			}
			System.out.println("���� Ƚ��: "+win);
			System.out.println("Ʋ�� Ƚ��: "+lose);
			System.out.println();
		}*/
		
		//���� 21
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		int count1=0;
		int count2=0;
		for(int a=0;a<5;a++) {
			System.out.print("'1'���� '6'������ ������ ���ڸ� �Է��ϼ���.>>");
			int m=Integer.parseInt(scanner.nextLine());
			System.out.println();
			int i=(int)(Math.random()*6+1);
			if(m==1) {
				if(i==1) {
					System.out.println("��ǻ�ʹ� '1'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}else if(m==2){
				if(i==2) {
					System.out.println("��ǻ�ʹ� '2'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}
			else if(m==3){
				if(i==3) {
					System.out.println("��ǻ�ʹ� '3'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}
			else if(m==4){
				if(i==4) {
					System.out.println("��ǻ�ʹ� '4'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}
			else if(m==5){
				if(i==5) {
					System.out.println("��ǻ�ʹ� '5'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}else if(m==6){
				if(i==6) {
					System.out.println("��ǻ�ʹ� '6'�� �½��ϴ�.");
					count1+=1;
				}else {
					System.out.println("��ǻ�ʹ�"+i+"�� �½��ϴ�.");
					count2+=1;
				}
			}
			System.out.println("���� Ƚ��: "+count1);
			System.out.println("Ʋ�� Ƚ��: "+count2);
			System.out.println();
		}*/
		
	}
}
