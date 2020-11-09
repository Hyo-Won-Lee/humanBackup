package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

class Bank1{
	public Scanner sc = new Scanner(System.in);
	public int listCount =1,bankIndexCount=1;
	public String id[] = new String[100]; // 데이터는 최상단에 위치한다.
	public String pw[] = new String[100];
	public double account[] = new double[100];
	
	public String inputId = null; // 변수
	public String inputPw = null;
	public int indexCount = 0;

	
	public Bank1(String[] id, String[] pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public Bank1() {
		init(); //변수 초기화
	}
	public void init() {
		id[0] = "a1";
		pw[0] = "a1";
		account[0] = 1;
	}	
	public void adminMenu() {
		boolean isAdminLogin = true;
		while (isAdminLogin) {
			System.out.println("관리자 계정");
			System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인");
			System.out.println("4.id로 특정 사용자 정보 확인 5.종료");
			System.out.println("메뉴 입력>>");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {
			case 1:
				System.out.println("추가할 사용자 정보입력");
				System.out.println("아이디>>");
				id[listCount] = sc.nextLine();
				System.out.println("pw>>");
				pw[listCount] = sc.nextLine();
				account[listCount] = 0;
				listCount++;
				System.out.println("사용자 추가되었습니다.");
				break;
			case 2:
				System.out.println("삭제할 사용자 정보입력");
				System.out.println("아이디>>");
				String deleteId = sc.nextLine();
				int findIndex = -1;
				for (int i = 0; i < listCount; i++) {
					if (id[i].equals(deleteId)) {
						findIndex = i;
						break;
					}
				}
				if (findIndex < 0) {
					System.out.println("없는 아이디입니다.");
				} else {
					for (int i = findIndex; i < id.length - 1; i++) {
						id[i] = id[i + 1];
						pw[i] = pw[i + 1];
						account[i] = account[i + 1];
					}
					listCount--;
					System.out.println("삭제되었습니다.");

				}

				break;
			case 3:
				System.out.println("모든 사용자 정보 출력 : ");
				for (int i = 0; i < listCount; i++) {
					System.out.println(i + "번 아이디>>------------");
					System.out.println("아이디>>" + id[i]);
					System.out.println("pw>>" + pw[i]);
					System.out.println("account>>" + account[i]);
				}
				if (listCount == 0) {
					System.out.println("데이터가 없습니다.");
				}

				break;
			case 4:
				System.out.println("찾을 아이디를 입력하세요");
				System.out.println("아이디>>");
				String findId = sc.nextLine();
				boolean isFind = false;
				for (int i = 0; i < listCount; i++) {
					if (id[i].equals(findId)) {
						System.out.println("아이디>>" + id[i]);
						System.out.println("pw>>" + pw[i]);
						System.out.println("account>>" + account[i]);
						isFind = true;
					}
				}
				if (!isFind) {
					System.out.println("없는 아이디 입니다.");
				}
				break;
			case 5:
				isAdminLogin = false;
				inputId = null;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	public void mainMenu() {
		System.out.println("아이디와 pw를 입력하세요");
		System.out.println("아이디>>");
		inputId = sc.nextLine();
		if(inputId.equals("exit")) {
			return; 
		}
		System.out.println("pw>>");
		inputPw = sc.nextLine();
	}
	public void userMenu() {
	boolean isLogin = false;
	for (int i = 0; i < id.length; i++) {
		if (id[i] != null && id[i].equals(inputId) && pw[i].equals(inputPw)) {
			isLogin = true;
			indexCount = i;
			break;
		}
	}
	System.out.println(indexCount + ":" + inputId + ":" + id[indexCount]);// 디버깅용
	if (isLogin) {
		while (isLogin) {
			System.out.println(inputId + "님이 로그인 하였습니다.");
			System.out.println("1.입금  2.출금  3.확인  4.종료>>");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {
			case 1:
				System.out.println("1.입금, 입금할 금액을 입력>>");
				account[indexCount] += Double.parseDouble(sc.nextLine());
				System.out.println(inputId + "님의 현재입금액 : " + account[indexCount]);
				break;
			case 2:
				System.out.println("2.출금, 출금할 금액을 입력>>");
				account[indexCount] -= Double.parseDouble(sc.nextLine());
				System.out.println(inputId + "님의 현재입금액 : " + account[indexCount]);
				break;
			case 3:
				System.out.println(inputId + "님의 현재입금액 : " + account[indexCount]);
				break;
			case 4:
				System.out.println("로그아웃 되었습니다.");
				inputId = null;
				isLogin = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	} else {
		// 로그인 실패
		inputId = null;
	}
	}	
	public void play() {
		while (true) {
			mainMenu();	
			if (inputId == null) {
				
			} else if (inputId.equals("exit")) {
				break;
			} else if (inputId.equals("admin") && inputPw.equals("1111")) {
				adminMenu();
			} else {
				userMenu();
			}
		}
	}
}

public class Java14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		boolean adminFlag1=true;
		int bankIndexCount=1;
		
		String bankName[]= {"koreaBank"," "," "};
		Bank1[] bank=new Bank1[3];
		bank[0]=new Bank1();bank[1]=new Bank1();bank[2]=new Bank1();
		bank[0].id[0]= "a1"; bank[0].pw[0]="a1";
		bank[1].id[0]= " "; bank[1].pw[0]=" ";
		bank[2].id[0]= " "; bank[2].pw[0]=" ";
		
		System.out.println("원하는 은행을 입력하세요>>");
		String inputBankName=sc.nextLine();
		if(inputBankName == null) {
			
		}else if(inputBankName.equals("admin")) {
			while(adminFlag1) {
				System.out.println("1.은행추가 2.은행삭제 3.은행정보 4.exit");
				int selectAdmin=Integer.parseInt(sc.nextLine());
				switch(selectAdmin) {
				case 1:
					System.out.println("추가할 정보>>");
					System.out.print("은행명>>");
					bankName[bankIndexCount]=sc.nextLine();
					System.out.print("id>>");
					bank[bankIndexCount].id[bankIndexCount]=sc.nextLine();
					System.out.print("pw>>");
					bank[bankIndexCount].pw[bankIndexCount]=sc.nextLine();
					bankIndexCount++;
					System.out.println("정보가 추가되었습니다.");
					break;
					
				case 2:
					System.out.println("삭제할 정보>>");
					System.out.print("은행명>>");
					String delBankName=sc.nextLine();
					System.out.print("id>>");
					String delBankId=sc.nextLine();
					System.out.print("pw>>");
					String delBankPw=sc.nextLine();System.out.println("bankIndexCount: "+bankIndexCount);
					int findIndex = -1;
					for(int i=0;i<bankIndexCount;i++) {
						if(bankName[i].equals(delBankName) && bank[i].id[i].equals(delBankId)
								&& bank[i].pw[i].equals(delBankPw)) {
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
						bankIndexCount--;
						System.out.println("정보가 삭제되었습니다.");
					}
					
					break;
				case 3:
					System.out.println("찾을 은행정보>>");
					System.out.print("은행명>>");
					String findBankName=sc.nextLine();
					boolean isFind=false;
					for(int i=0;i<bankName.length;i++) {
						if(bankName[i].equals(findBankName)) {
							System.out.println(i+"번째 은행정보----------");
							System.out.println("은행명: "+bankName[i]);
							System.out.println("id: "+bank[i].id[i]);
							System.out.println("pw: "+bank[i].pw[i]);
							isFind=true;
						}
					}
					if(!isFind) {
						System.out.println("없는 은행명입니다.");
					}
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
