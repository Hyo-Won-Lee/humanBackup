package com.human.ex;

import java.util.Scanner;
import java.util.Arrays;

public class Java10_2 {
	
	public static boolean idPasswordCheck(String[] id,String ID,int[] pw,int PASSWORD,boolean isFlag1) {
		if((ID.equals(id[0]) && PASSWORD==pw[0])) {
			System.out.println(id[0]+"���� �α��� �ϼ̽��ϴ�.");isFlag1=false;
		}else { 
			System.out.println("�ٽ� �Է����ּ���.");}
		return isFlag1;
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
	
	public static int accountAdd(String[] id,String[] name,String ID,
			String NAME,int[] pw,int PASSWORD,int l) {
		Scanner sc = new Scanner(System.in);
		l++;
		System.out.print("ID>>");ID=sc.nextLine();id[id.length-3+l]=ID;
		System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());
		pw[pw.length-3+l]=PASSWORD;
		System.out.print("NAME>>");NAME=sc.nextLine();name[name.length-3+l]=NAME;
		return l;
	}
	
	public static int accountDel(String[] id,String[] name,String ID,
			String NAME,int[] pw,int PASSWORD,int l) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID>>");ID=sc.nextLine();id[id.length-3+l]="";
		System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());
		pw[pw.length-3+l]=0;name[name.length-3+l]="";
		l--;System.out.println("������ �����Ǿ����ϴ�.");
		return l;
	}
	
	public static void everyUserInfo(String[] id,String[] name,String ID,
			String NAME,int[] pw,int PASSWORD,int j) {
		for(j=0;j<id.length;j++) {
			System.out.println("ID : "+id[j]);
			System.out.println("PASSWORD : "+pw[j]);
			System.out.println("NAME : "+name[j]);
			System.out.println();
		}
	}
	
	public static void certainUserInfo(String[] id,String[] name,String ID,
			String NAME,int[] pw,int PASSWORD,int j,int k) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID>>");ID=sc.nextLine();
		j=ID.equals(id[0])?0:ID.equals(id[1])?1:2;
		for(k=j;k<j+1;k++) {
			System.out.println("ID : "+id[k]);
			System.out.println("PASSWORD : "+pw[k]);
			System.out.println("NAME : "+name[k]);
		}
	}
	
	public static void main(String[] args) {
		//�޼ҵ� ����
		Scanner sc=new Scanner(System.in);
		int PASSWORD=0,account=0,i=0,j=0,k=0,l=0;
		String NAME="",ID="";
		boolean isFlag1=true,isFlag2=false;
		
		String[] id= {"hong","",""},adminId= {"admin"}; 
		int[] pw= {12,0,0},adminPw= {1111};
		String[] name= {"ȫ�浿","",""};
		
		System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
		while(idPasswordCheck(id,ID,pw,PASSWORD,isFlag1)) {}
		
		for(;;){
			System.out.println("1.�Ա�  2.���  3.��ȸ  4.����");
			i=sc.nextInt();
			if(i==1){
				account=deposit(account,j);
			}else if(i==2){
				account=withdraw(k, account);
			}else if(i==3){
				System.out.println(account+"���� ���ҽ��ϴ�.");
			}else if(i==4){
				System.out.println("����");break;
			}
		}
		System.out.println("----------������ ����----------");
		System.out.println("ID�� PASSWORD�� �Է��Ͻÿ�>>\r");
		for(;isFlag2==false;) {
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
				if((ID.equals(adminId[0]) && PASSWORD==adminPw[0])) {
					for(;;) {
						System.out.println("1.���� �߰�  2.���� ����  3.��� ����� ���� Ȯ��  4.id�� Ư�� ����� ���� Ȯ��  5.���� ");
						i=Integer.parseInt(sc.nextLine());
						if(i==1){
							l=accountAdd(id,name,ID,NAME,pw,PASSWORD,l);
						}else if(i==2){
							l=accountDel(id,name,ID,NAME,pw,PASSWORD,l);
						}else if(i==3){
							everyUserInfo(id,name,ID,NAME,pw,PASSWORD,j);
						}else if(i==4){
							certainUserInfo(id,name,ID,NAME,pw,PASSWORD,j,k);
						}else if(i==5) {
							for(;;) {
								System.out.print("ID>>");ID=sc.nextLine();
								if(ID.equals("exit")) {
									System.out.println("���α׷� ����");isFlag2=true;break;
								}else {
									System.out.println("�ٽ� �Է��ϼ���.");
								}
							}
							break;
						}
					}
				}else {
					System.out.println("�ٽ� �Է����ּ���.");
				}
		}
	}
}