package com.human.ex;

public class Java8 {

	public static String absence(int a) {
		String student[]=new String[50];
		student[a-1]="�Ἦ";
		return student[a-1];
	}
	
	public static String attendance(int a) {
		String student[]=new String[50];
		student[a-1]="�⼮";
		return student[a-1];
	}
	
	public static String leave(int a) {
		String student[]=new String[50];
		student[a-1]="����";
		return student[a-1];
	}
	
	public static String late(int a) {
		String student[]=new String[50];
		student[a-1]="����";
		return student[a-1];
	}
	
	public static void main(String[] args) {
		//�迭
		//32page~
		
		//1��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int a[]=new int[5];
//		System.out.println("���� �Է�(5��)>>");
//		for(int k=0;k<5;k++) {
//			int i=Integer.parseInt(sc.nextLine());
//				a[k]=i;
//		}
//		System.out.print(">>");
//		int j=Integer.parseInt(sc.nextLine());
//		for(int k=0;k<5;k++) {
//			if(a[k]==j) {
//				System.out.println("a["+k+"]"+"��° �ε����� ����ֽ��ϴ�.");
//			}
//		}
		
		//2��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		char a[]=new char[5];
//		System.out.println("���� �Է�(5��)>>");
//		for(int k=0;k<5;k++) {
//			char i=sc.nextLine().charAt(0);
//				a[k]=i;
//		}
//		System.out.print(">>");
//		char j=sc.nextLine().charAt(0);
//		for(int k=0;k<5;k++) {
//			if(a[k]==j) {
//				System.out.println("a["+k+"]"+"��° �ε����� ����ֽ��ϴ�.");
//			}
//		}
		
		//3��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println(">>");
//		int i=Integer.parseInt(sc.nextLine());
//		int a[]=new int[i];
//		for(int j=0,k=1;j<i;j++,k++) {
//			a[j]=k;
//			if(k==3)
//				k=0;
//		}
//		for(int j=0;j<i;j++) {
//			System.out.println(a[j]);
//		}
		
		//4��
		//����
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("���� �Է�(5��)>>");
//		int a[]= new int[5];
//		for(int k=0;k<5;k++) {
//			int i=Integer.parseInt(sc.nextLine());
//				a[k]=i;
//		}
//		for(int i=0;i<5;i++) {
//			System.out.print(a[i]+",");
//		}
//		System.out.println();
//		for(int i=4;i>=0;i--) {
//			System.out.print(a[i]+",");
//		}
		
		//����
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("���� �Է�(5��)>>");
//		int a[]= new int[5];
//		for(int k=0;k<5;k++) {
//			int i=Integer.parseInt(sc.nextLine());
//				a[k]=i;
//		}
//		for(int i=4;i>=0;i--) {
//			System.out.print(a[i]+",");
//		}
//		System.out.println();
//		for(int i=0;i<5;i++) {
//			System.out.print(a[i]+",");
//		}
		
		//5��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		System.out.println("�̵�����>>");
//		String str=sc.nextLine();
//		System.out.println("�̵� ĭ ��>>");
//		int i=Integer.parseInt(sc.nextLine());
//		System.out.println("ä�� ����>>");
//		int j=Integer.parseInt(sc.nextLine());
//		if(str.equals("����")) {
//			for(int l=0;l<i;l++) {
//				for(int k=0;k<8;k++) {
//					a[k]=a[k+1];
//				}
//			}
//			for(int k=9-i;k<9;k++) {
//				a[k]=j;
//			}
//			for(int k=0;k<9;k++) {
//				System.out.print(a[k]+",");
//			}
//		}else {
//			for(int l=0;l<i;l++) {
//				for(int k=8;k>0;k--) {
//					a[k]=a[k-1];
//				}
//			}
//			for(int k=0;k<i;k++) {
//				a[k]=j;
//			}
//			for(int k=0;k<9;k++) {
//				System.out.print(a[k]+",");
//			}
//		}
		
		//6��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		System.out.println("ȸ������>>");
//		String str=sc.nextLine();
//		System.out.println("Ƚ��>>");
//		int i=Integer.parseInt(sc.nextLine());
//		if(str.equals("����")) {
//			for(int j=0;j<i;j++) {
//				for(int k=0;k<8;k++) {
//					a[k]=a[k+1];
//				}		
//			}
//			for(int k=0,l=1;k<i;k++,l++) {
//				a[k+(9-i)]=l;
//			}
//			for(int k=0;k<9;k++) {
//				System.out.print(a[k]+",");
//			}
//		}else if(str.equals("������")) {
//			for(int j=0;j<i;j++) {
//				for(int k=8;k>0;k--) {
//					a[k]=a[k-1];
//				}		
//			}
//			for(int k=0,l=(9+1)-i;k<i;k++,l++) {
//				a[k]=l;
//			}
//			for(int k=0;k<9;k++) {
//				System.out.print(a[k]+",");
//			}
//		}
		
		//7��
//		int a[]=new int[100];
//		for(int i=0,count=0;i<100;i++,count++) {
//			a[i]=count;
//		}
//		for(int k=2;k<=50;k++) {
//			for(int i=0;i<100;i++) {
//				if(i==k) {
//					continue;
//				}
//				if(a[i]%k==0 || i==1) {
//					a[a[i]]=0;
//				}
//			}
//		}
//		for(int i=0;i<100;i++) {
//			System.out.println(a[i]);
//		}
		
		//8��
//		int rand=0;
//		int i=0,num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
//		int a[]=new int[10];
//		int count[]=new int[6];
//		while(i<10) {
//			rand=(int)(Math.random()*6)+1;
//			for(int k=0;k<10;k++) {
//				a[k]=rand;
//			}
//			for(int k=0;k<10;k++) {
//				if(a[k]==1) {
//					num1++;count[0]=num1;
//				}else if(a[k]==2) {
//					num2++;count[1]=num2;
//				}else if(a[k]==3) {
//					num3++;count[2]=num3;
//				}else if(a[k]==4) {
//					num4++;count[3]=num4;
//				}else if(a[k]==5) {
//					num5++;count[4]=num5;
//				}else if(a[k]==6) {
//					num6++;count[5]=num6;
//				}
//			}
//			System.out.println("�ֻ��� : "+rand);
//			i++;
//		}
//		for(int k=1;k<=6;k++) {
//			System.out.println(k+" : "+count[k-1]/10+"ȸ");
//		}

		//9��
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int i=0;
//		char answer='a';
//		boolean isFlag1=true;
//		boolean isFlag2=true;
//		boolean isFlag3=true;
//		boolean isFlag4=true;
//		String student[]=new String[50]; //���� �̸� ��� �ε����� �л� �̸����� ��.
//		for(int k=0;k<50;k++) {
//			student[k]="";
//		}
//		while(i<6) {
//			System.out.print("1. ��ü �⼮����  2. �Ἦ�� �߰�  3. �⼮�� �߰�  4. ������ �߰�  5. ������ �߰�  6. ���α׷� ����");
//			i=Integer.parseInt(sc.nextLine());
//			switch(i) {
//				case 1:
//					for(int count=0;count<50;count++) {
//						System.out.print(student[count]+"\t");
//						if(count%10==9) {
//							System.out.println();
//						}
//					}
//					System.out.println();
//					break;
//				
//				case 2:
//					while(isFlag1) {
//						System.out.println("----�Ἦ�� �߰� �޴�----");
//						System.out.print("1~50 ���� �Է�>>");
//						int j=Integer.parseInt(sc.nextLine());
//						if(absence(j).equals("�Ἦ")) {
//							student[j-1]="�Ἦ";
//						}
//						System.out.print("���� �޴��� ���� �ͽ��ϱ�? Y/N");
//						answer=sc.nextLine().charAt(0);
//						if(answer=='Y' || answer=='y') {
//							isFlag1=false;
//						}
//					}
//					break;
//				
//				case 3:
//					while(isFlag2) {
//						System.out.println("----�⼮�� �߰� �޴�----");
//						System.out.print("1~50 ���� �Է�>>");
//						int j=Integer.parseInt(sc.nextLine());
//						if(attendance(j).equals("�⼮")) {
//							student[j-1]="�⼮";
//						}
//						System.out.print("���� �޴��� ���� �ͽ��ϱ�? Y/N");
//						answer=sc.nextLine().charAt(0);
//						if(answer=='Y' || answer=='y') {
//							isFlag2=false;
//						}
//					}
//					break;
//					
//				case 4:
//					while(isFlag3) {
//						System.out.println("----������ �߰� �޴�----");
//						System.out.print("1~50 ���� �Է�>>");
//						int j=Integer.parseInt(sc.nextLine());
//						if(leave(j).equals("����")) {
//							student[j-1]="����";
//						}
//						System.out.print("���� �޴��� ���� �ͽ��ϱ�? Y/N");
//						answer=sc.nextLine().charAt(0);
//						if(answer=='Y' || answer=='y') {
//							isFlag3=false;
//						}
//					}
//					break;
//					
//				case 5:
//					while(isFlag4) {
//						System.out.println("----������ �߰� �޴�----");
//						System.out.print("1~50 ���� �Է�>>");
//						int j=Integer.parseInt(sc.nextLine());
//						if(late(j).equals("����")) {
//							student[j-1]="����";
//						}
//						System.out.print("���� �޴��� ���� �ͽ��ϱ�? Y/N");
//						answer=sc.nextLine().charAt(0);
//						if(answer=='Y' || answer=='y') {
//							isFlag4=false;
//						}
//					}
//					break;
//				
//				default:
//					break;
//			}
//		}
//		System.out.println("���α׷� ����");
	}
}
