package com.human.ex;

import java.util.Scanner;
import java.util.Arrays;

public class Java10 {

	
	public static void startDisplay() {
		Scanner sc = new Scanner(System.in);
		String ID="";
		int PASSWORD=0;
		System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
	}
	
	public static void adminDisplay() {
		Scanner sc = new Scanner(System.in);
		String ID="";
		int PASSWORD=0;
		System.out.println("������ ����");
		System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
	}
	
	
	public static int deposit(int account, int j) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ա� �ݾ��� �Է��ϼ���>>");
			j=sc.nextInt();
			account=account+j;
			System.out.println(j+"���� �ԱݵǾ����ϴ�.");
		return account;
	}
	
	public static int withdraw(int k, int account) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �ݾ��� �Է��ϼ���>>");
		k=sc.nextInt();
		if(account-k<0){
			System.out.println("�ѱݾ��� 0�� �̸��̹Ƿ� �� �̻� ����� �� �����ϴ�.");
		}else{
			account=account-k;
			System.out.println(k+"���� ����߽��ϴ�.");
		}
		return account;
	}
	
	
	
	public static void main(String[] args) {
		//�޼ҵ� ���� ���� 
		int[] password= new int[5];password[0]=123;password[1]=456;
		String[] id= new String[5];id[0]="apple";id[1]="banana";
		String[] name= new String[5];name[0]="������";name[1]="�����";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int account=0,i=0,j=0,k=0,PASSWORD=0,pw=0,l=0;
		boolean isFlag1=true,isFlag2=true;
		String ID="",str="",NAME="";
		while(isFlag1) {
			System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>\r");
			System.out.print("ID>>");
			ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=sc.nextInt();
			if((ID.equals(id[0]) && PASSWORD==password[0])||(ID.equals(id[1]) && PASSWORD==password[1])) {
					str=ID.equals(id[0])?name[0]:name[1];
					System.out.println(str+"���� �α��� �ϼ̽��ϴ�.");
					System.out.println("1.�Ա�  2. ���  3. ��ȸ  4. ����");
					i=sc.nextInt();
					while(i!=4){
						if(i==1){
							System.out.print("�Ա� �ݾ��� �Է��ϼ���>>");
							j=sc.nextInt();
								account=account+j;
								System.out.println(j+"���� �ԱݵǾ����ϴ�.");
						}else if(i==2){
							System.out.print("��� �ݾ��� �Է��ϼ���>>");
							k=sc.nextInt();
							if(account-k<0){
								System.out.println("�ѱݾ��� 0�� �̸��̹Ƿ� �� �̻� ����� �� �����ϴ�.");
							}else{
								account=account-k;
								System.out.println(k+"���� ����߽��ϴ�.");
							}
						}else if(i==3){
							System.out.println(account+"���� ���ҽ��ϴ�.");
						}else{
							System.out.println("�Է��� �� ���� �޴� ��ȣ�Դϴ�.");
						}
						System.out.print("���Ͻô� �޴� ��ȣ�� �Է��ϼ���>>");
						i=sc.nextInt();
					}
						System.out.println("�����մϴ�.");
						System.out.println();
						while(isFlag2) {
							System.out.println("----------������ ����----------");
							System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>");
							System.out.print("ID>>");
							ID=sc.nextLine();ID=sc.nextLine();
							System.out.print("PASSWORD>>");
							PASSWORD=Integer.parseInt(sc.nextLine());
							if((ID.equals(id[0]) && PASSWORD==password[0])||(ID.equals(id[1]) && PASSWORD==password[1])) {
								str=ID.equals(id[0])?name[0]:name[1];
								System.out.println(str+"���� �α��� �ϼ̽��ϴ�.");
								for(;;) {
									System.out.println("1.���� �߰�  2.���� ����  3.��� ����� ���� Ȯ��  4.id�� Ư�� ����� ���� Ȯ��  5.���� ");
									i=Integer.parseInt(sc.nextLine());
									switch(i) {
										case 1:
											System.out.print("�̸�>>");NAME=sc.nextLine();name[name.length-3]=NAME;
											System.out.print("ID>>");ID=sc.nextLine();id[id.length-3]=ID;
											System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());password[password.length-3]=PASSWORD;
											break;
											
										case 2:
											System.out.print("�̸�>>");NAME=sc.nextLine();name[name.length-3+l]=null;
											System.out.print("ID>>");ID=sc.nextLine();id[id.length-3+l]=null;
											System.out.print("PASSWORD>>");PASSWORD=sc.nextInt();password[password.length-3+l]=0;
											break;
										
										case 3:
											for(int m=0;m<id.length;m++) {
												System.out.println("ID : "+id[m]);
												System.out.println("PASSWORD : "+password[m]);
												System.out.println("NAME : "+name[m]);
												System.out.println();
											}
											break;
										
										case 4:
											System.out.println("ID>>");
											ID=sc.nextLine();
											for(int m=0;m<ID.length();m++) {
												if(ID.equals(id[m])) {
													System.out.println("ID : "+id[m]);
													System.out.println("PASSWORD : "+password[m]);
													System.out.println("NAME : "+name[m]);
												}
											}
											break;
										
										case 5:
											System.out.println("ID>>");ID=sc.nextLine();
											if(ID.equals("exit")||ID.equals("EXIT"))
												System.out.println("���α׷� ����");
											isFlag2=false;
											break;
											
										default:
											break;
									}
								}
							}else {
								System.out.println("ID�� PASSWORD�� �ٽ� �Է��ϼ���.\r");
								System.out.println();
							}
						}
			}else {
				System.out.println("ID�� PASSWORD�� �ٽ� �Է��ϼ���.\r");
				System.out.println();
			}

		}

		

		//�޼ҵ� ����
//		String[] id= {"apple","banana"};
//		int[] password= {123,456};
//		String[] name= {"������","�����"};
//		
//		Scanner sc = new Scanner(System.in);
//		int account=0,j=0,k=0,PASSWORD=0,pw=0;
//		boolean isFlag=true;
//		String ID="",str="";
//		while(isFlag) {
//			System.out.print("ID>>");
//			ID=sc.nextLine();
//			System.out.print("PASSWORD>>");
//			PASSWORD=Integer.parseInt(sc.nextLine());
//			if((ID.equals(id[0]) && PASSWORD==password[0])||(ID.equals(id[1]) && PASSWORD==password[1])) {
//				str=ID.equals(id[0])?name[0]:name[1];
//				System.out.println(str+"���� �α��� �ϼ̽��ϴ�.");
//				System.out.println("1.�Ա�  2. ���  3. ��ȸ  4. ����");
//				int i=Integer.parseInt(sc.nextLine());
//				while(i!=4){
//					if(i==1){
//						account=deposit(account,j);
//					}else if(i==2){
//						account=withdraw(k,account);
//					}else if(i==3){
//						System.out.println(account+"���� ���ҽ��ϴ�.");
//					}else{
//						System.out.println("�Է��� �� ���� �޴� ��ȣ�Դϴ�.");
//					}
//					System.out.print("���Ͻô� �޴� ��ȣ�� �Է��ϼ���>>");
//					i=Integer.parseInt(sc.nextLine());
//				}
//					System.out.println("�����մϴ�.");
//					break;
//			}else {
//				System.out.println("ID�� PASSWORD�� �ٽ� �Է��ϼ���.\r");
//				System.out.println();
//			}
//		}
	}
}