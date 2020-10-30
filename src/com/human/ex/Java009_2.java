package com.human.ex;

import java.util.Scanner;

class Bank{
	public Scanner sc = new Scanner(System.in);
	public int listCount = 3;
	public String id[] = new String[100]; // 데이터는 최상단에 위치한다.
	public String pw[] = new String[100];
	public double account[] = new double[100];

	public String inputId = null; // 변수
	public String inputPw = null;
	public int indexCount = 0;

	public Bank() {
		init(); //변수 초기화
	}
	public void init() {
		id[0] = "a1";id[1] = "a2";id[2] = "a3";
		pw[0] = "a1";pw[1] = "a2";pw[2] = "a3";
		account[0] = 1;account[1] = 2;account[2] = 3;
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
//					int i=0;
//					for(;i<listCount;i++) {
//						if(id[i].equals(findId)) {
//							System.out.println("아이디>>"+id[i]);
//							System.out.println("pw>>"+pw[i]);
//							System.out.println("account>>"+account[i]);
//						}
//					}
//					if(i==listCount) {
//						System.out.println("없는 아이디 입니다.");
//					}
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
			return; //함수 종료
		}
		System.out.println("pw>>");
		inputPw = sc.nextLine();
	}
	public void userMenu() {
		// 존재하는 사용자인가?
		// 존재하는 사람의 indexCount는 무엇인가?
		// 존재하는 사용자인가?
	boolean isLogin = false;
	for (int i = 0; i < id.length; i++) {
		if (id[i] != null && id[i].equals(inputId) && pw[i].equals(inputPw)) {
//				if(id[i].equals(inputId)&&id[i]!=null) //잘못된 코드다.
			isLogin = true;
			indexCount = i;
			break;
		}
	}
	System.out.println(indexCount + ":" + inputId + ":" + id[indexCount]);// 디버깅용
	if (isLogin) {
		// 로그인 성공
		// 존재하는 사람의 indexCount는 무엇인가?
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
			
			if (inputId == null) { // null체크 먼저한다.

			} else if (inputId.equals("exit")) {
				break;
			} else if (inputId.equals("admin") && inputPw.equals("1111")) {
				adminMenu();
			} else {// 일반사용자 로그인
				userMenu();
			}
		}
	}
}

public class Java009_2 {
	public static void main(String[] args) {
		Bank b1=new Bank();// 메인에서 선언한 지역변수
		b1.play(); //함수 실행//여러개의 은행을 관리할 수 있는 프로그램을 만들어보자.
	}
}
