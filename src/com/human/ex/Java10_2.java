package com.human.ex;

import java.util.Scanner;
import java.util.Arrays;

public class Java10_2 {
	
	public static boolean idPasswordCheck(String[] id,String ID,int[] pw,int PASSWORD,boolean isFlag1) {
		if((ID.equals(id[0]) && PASSWORD==pw[0])) {
			System.out.println(id[0]+"님이 로그인 하셨습니다.");isFlag1=false;
		}else { 
			System.out.println("다시 입력해주세요.");}
		return isFlag1;
	}

	public static int deposit(int account, int j) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금 금액을 입력하세요>>");
		j=sc.nextInt();
		account=account+j;
		System.out.println(j+"원이 입금되었습니다.");
		return account;
	}
	
	public static int withdraw(int k, int account) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금 금액을 입력하세요>>");
		k=sc.nextInt();
		if(account-k<0){
			System.out.println("총금액이 0원 미만이므로 더 이상 출금할 수 없습니다.");
		}else{
			account=account-k;
			System.out.println(k+"원을 출금했습니다.");
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
		l--;System.out.println("계정이 삭제되었습니다.");
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
		//메소드 구현
		Scanner sc=new Scanner(System.in);
		int PASSWORD=0,account=0,i=0,j=0,k=0,l=0;
		String NAME="",ID="";
		boolean isFlag1=true,isFlag2=false;
		
		String[] id= {"hong","",""},adminId= {"admin"}; 
		int[] pw= {12,0,0},adminPw= {1111};
		String[] name= {"홍길동","",""};
		
		System.out.println("ID와 PASSWORD를 입력하시오>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
		while(idPasswordCheck(id,ID,pw,PASSWORD,isFlag1)) {}
		
		for(;;){
			System.out.println("1.입금  2.출금  3.조회  4.종료");
			i=sc.nextInt();
			if(i==1){
				account=deposit(account,j);
			}else if(i==2){
				account=withdraw(k, account);
			}else if(i==3){
				System.out.println(account+"원이 남았습니다.");
			}else if(i==4){
				System.out.println("종료");break;
			}
		}
		System.out.println("----------관리자 권한----------");
		System.out.println("ID와 PASSWORD를 입력하시오>>\r");
		for(;isFlag2==false;) {
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
				if((ID.equals(adminId[0]) && PASSWORD==adminPw[0])) {
					for(;;) {
						System.out.println("1.계정 추가  2.계정 삭제  3.모든 사용자 정보 확인  4.id로 특정 사용자 정보 확인  5.종료 ");
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
									System.out.println("프로그램 종료");isFlag2=true;break;
								}else {
									System.out.println("다시 입력하세요.");
								}
							}
							break;
						}
					}
				}else {
					System.out.println("다시 입력해주세요.");
				}
		}
	}
}