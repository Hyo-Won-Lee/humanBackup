package com.human.ex;

public class Java1 {
	public static void main(String[] args) {
		//if��
		//1��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("��� 5�� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("���� 5�� �Է��ϼ���");
		int j=Integer.parseInt(scanner.nextLine());
		
		if(i>0) {
			System.out.println(i);
		}
		
		if(j<0) {
			System.out.println(j*(-1));
		}*/
		
		// 2��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���");
		int j=Integer.parseInt(scanner.nextLine());
		
		if(i==j) {
			System.out.println("�� ���� ���� ����.");
		}else if(i>j) {
			System.out.println("ù ��° �Է��� ���� �� ��° �Է��� ������ ũ��.");
		}else if(i<j) {
			System.out.println("�� ��° �Է��� ���� ù ��° �Է��� ������ ũ��");
		}*/
		
		//3��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i%126==0) {
			System.out.println("126�� ���");
		}else {
			System.out.println("126�� ����� �ƴϴ�.");
		}*/
		
		//4��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("���� ������ �Է��ϼ���");
		int j=Integer.parseInt(scanner.nextLine());
		System.out.println("���� ������ �Է��ϼ���");
		int k=Integer.parseInt(scanner.nextLine());
		
		if((i+j+k)/3>=80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}*/
		
		//5��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		if(i>=5) {
			System.out.println(i+15);
		}else if(i>5) {
			System.out.println(i+5);
		}*/
		
		
		//if ||
		//1��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i%3==0 || i%7==0) {
			System.out.println("3�Ǵ� 7�� ���");
		}else if(i%2==0 && i%5==0) {
			System.out.println("2�� 5�� ���");
		}else if((i%3==0 || i%7==0) && (i%2==0 && i%5==0)) {
			System.out.println("3�Ǵ� 7�� ����̸鼭 2�� 5�� ���");
		}*/
		
		//2��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		
		if(i<=15) {
			System.out.println("1300���Դϴ�.");
		}else if(i>15) {
			System.out.println("1600���Դϴ�.");
		}
		
		System.out.print("����ī��� �����Ͻðڽ��ϱ�? 100�� �����մϴ�.");
		System.out.print("Y/N �� �� �ϳ��� �Է��ϼ���.");
		char a= scanner.nextLine().charAt(0);
		
		if(i<=15) {
			System.out.println("1200���Դϴ�.");
		}else if(i>15) {
			System.out.println("1500���Դϴ�.");
		}*/
		
		//3��
		//else if��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		int x=Integer.parseInt(scanner.nextLine());
		System.out.println("�����Ը� �Է��ϼ���");
		int y=Integer.parseInt(scanner.nextLine());
		
		double result=y/((x-100)*0.9)*100;
		
		System.out.println();
		System.out.println("���߰���");
		if(result<95) {
			System.out.println("ü�� �̴�");
		}else if(result>=95 && result<=120) {
			System.out.println("����");
		}else if(result>=120 && result<=130) {
			System.out.println("�浵 ��");
		}else if(result>=130 && result<=150) {
			System.out.println("�ߵ� ��");
		}else if(result>=150) {
			System.out.println("�� ��");
		}
		
		System.out.println("120�̸��� ���� ü��");
		System.out.println();
		
		System.out.println("����");
		if(result<100) {
			System.out.println("ü�� �̴�");
		}else if(result>=100 && result<=110) {
			System.out.println("����");
		}else if(result>=110 && result<=120) {
			System.out.println("��ü��");
		}else if(result>=120 && result<=150) {
			System.out.println("��");
		}else if(result>=150) {
			System.out.println("�� ��");
		}
		
		System.out.println("95�̸��� ü�� �̴�");*/
		
		//switch��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		int x=Integer.parseInt(scanner.nextLine());
		System.out.println("�����Ը� �Է��ϼ���");
		int y=Integer.parseInt(scanner.nextLine());
		
		double result=y/((x-100)*0.9)*100;
		System.out.println();
		System.out.println("���߰���");
		switch((int)result) {
			case 94:
				System.out.println("ü�� �̴�");
				break;
				
			case 95:case 96:case 97:case 98:case 99:case 100:case 101:
			case 102:case 103:case 104:case 105:case 106:case 107:case 108:
			case 109:case 110:case 111:case 112:case 113:case 114:case 115:
			case 116:case 117:case 118:
			case 119:
				System.out.println("����");
				break;
				
			case 120:case 121:case 122:case 123:case 124:case 125:
			case 126:case 127:case 128:
			case 129:
				System.out.println("�浵��");
				break;
				
			case 130:case 131:case 132:case 133:case 134:case 135:
			case 136:case 137:case 138:
			case 139:
				System.out.println("�ߵ� ��");
				break;
				
			case 1000:
				System.out.println("�� ��");
				break;
				
			default:
				break;
		}
		System.out.println("120�̸��� ���� ü��");
		System.out.println();
		
		System.out.println("����");
		switch((int)result) {
			case 99:
				System.out.println("ü�� �̴�");
				break;
			case 100:case 101:case 102:case 103:case 104: 
			case 105: case 106:case 107:case 108:
			case 109:
				System.out.println("����");
				break;
			case 110:case 111:case 112:case 113:case 114:case 115:
			case 116:case 117:case 118:
			case 119:
				System.out.println("��ü��");
				break;
			case 120:case 121:case 122:case 123:case 124:case 125:
			case 126:case 127:case 128:case 129:case 130:case 131:
			case 132:case 133:case 134:case 135:case 136:case 137:
			case 138:case 139:case 140:case 141:case 142:case 143:
			case 144:case 145:case 146:case 147:case 148:
			case 149:
				System.out.println("��");
				break;
			case 500:
				System.out.println("�� ��");
			default:
				break;
		}
		
		System.out.println("95�̸��� ü�� �̴�");*/
		
		
		//4��
		/*
		int i=1300;
		if(i>=1400 && i<1800) {
			System.out.println("1400�̻� 1800����");
		}else {
			System.out.println("1400�̸� 1800�ʰ�");
		}*/
	}
}
