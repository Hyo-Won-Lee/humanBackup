package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

class Bank1{
	public Scanner sc = new Scanner(System.in);
	public int listCount =1,bankIndexCount=1;
	public String id[] = new String[100]; // �����ʹ� �ֻ�ܿ� ��ġ�Ѵ�.
	public String pw[] = new String[100];
	public double account[] = new double[100];
	
	public String inputId = null; // ����
	public String inputPw = null;
	public int indexCount = 0;

	
	public Bank1(String[] id, String[] pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public Bank1() {
		init(); //���� �ʱ�ȭ
	}
	public void init() {
		id[0] = "a1";
		pw[0] = "a1";
		account[0] = 1;
	}	
	public void adminMenu() {
		boolean isAdminLogin = true;
		while (isAdminLogin) {
			System.out.println("������ ����");
			System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ��");
			System.out.println("4.id�� Ư�� ����� ���� Ȯ�� 5.����");
			System.out.println("�޴� �Է�>>");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {
			case 1:
				System.out.println("�߰��� ����� �����Է�");
				System.out.println("���̵�>>");
				id[listCount] = sc.nextLine();
				System.out.println("pw>>");
				pw[listCount] = sc.nextLine();
				account[listCount] = 0;
				listCount++;
				System.out.println("����� �߰��Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("������ ����� �����Է�");
				System.out.println("���̵�>>");
				String deleteId = sc.nextLine();
				int findIndex = -1;
				for (int i = 0; i < listCount; i++) {
					if (id[i].equals(deleteId)) {
						findIndex = i;
						break;
					}
				}
				if (findIndex < 0) {
					System.out.println("���� ���̵��Դϴ�.");
				} else {
					for (int i = findIndex; i < id.length - 1; i++) {
						id[i] = id[i + 1];
						pw[i] = pw[i + 1];
						account[i] = account[i + 1];
					}
					listCount--;
					System.out.println("�����Ǿ����ϴ�.");

				}

				break;
			case 3:
				System.out.println("��� ����� ���� ��� : ");
				for (int i = 0; i < listCount; i++) {
					System.out.println(i + "�� ���̵�>>------------");
					System.out.println("���̵�>>" + id[i]);
					System.out.println("pw>>" + pw[i]);
					System.out.println("account>>" + account[i]);
				}
				if (listCount == 0) {
					System.out.println("�����Ͱ� �����ϴ�.");
				}

				break;
			case 4:
				System.out.println("ã�� ���̵� �Է��ϼ���");
				System.out.println("���̵�>>");
				String findId = sc.nextLine();
				boolean isFind = false;
				for (int i = 0; i < listCount; i++) {
					if (id[i].equals(findId)) {
						System.out.println("���̵�>>" + id[i]);
						System.out.println("pw>>" + pw[i]);
						System.out.println("account>>" + account[i]);
						isFind = true;
					}
				}
				if (!isFind) {
					System.out.println("���� ���̵� �Դϴ�.");
				}
				break;
			case 5:
				isAdminLogin = false;
				inputId = null;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	public void mainMenu() {
		System.out.println("���̵�� pw�� �Է��ϼ���");
		System.out.println("���̵�>>");
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
	System.out.println(indexCount + ":" + inputId + ":" + id[indexCount]);// ������
	if (isLogin) {
		while (isLogin) {
			System.out.println(inputId + "���� �α��� �Ͽ����ϴ�.");
			System.out.println("1.�Ա�  2.���  3.Ȯ��  4.����>>");
			int selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {
			case 1:
				System.out.println("1.�Ա�, �Ա��� �ݾ��� �Է�>>");
				account[indexCount] += Double.parseDouble(sc.nextLine());
				System.out.println(inputId + "���� �����Աݾ� : " + account[indexCount]);
				break;
			case 2:
				System.out.println("2.���, ����� �ݾ��� �Է�>>");
				account[indexCount] -= Double.parseDouble(sc.nextLine());
				System.out.println(inputId + "���� �����Աݾ� : " + account[indexCount]);
				break;
			case 3:
				System.out.println(inputId + "���� �����Աݾ� : " + account[indexCount]);
				break;
			case 4:
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
				inputId = null;
				isLogin = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	} else {
		// �α��� ����
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
		
		System.out.println("���ϴ� ������ �Է��ϼ���>>");
		String inputBankName=sc.nextLine();
		if(inputBankName == null) {
			
		}else if(inputBankName.equals("admin")) {
			while(adminFlag1) {
				System.out.println("1.�����߰� 2.������� 3.�������� 4.exit");
				int selectAdmin=Integer.parseInt(sc.nextLine());
				switch(selectAdmin) {
				case 1:
					System.out.println("�߰��� ����>>");
					System.out.print("�����>>");
					bankName[bankIndexCount]=sc.nextLine();
					System.out.print("id>>");
					bank[bankIndexCount].id[bankIndexCount]=sc.nextLine();
					System.out.print("pw>>");
					bank[bankIndexCount].pw[bankIndexCount]=sc.nextLine();
					bankIndexCount++;
					System.out.println("������ �߰��Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println("������ ����>>");
					System.out.print("�����>>");
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
						System.out.println("���� ������Դϴ�.");
					} else {
						for (int i = findIndex; i < bank.length - 1 ; i++) {
							bankName[i] = bankName[i + 1];
							bank[i].id[i] = bank[i].id[i + 1];
							bank[i].pw[i] = bank[i].pw[i + 1];
						}
						bankIndexCount--;
						System.out.println("������ �����Ǿ����ϴ�.");
					}
					
					break;
				case 3:
					System.out.println("ã�� ��������>>");
					System.out.print("�����>>");
					String findBankName=sc.nextLine();
					boolean isFind=false;
					for(int i=0;i<bankName.length;i++) {
						if(bankName[i].equals(findBankName)) {
							System.out.println(i+"��° ��������----------");
							System.out.println("�����: "+bankName[i]);
							System.out.println("id: "+bank[i].id[i]);
							System.out.println("pw: "+bank[i].pw[i]);
							isFind=true;
						}
					}
					if(!isFind) {
						System.out.println("���� ������Դϴ�.");
					}
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
