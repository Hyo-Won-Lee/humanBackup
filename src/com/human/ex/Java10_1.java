package com.human.ex;

import java.util.Scanner;

public class Java10_1 {
	public static void main(String[] args) {
		//�޼ҵ� ���� ����
		Scanner sc=new Scanner(System.in);
		int PASSWORD=0,account=0,i=0,j=0,k=0,l=0;
		String NAME="",ID="";
		
		String[] id= {"hong","",""},adminId= {"admin"}; 
		int[] pw= {12,0,0},adminPw= {1111};
		String[] name= {"ȫ�浿","",""};
		
		System.out.println("ID�� PASSWORD�� �Է��ϼ���.");
		for(;;) { 
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
			
			if((ID.equals(id[0]) && PASSWORD==pw[0])) {
				System.out.println(id[0]+"���� �α��� �ϼ̽��ϴ�.");
				System.out.println();break;
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		
		for(;;){
			System.out.println("1.�Ա�  2.���  3.��ȸ  4.����");
			i=Integer.parseInt(sc.nextLine());
			if(i==1){
				System.out.print("�Ա� �ݾ�>>");
				j=Integer.parseInt(sc.nextLine());
				account+=j;
				System.out.println(j+"���� �ԱݵǾ����ϴ�.");
			}else if(i==2){
				System.out.print("��� �ݾ�>>");
				k=Integer.parseInt(sc.nextLine());
				if(account-k<0){
					System.out.println("�� �̻� ����� �� �����ϴ�.");
				}else{
					account-=k;
					System.out.println(k+"���� ����߽��ϴ�.");
				}
			}else if(i==3){
				System.out.println(account+"���� ���ҽ��ϴ�.");
			}else if(i==4){
				System.out.println("����");break;
			}
		}
		
		System.out.println("---------������ ����----------");
		System.out.println("ID�� PASSWORD�� �Է��ϼ���.");
		for(;;) {
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
		
			if((ID.equals(adminId[0]) && PASSWORD==adminPw[0])) break;
			else System.out.println("�ٽ� �Է����ּ���.");
		}
		
		for(;;) {
			System.out.println("1.���� �߰�  2.���� ����  3.��� ����� ���� Ȯ��  4.id�� Ư�� ����� ���� Ȯ��  5.���� ");
			i=Integer.parseInt(sc.nextLine());
			if(i==1){
				l++;
				System.out.print("ID>>");ID=sc.nextLine();id[id.length-3+l]=ID;
				System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());
				pw[pw.length-3+l]=PASSWORD;
				System.out.print("NAME>>");NAME=sc.nextLine();name[name.length-3+l]=NAME;
			}else if(i==2){
				System.out.print("ID>>");ID=sc.nextLine();id[id.length-3+l]="";
				System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());
				pw[pw.length-3+l]=0;name[name.length-3+l]="";
				System.out.println("������ �����Ǿ����ϴ�.");l--;
			}else if(i==3){
				for(j=0;j<id.length;j++) {
					System.out.println("ID : "+id[j]);
					System.out.println("PASSWORD : "+pw[j]);
					System.out.println("NAME : "+name[j]);
					System.out.println();
				}
			}else if(i==4){
				System.out.print("ID>>");ID=sc.nextLine();
				j=ID.equals(id[0])?0:ID.equals(id[1])?1:2;
				for(k=j;k<j+1;k++) {
					System.out.println("ID : "+id[k]);
					System.out.println("PASSWORD : "+pw[k]);
					System.out.println("NAME : "+name[k]);
				}
			}else if(i==5) {
				System.out.println("���α׷� ����");break;
			}
		}
	}
}
