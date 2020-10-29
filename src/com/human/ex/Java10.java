package com.human.ex;

import java.util.Scanner;
import java.util.Arrays;

public class Java10 {

	
	public static void startDisplay() {
		Scanner sc = new Scanner(System.in);
		String ID="";
		int PASSWORD=0;
		System.out.println("ID와 PASSWORD를 입력하시오>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
	}
	
	public static void adminDisplay() {
		Scanner sc = new Scanner(System.in);
		String ID="";
		int PASSWORD=0;
		System.out.println("관리자 권한");
		System.out.println("ID와 PASSWORD를 입력하시오>>\r");
		System.out.print("ID>>");
		ID=sc.nextLine();
		System.out.print("PASSWORD>>");
		PASSWORD=sc.nextInt();
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
	
	
	
	public static void main(String[] args) {
		//메소드 없이 구현 
		int[] password= new int[5];password[0]=123;password[1]=456;
		String[] id= new String[5];id[0]="apple";id[1]="banana";
		String[] name= new String[5];name[0]="강아지";name[1]="고양이";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int account=0,i=0,j=0,k=0,PASSWORD=0,pw=0,l=0;
		boolean isFlag1=true,isFlag2=true;
		String ID="",str="",NAME="";
		while(isFlag1) {
			System.out.println("ID와 PASSWORD를 입력하시오>>\r");
			System.out.print("ID>>");
			ID=sc.nextLine();
			System.out.print("PASSWORD>>");
			PASSWORD=sc.nextInt();
			if((ID.equals(id[0]) && PASSWORD==password[0])||(ID.equals(id[1]) && PASSWORD==password[1])) {
					str=ID.equals(id[0])?name[0]:name[1];
					System.out.println(str+"님이 로그인 하셨습니다.");
					System.out.println("1.입금  2. 출금  3. 조회  4. 종료");
					i=sc.nextInt();
					while(i!=4){
						if(i==1){
							System.out.print("입금 금액을 입력하세요>>");
							j=sc.nextInt();
								account=account+j;
								System.out.println(j+"원이 입금되었습니다.");
						}else if(i==2){
							System.out.print("출금 금액을 입력하세요>>");
							k=sc.nextInt();
							if(account-k<0){
								System.out.println("총금액이 0원 미만이므로 더 이상 출금할 수 없습니다.");
							}else{
								account=account-k;
								System.out.println(k+"원을 출금했습니다.");
							}
						}else if(i==3){
							System.out.println(account+"원이 남았습니다.");
						}else{
							System.out.println("입력할 수 없는 메뉴 번호입니다.");
						}
						System.out.print("원하시는 메뉴 번호를 입력하세요>>");
						i=sc.nextInt();
					}
						System.out.println("종료합니다.");
						System.out.println();
						while(isFlag2) {
							System.out.println("----------관리자 권한----------");
							System.out.println("ID와 PASSWORD를 입력하시오>>");
							System.out.print("ID>>");
							ID=sc.nextLine();ID=sc.nextLine();
							System.out.print("PASSWORD>>");
							PASSWORD=Integer.parseInt(sc.nextLine());
							if((ID.equals(id[0]) && PASSWORD==password[0])||(ID.equals(id[1]) && PASSWORD==password[1])) {
								str=ID.equals(id[0])?name[0]:name[1];
								System.out.println(str+"님이 로그인 하셨습니다.");
								for(;;) {
									System.out.println("1.계정 추가  2.계정 삭제  3.모든 사용자 정보 확인  4.id로 특정 사용자 정보 확인  5.종료 ");
									i=Integer.parseInt(sc.nextLine());
									switch(i) {
										case 1:
											System.out.print("이름>>");NAME=sc.nextLine();name[name.length-3]=NAME;
											System.out.print("ID>>");ID=sc.nextLine();id[id.length-3]=ID;
											System.out.print("PASSWORD>>");PASSWORD=Integer.parseInt(sc.nextLine());password[password.length-3]=PASSWORD;
											break;
											
										case 2:
											System.out.print("이름>>");NAME=sc.nextLine();name[name.length-3+l]=null;
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
												System.out.println("프로그램 종료");
											isFlag2=false;
											break;
											
										default:
											break;
									}
								}
							}else {
								System.out.println("ID와 PASSWORD를 다시 입력하세요.\r");
								System.out.println();
							}
						}
			}else {
				System.out.println("ID와 PASSWORD를 다시 입력하세요.\r");
				System.out.println();
			}

		}

		

		//메소드 구현
//		String[] id= {"apple","banana"};
//		int[] password= {123,456};
//		String[] name= {"강아지","고양이"};
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
//				System.out.println(str+"님이 로그인 하셨습니다.");
//				System.out.println("1.입금  2. 출금  3. 조회  4. 종료");
//				int i=Integer.parseInt(sc.nextLine());
//				while(i!=4){
//					if(i==1){
//						account=deposit(account,j);
//					}else if(i==2){
//						account=withdraw(k,account);
//					}else if(i==3){
//						System.out.println(account+"원이 남았습니다.");
//					}else{
//						System.out.println("입력할 수 없는 메뉴 번호입니다.");
//					}
//					System.out.print("원하시는 메뉴 번호를 입력하세요>>");
//					i=Integer.parseInt(sc.nextLine());
//				}
//					System.out.println("종료합니다.");
//					break;
//			}else {
//				System.out.println("ID와 PASSWORD를 다시 입력하세요.\r");
//				System.out.println();
//			}
//		}
	}
}