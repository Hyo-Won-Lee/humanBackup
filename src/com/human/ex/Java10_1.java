package com.human.ex;

import java.util.Scanner;

public class Java10_1 {
	public static void main(String[] args) {
		//메소드 없이 구현
		Scanner sc=new Scanner(System.in);
		int PASSWORD=0,account=0,i=0,j=0,k=0,l=0;
		String NAME="",ID="";
		
		String[] id= {"hong","",""},adminId= {"admin"}; 
		int[] pw= {12,0,0},adminPw= {1111};
		String[] name= {"홍길동","",""};
		
		System.out.println("ID와 PASSWORD를 입력하세요.");
		for(;;) { 
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
			
			if((ID.equals(id[0]) && PASSWORD==pw[0])) {
				System.out.println(id[0]+"님이 로그인 하셨습니다.");
				System.out.println();break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		for(;;){
			System.out.println("1.입금  2.출금  3.조회  4.종료");
			i=Integer.parseInt(sc.nextLine());
			if(i==1){
				System.out.print("입금 금액>>");
				j=Integer.parseInt(sc.nextLine());
				account+=j;
				System.out.println(j+"원이 입금되었습니다.");
			}else if(i==2){
				System.out.print("출금 금액>>");
				k=Integer.parseInt(sc.nextLine());
				if(account-k<0){
					System.out.println("더 이상 출금할 수 없습니다.");
				}else{
					account-=k;
					System.out.println(k+"원을 출금했습니다.");
				}
			}else if(i==3){
				System.out.println(account+"원이 남았습니다.");
			}else if(i==4){
				System.out.println("종료");break;
			}
		}
		
		System.out.println("---------관리자 권한----------");
		System.out.println("ID와 PASSWORD를 입력하세요.");
		for(;;) {
			System.out.print("ID>>");ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=Integer.parseInt(sc.nextLine());
		
			if((ID.equals(adminId[0]) && PASSWORD==adminPw[0])) break;
			else System.out.println("다시 입력해주세요.");
		}
		
		for(;;) {
			System.out.println("1.계정 추가  2.계정 삭제  3.모든 사용자 정보 확인  4.id로 특정 사용자 정보 확인  5.종료 ");
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
				System.out.println("계정이 삭제되었습니다.");l--;
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
				System.out.println("프로그램 종료");break;
			}
		}
	}
}
