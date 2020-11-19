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
		System.out.println("���̵�� pw�� �Է��ϼ���");
		System.out.print("���̵�>>");
		inputId = sc.nextLine();
		System.out.print("pw>>");
		inputPw = Integer.parseInt(sc.nextLine());
	}
	public void adminMenu() {
		boolean isAdminLogin = false;
		System.out.println("-----������ ���-----");
		System.out.print("������ ���̵� �Է�>>");
		inputAdminId = sc.nextLine();
		System.out.print("������ �н����� �Է�>>");
		inputAdminPw = Integer.parseInt(sc.nextLine());
		
		if(inputAdminId != null && inputAdminId.equals("admin") && inputAdminPw == 1111) {
			isAdminLogin = true;
			while(isAdminLogin) {

				System.out.println("---������ �޴� �α��� ����---");
				System.out.println("1.���� ���� 2.���� ���� 3.���� ��ȸ 4.exit");
				int sel = Integer.parseInt(sc.nextLine());
				switch(sel) {
					case 1:	//���� ����
						System.out.print("������ ���̵� �Է�>>");
						String inputAccountId = sc.nextLine();
						id[index] = inputAccountId;
						
						System.out.print("������ �н����� �Է�>>");
						int inputAccountPw = Integer.parseInt(sc.nextLine());
						pw[index] = inputAccountPw;
						
						System.out.print("������ �����̸� �Է�>>");
						String inputAccountName = sc.nextLine();
						myAccount[index] = inputAccountName;
						
						index++;
	
						System.out.println("���¸� �����߽��ϴ�.");
						break;
					
					case 2: //���� ����
						System.out.print("������ ���̵� �Է�>>");
						String delAccountId = sc.nextLine();
						System.out.print("������ �н����� �Է�>>");
						int delAccountPw = Integer.parseInt(sc.nextLine());
						int delIndex = -1;
						for(int i=0;i<index;i++) {
							if(id[i].equals(delAccountId) && pw[i] == delAccountPw) {
								delIndex = i; break;
							}
						}
						if(delIndex < 0) {
							System.out.println("������ ������ �����ϴ�.");
						}else {
							for(int i=delIndex;i<id.length - 1;i++) {
								id[i] = id[i + 1];
								pw[i] = pw[i + 1];
								myAccount[i] = myAccount[i + 1];
							}
							System.out.println("���¸� �����߽��ϴ�.");
							index--;
						}
							
						break;
					
					case 3:	//���� ��ȸ
						boolean isFind = false;
						System.out.print("��ȸ�� ���̵� �Է�>>");
						inputAccountId = sc.nextLine();	
						for(int i=0;i<index;i++) {
							if(id[i].equals(inputAccountId)) {
								System.out.println((i+1) + "��° ����--------");
								System.out.println("���̵�: " + id[i]);
								System.out.println("�н�����: " + pw[i]);
								System.out.println("�����̸�: " + myAccount[i]);
							}
						}
						if(!isFind) {
							System.out.println("���� �����Դϴ�.");
						}
						break;
			
					case 4:	//������
						System.out.println("������ �޴� ����");
						isAdminLogin = false;
						break;
						
					default:	
						System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				}
			}
			System.out.println("������ �޴� �α׾ƿ�");
		}else {
				System.out.println("������ �޴� �α��� ����");
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
			System.out.println("�α��� ����");
			System.out.println("1.�Ա�, 2.���, 3.��ȸ, 4.exit");
			int sel = Integer.parseInt(sc.nextLine());
			switch(sel) {
				case 1:	//�Ա�	
					System.out.println("�Ա� �ݾ� �Է�>>");
					account += Integer.parseInt(sc.nextLine());
					System.out.println("�Ա��� �Ϸ��߽��ϴ�.");
					break;
					
				case 2:	//���
					System.out.println("��� �ݾ� �Է�>>");
					account -= Integer.parseInt(sc.nextLine());
					System.out.println("����� �Ϸ��߽��ϴ�.");
					break;
					
				case 3:	//��ȸ
					System.out.println(inputId + "���� ���¿� " + account + "���� ���ҽ��ϴ�.");
					break;
				
				case 4:	//������
					System.out.println("�ʱ� �޴��� ���ư��ϴ�.");
					isLogin = false;
					break;
					
				default:
					System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
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
				System.out.println("���α׷��� �����մϴ�.");
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
		System.out.println("�߰��� ����>>");
		System.out.print("�����>>");
		bankName[bkIndexCount]=sc.nextLine();
		System.out.print("id>>");
		bank[bkIndexCount].id[bkIndexCount]=sc.nextLine();
		System.out.print("pw>>");
		bank[bkIndexCount].pw[bkIndexCount]=Integer.parseInt(sc.nextLine());
		for(int i=0;i<bkIndexCount;i++) {
			if(bank[i].pw[i] == (bank[bkIndexCount].pw[bkIndexCount]) ||
					bank[i].id[i].equals(bank[bkIndexCount].id[bkIndexCount])) {
				System.out.println("�ߺ��� ���̵� �Ǵ� ��й�ȣ�Դϴ�.");
			}else {
				bkIndexCount++;
				System.out.println("������ �߰��Ǿ����ϴ�.");
			}
		}
	}
	public void delBank() {
		System.out.println("������ ����>>");
		System.out.print("�����>>");
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
			System.out.println("���� ������Դϴ�.");
		} else {
			for (int i = findIndex; i < bank.length - 1 ; i++) {
				bankName[i] = bankName[i + 1];
				bank[i].id[i] = bank[i].id[i + 1];
				bank[i].pw[i] = bank[i].pw[i + 1];
			}
			bkIndexCount--;
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		
	}
	public void bankInfo() {
		System.out.println("ã�� ��������>>");
		System.out.print("�����>>");
		String findBankName=sc.nextLine();
		boolean isFind=false;
		for(int i=0;i<bankName.length;i++) {
			if(bankName[i].equals(findBankName)) {
				System.out.println((i+1)+"��° ��������----------");
				System.out.println("�����: "+bankName[i]);
				System.out.println("id: "+bank[i].id[i]);
				System.out.println("pw: "+bank[i].pw[i]);
				isFind=true;
			}
		}
		if(!isFind) {
			System.out.println("���� ������Դϴ�.");
		}
	}
	public void bkMainMenu() {
		System.out.println("���ϴ� ������ �Է��ϼ���>>");
		String inputBankName=sc.nextLine();
		if(inputBankName == null) {
			
		}else if(inputBankName.equals("admin")) {
			while(adminFlag1) {
				System.out.println("1.�����߰� 2.������� 3.�������� 4.exit");
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
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
		}else{
			for(int i=0;i<bankName.length;i++) {
				if(bankName[i].equals(inputBankName)){
					System.out.println(bankName[i]+"�Դϴ�.");
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
		System.out.println("���� ���α׷��� �����Ͻðڽ��ϱ�?");
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
