package com.human.ex;

import java.util.Scanner;

class Account{
	
	public static Scanner sc = new Scanner(System.in);
	public String ID;
	public String accountName;
	public int passWord;
	public int index = 1;
	public int inputPw;
	public int inputAdminPw;
	public int indexCount;
	public int account;
	public String inputId;
	public String inputAdminId;
	public boolean isFlag = true;
	
	public Account() {}

	public String[] myAccount = new String[50];
	public String[] id = new String[50];
	public int[] pw = new int[50];
	
	public void init() {
		id[0] = "a1";	
		pw[0] = 1;
		myAccount[0] = "a1";
	}
	public void openingMenu() {
		System.out.println("아이디와 pw를 입력하세요");
		System.out.print("아이디>>");
		inputId = sc.nextLine();
		System.out.print("pw>>");
		inputPw = Integer.parseInt(sc.nextLine());
	}
	public void adminMenu() {
		boolean isAdminLogin = false;
		System.out.println("-----관리자 모드-----");
		System.out.print("관리자 아이디 입력>>");
		inputAdminId = sc.nextLine();
		System.out.print("관리자 패스워드 입력>>");
		inputAdminPw = Integer.parseInt(sc.nextLine());
		
		if(inputAdminId != null && inputAdminId.equals("admin") && inputAdminPw == 1111) {
			isAdminLogin = true;
			while(isAdminLogin) {

				System.out.println("---관리자 메뉴 로그인 성공---");
				System.out.println("1.계좌 생성 2.계좌 삭제 3.계좌 조회 4.exit");
				int sel = Integer.parseInt(sc.nextLine());
				switch(sel) {
					case 1:	//계좌 생성
						System.out.print("생성할 아이디 입력>>");
						String inputAccountId = sc.nextLine();
						id[index] = inputAccountId;
						
						System.out.print("생성할 패스워드 입력>>");
						int inputAccountPw = Integer.parseInt(sc.nextLine());
						pw[index] = inputAccountPw;
						
						System.out.print("생성할 계좌이름 입력>>");
						String inputAccountName = sc.nextLine();
						myAccount[index] = inputAccountName;
						
						index++;
	
						System.out.println("계좌를 생성했습니다.");
						break;
					
					case 2: //계좌 삭제
						System.out.print("삭제할 아이디 입력>>");
						String delAccountId = sc.nextLine();
						System.out.print("삭제할 패스워드 입력>>");
						int delAccountPw = Integer.parseInt(sc.nextLine());
						int delIndex = -1;
						for(int i=0;i<index;i++) {
							if(id[i].equals(delAccountId) && pw[i] == delAccountPw) {
								delIndex = i; break;
							}
						}
						if(delIndex < 0) {
							System.out.println("삭제할 계정이 없습니다.");
						}else {
							for(int i=delIndex;i<id.length - 1;i++) {
								id[i] = id[i + 1];
								pw[i] = pw[i + 1];
								myAccount[i] = myAccount[i + 1];
							}
							System.out.println("계좌를 삭제했습니다.");
							index--;
						}
							
						break;
					
					case 3:	//계좌 조회
						boolean isFind = false;
						System.out.print("조회할 아이디 입력>>");
						inputAccountId = sc.nextLine();	
						for(int i=0;i<index;i++) {
							if(id[i].equals(inputAccountId)) {
								System.out.println((i+1) + "번째 계정--------");
								System.out.println("아이디: " + id[i]);
								System.out.println("패스워드: " + pw[i]);
								System.out.println("계정이름: " + myAccount[i]);
							}
						}
						if(!isFind) {
							System.out.println("없는 계정입니다.");
						}
						break;
			
					case 4:	//나가기
						System.out.println("관리자 메뉴 종료");
						isAdminLogin = false;
						break;
						
					default:	
						System.out.println("번호를 다시 입력해주세요.");
				}
			}
			System.out.println("관리자 메뉴 로그아웃");
		}else {
				System.out.println("관리자 메뉴 로그인 실패");
				isAdminLogin = false;
		}
	}
	public void mainMenu() {
		
		boolean isLogin = false;
		for (int i = 0; i < id.length; i++) {
			if (id[i] != null && id[i].equals(inputId) && pw[i] == inputPw) {
				isLogin = true;
				indexCount = i;
				break;
			}
		}
		
		while(isLogin) {
			System.out.println("로그인 성공");
			System.out.println("1.입금, 2.출금, 3.조회, 4.exit");
			int sel = Integer.parseInt(sc.nextLine());
			switch(sel) {
				case 1:	//입금	
					System.out.println("입금 금액 입력>>");
					account += Integer.parseInt(sc.nextLine());
					System.out.println("입금을 완료했습니다.");
					break;
					
				case 2:	//출금
					System.out.println("출금 금액 입력>>");
					account -= Integer.parseInt(sc.nextLine());
					System.out.println("출금을 완료했습니다.");
					break;
					
				case 3:	//조회
					System.out.println(inputId + "님의 계좌에 " + account + "원이 남았습니다.");
					break;
				
				case 4:	//나가기
					System.out.println("초기 메뉴로 돌아갑니다.");
					isLogin = false;
					break;
					
				default:
					System.out.println("번호를 다시 입력해주세요.");
			}
		}
		
	}
	public void play() {
		while(isFlag) {
				init();
				openingMenu();
			if(inputId == null) {
				
			}else if(inputId.equals("admin") && inputPw == 1111) {
				adminMenu();
			}else if(inputId.equals("exit") && inputPw == 0000){
				System.out.println("프로그램을 종료합니다.");
				isFlag = false;
			}else {
				mainMenu();
			}
		}
		
	}

}


class Bank2{

	Scanner sc=new Scanner (System.in);
	public Bank2() {}
	public boolean adminFlag1=true;
	public int bkIndexCount=1;
	
	public String bankName[]= {"koreaBank"," "," "};
	public Account[] bank=new Account[5];
	
	public void init2() {
		for(int i=0;i<bank.length;i++) { 
			bank[i]=new Account();
		}
		bank[0].id[0]= "a1"; bank[0].pw[0]=1;
	}
	public void addBank() {
		System.out.println("추가할 정보>>");
		System.out.print("은행명>>");
		bankName[bkIndexCount]=sc.nextLine();
		System.out.print("id>>");
		bank[bkIndexCount].id[bkIndexCount]=sc.nextLine();
		System.out.print("pw>>");
		bank[bkIndexCount].pw[bkIndexCount]=Integer.parseInt(sc.nextLine());
		for(int i=0;i<bkIndexCount;i++) {
			if(bank[i].pw[i] == (bank[bkIndexCount].pw[bkIndexCount]) ||
					bank[i].id[i].equals(bank[bkIndexCount].id[bkIndexCount])) {
				System.out.println("중복된 아이디 또는 비밀번호입니다.");
			}else {
				bkIndexCount++;
				System.out.println("정보가 추가되었습니다.");
			}
		}
	}
	public void delBank() {
		System.out.println("삭제할 정보>>");
		System.out.print("은행명>>");
		String delBankName=sc.nextLine();
		System.out.print("id>>");
		String delBankId=sc.nextLine();
		System.out.print("pw>>");
		int delBankPw=Integer.parseInt(sc.nextLine());
		int findIndex = -1;
		for(int i=0;i<bkIndexCount;i++) {
			if(bankName[i].equals(delBankName) && bank[i].id[i].equals(delBankId)
					&& bank[i].pw[i] == delBankPw) {
				findIndex = i;
				break;
			}
		}System.out.println(findIndex);
		if (findIndex < 0) {
			System.out.println("없는 은행명입니다.");
		} else {
			for (int i = findIndex; i < bank.length - 1 ; i++) {
				bankName[i] = bankName[i + 1];
				bank[i].id[i] = bank[i].id[i + 1];
				bank[i].pw[i] = bank[i].pw[i + 1];
			}
			bkIndexCount--;
			System.out.println("정보가 삭제되었습니다.");
		}
		
	}
	public void bankInfo() {
		System.out.println("찾을 은행정보>>");
		System.out.print("은행명>>");
		String findBankName=sc.nextLine();
		boolean isFind=false;
		for(int i=0;i<bankName.length;i++) {
			if(bankName[i].equals(findBankName)) {
				System.out.println((i+1)+"번째 은행정보----------");
				System.out.println("은행명: "+bankName[i]);
				System.out.println("id: "+bank[i].id[i]);
				System.out.println("pw: "+bank[i].pw[i]);
				isFind=true;
			}
		}
		if(!isFind) {
			System.out.println("없는 은행명입니다.");
		}
	}
	public void bkMainMenu() {
		System.out.println("원하는 은행을 입력하세요>>");
		String inputBankName=sc.nextLine();
		if(inputBankName == null) {
			
		}else if(inputBankName.equals("admin")) {
			while(adminFlag1) {
				System.out.println("1.은행추가 2.은행삭제 3.은행정보 4.exit");
				int selectAdmin=Integer.parseInt(sc.nextLine());
				switch(selectAdmin) {
				case 1:
					addBank();
					break;
					
				case 2:
					delBank();
					break;
					
				case 3:
					bankInfo();
					break;
					
				case 4:
					adminFlag1=false;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
				}
			}
		}else{
			for(int i=0;i<bankName.length;i++) {
				if(bankName[i].equals(inputBankName)){
					System.out.println(bankName[i]+"입니다.");
					bank[i].play();
				}
			}
		}
	}
	
	
}


public class Java25_bankClassProgram {
	
	public static boolean endProgram() {
		boolean isEnd = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("은행 프로그램을 종료하시겠습니까?");
		System.out.println("1.yes 2.no");
		int i = Integer.parseInt(sc.nextLine());
		isEnd = (i==1)? false : true;
		return isEnd;
	}

	public static void main(String[] args) {
		
		boolean isEnd = true;
		
		Bank2 bk = new Bank2();
		
		while(isEnd) {
			bk.init2();
			bk.bkMainMenu();
			isEnd = endProgram();
		}
		
	}

}
