package human;

public class Java2 {
	public static void main (String[] args) {
		//if�� ����
		//6��
		/*
		boolean b1=5!=3;//t
		boolean b2=5==3;//f
		if(b1) { 
			if(b2) {
				System.out.println("1��");
			}else {
				System.out.println("2��");
			}
		}else { 
		System.out.println("3��");
		System.out.println("4��");
		}*/
		
		//if��ȭ ����
		//1��
		/*
		int i=15;
		if(i>14) {
			System.out.println("14���� ū ��");
		}
		
		int j=25;
		if(j<=12 || j>22) {
			System.out.println("12���� 22���� ū ��");
		}
		
		int k=8;
		if(k>5 && k<=9) {
			System.out.println("5���� ũ�� 9������ ��");
		}*/
			
		//2��
		/*
		int i=12;
		if(i<=14) {
			System.out.println("14������ ��");
		}
		
		int j=20;
		if(j>12 && j<=22) {
			System.out.println("12���� ũ�� 22������ ��");
		}
		
		int k=4;
		if(k<=5 || k>9) {
			System.out.println("5�����̰� 9���� ū ��");
		}*/
		
		//3��
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
		
		//4��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("x��ǥ�� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		System.out.println("y��ǥ�� �Է��ϼ���");
		int j=Integer.parseInt(scanner.nextLine());
		if(i>0 && j>0) {
			System.out.println("2�� ��ġ");
		}else if(i<0 && j<0) {
			System.out.println("4�� ��ġ");
		}else if(i>0 && j<0) {
			System.out.println("3�� ��ġ");
		}else if(i<0 && j>0) {
			System.out.println("1�� ��ġ");
		}else if(i==0 || j==0) {
			System.out.println("x���̳� y�� ���� �ִ�.");
		}*/
		
		
		//else if  Ȥ�� switch��
		//1��
		//else if��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		int a=5;
		int b=7;
		if(i==0) {
			a+=2;
		}else if(i==1) {
			b+=4;
		}else if(i==2) {
			a=a+b;
		}else {
			b=b+5;
		}
		System.out.println(a+b);
		
		//switch��
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=Integer.parseInt(scanner.nextLine());
		int a=5;
		int b=7;
		switch(i) {
			case 0:
				a+=2;
				break;
			case 1:
				b+=4;
				break;
			case 2:
				a+=b;
				break;
			default:
				b+=5;
				break;
		}
		System.out.println(a+b);*/
		
		//2��
		//(1)������
		/*
		String a="��ħ �� �Ծ���";
		if(a=="��ħ �� �Ծ���") {
			System.out.println("���� �Ծ���");
		}else {
		
		}*/
		
		//(2)������
		/*
		String a="��ħ�� �� �Ծ���";
		if(a=="��ħ�� �� �Ծ���") {
			System.out.println("���� �Ծ���");
		}else {
			System.out.println("���� �Ծ���");
		}*/
		
		//(3)������
		/*
		String a="��ħ �� �Ծ���";
		if(a=="��ħ �� �Ծ���") {
			System.out.println("���� �Ծ���");
		}else {
			System.out.println("���� �Ծ���");
		}*/
		
		//(4)������
		/*
		String a="��ħ �� �Ծ���";
		if(a=="��ħ �� �Ծ���") {
			System.out.println("���� �Ծ���");
		}else {
			System.out.println("�ƹ��͵� �ȸԾ���");
		}*/
		
		
		//5��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���� �Ծ����ϱ�? �Ծ����� '��'�� �Է��ϼ���");
		String message=scanner.next();
		if(message.equals("��")) {
			System.out.println("��ħ���� ���� ����");
		}else if(message.equals("��")) {
			System.out.println("��ħ���� ���� ����");
		}else if(message.equals("��")) {
			System.out.println("��ħ���� ���� ����");
		}else if(message.equals("����")){
			System.out.println("��ħ���� ������ ����");
		}*/
		
		//6��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("��, �� �� �� �ϳ��� �Է��ϼ���");
		String i=scanner.next();
		if(i.equals("��")) {
			System.out.println("�Ľ����� '��'�� '���̽�ũ��'�� �ϳ��� ���ϼ���.");
			String j=scanner.next();
			System.out.println(j+"�� ���ְ� �弼��.");
		}else if(i.equals("��")) {
			System.out.println("�Ľ����� '����'�� 'Ŀ��'�� �ϳ��� ���ϼ���.");
			String k=scanner.next();
			System.out.println(k+"�� ���ְ� �弼��.");
		}*/

		//7��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("���� �Ծ����ϱ�? �Ծ����� '��'�� �Է��ϼ���");
		String i=scanner.next();
		if(i.equals("��")) {
			System.out.println("���� �Ծ���"+" ���� �Ծ���");
		}else {
			System.out.println("���� �Ծ���"+" ������ �Ծ���");
		}*/
		
		//8��
		//if��
		/*
		String sun="��";
		String cloud="����";
		String moon="��";
		String star="��";
		boolean isFlag1=true;
		boolean isFlag2=true;
		if(isFlag1) {
			for(int i=0;i<1;i++) {
				for(int j=i;j<i+1;j++) {
					System.out.println(sun);
				}
				System.out.println(sun+","+cloud);
			}
			System.out.println(cloud);
		}
		
		if(isFlag2) {
			for(int i=0;i<1;i++) {
				for(int j=i;j<i+1;j++) {
					System.out.println(moon);
				}
				System.out.println(moon+","+star);
			}
			System.out.println(star);
		}*/
		
		
		
		//3��
		/*
		int i=(new java.util.Date()).getDay();
		if(i==0) {
			System.out.println("�Ͽ���");
		}else if(i==1) {
			System.out.println("������");
		}else if(i==2) {
			System.out.println("ȭ����");
		}else if(i==3) {
			System.out.println("������");
		}else if(i==4) {
			System.out.println("�����");
		}else if(i==5) {
			System.out.println("�ݿ���");
		}else {
			System.out.println("�����");
		}*/
		
		//4��
		/*
		int i=(new java.util.Date()).getMonth();
		if(i==0) {
			System.out.println("1���̰� 31���Դϴ�.");
		}else if(i==1) {
			System.out.println("2���̰� 28���Դϴ�");
		}else if(i==2) {
			System.out.println("3���̰� 31���Դϴ�.");
		}else if(i==3) {
			System.out.println("4���̰� 30���Դϴ�.");
		}else if(i==4) {
			System.out.println("5���̰� 31���Դϴ�.");
		}else if(i==5) {
			System.out.println("6���̰� 30���Դϴ�.");
		}else if(i==6){
			System.out.println("7���̰� 31���Դϴ�.");
		}else if(i==7){
			System.out.println("8���̰� 31���Դϴ�.");
		}else if(i==8){
			System.out.println("9���̰� 30���Դϴ�.");
		}else if(i==9){
			System.out.println("10���̰� 31���Դϴ�.");
		}else if(i==10){
			System.out.println("11���̰� 30���Դϴ�.");
		}else if(i==11){
			System.out.println("12���̰� 31���Դϴ�.");
		}*/
		
		//5��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("����� �Է��ϼ���");
		int i=Integer.parseInt(scanner.next());
		if(i>=90 && i<95) {
			System.out.println("S");
		}else if(i>=95 && i<100) {
			System.out.println("M");
		}else if(i>=100 && i<105) {
			System.out.println("L");
		}else if(i>=105 && i<120) {
			System.out.println("XL");
		}else if(i>=110) {
			System.out.println("XXL");
		}*/
		
		//6��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("java ������ �Է��ϼ���");
		int i=Integer.parseInt(scanner.next());
		System.out.println("html ������ �Է��ϼ���");
		int j=Integer.parseInt(scanner.next());
		System.out.println("db ������ �Է��ϼ���");
		int k=Integer.parseInt(scanner.next());
		if(i<=40 || j<=40 || k<=40) {
			if(i<=40) {
				System.out.println("java "+i);
			}else if(j<=40) {
				System.out.println("html "+j);
			}else if(k<=40) {
				System.out.println("db "+k);
			}
			System.out.println("����");
		}else if((i+j+k)/3>=60) {
			System.out.println("�հ�");
		}else if((i+j+k)/3<60) {
			System.out.println("���հ�");
		}*/
		
		//2�� ��ü������
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("��ѷ�(cm), �����ѷ�(cm), �ȱ���(cm), �㸮�Ѹ�(inch) �� �ϳ��� �Է��ϼ���");
		System.out.println("��ѷ�(cm)�� 33���� 45���� �Է�");
		System.out.println("�����ѷ�(cm)�� 86���� 132���� �Է�");
		System.out.println("�ȱ���(cm)�� 78���� 91���� �Է�");
		System.out.println("�㸮�ѷ�(inch)�� 28���� 40���� �Է�");
		int i=Integer.parseInt(scanner.next());
		if((i>=33 && i<=35) || (i>=86 && i<=91) || (i>=78 && i<=81) || (i>=28 && i<=29)) {
			System.out.println("�̱� ������: S");
			System.out.println("�ѱ� ������: 90~95");
		}else if((i>=36 && i<=37) || (i>=96 && i<=102) || (i>=81 && i<=84) || (i>=30 && i<=31)) {
			System.out.println("�̱� ������: M");
			System.out.println("�ѱ� ������: 95~100");
		}else if((i>=38 && i<=39) || (i>=107 && i<=112) || (i>=84 && i<=86) || (i>=32 && i<=34)) {
			System.out.println("�̱� ������: L");
			System.out.println("�ѱ� ������: 100~105");
		}else if((i>=41 && i<=42) || (i>=117 && i<=122) || (i>=86 && i<=89) || (i>=34 && i<=37)) {
			System.out.println("�̱� ������: XL");
			System.out.println("�ѱ� ������: 105~120");
		}else if((i>=43 && i<=45) || (i>=127 && i<=132) || (i>=89 && i<=91) || (i>=38 && i<=40)) {
			System.out.println("�̱� ������: XXL");
			System.out.println("�ѱ� ������: 110~");
		}*/
		
		
		//���� ������Ʈ
		//1��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("ù ��° �� �Է�>>");
		int i=Integer.parseInt(scanner.next());
		System.out.println("������ ����>>1. '+'  2. '-'  3. 'x'  4. '/' ");
		int a=Integer.parseInt(scanner.next());
		System.out.println("�� ��° �� �Է�>>");
		int j=Integer.parseInt(scanner.next());
		if(a==1) {
			int sum=i+j;
			System.out.println(i+"+"+j+"="+sum+"�Դϴ�.");
		}else if(a==2) {
			int minus=i-j;
			System.out.println(i+"-"+j+"="+minus+"�Դϴ�.");
		}else if(a==3) {
			int mul=i*j;
			System.out.println(i+"x"+j+"="+mul+"�Դϴ�.");
		}else if(a==4) {
			int div=i/j;
			System.out.println(i+"/"+j+"="+div+"�Դϴ�.");
		}*/
		
		//2��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("����, ����, �� ������ �����մϴ�.");
		System.out.println("1. ����, 2. ����, 3.�� �� ���� �ϳ��� �����ϼ���.>>");
		int i=Integer.parseInt(scanner.next());
		if(i==1) {
			int j= (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==2) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==3) {
				System.out.println("������ '��'�� �½��ϴ�.");
			}
		}else if(i==2) {
			int j= (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==2) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==3) {
				System.out.println("������ '��'�� �½��ϴ�.");
			}
		}else if(i==3) {
			int j=  (int)(Math.random()*3)+1;
			if(j==1) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==2) {
				System.out.println("������ '����'�� �½��ϴ�.");
			}else if(j==3) {
				System.out.println("������ '��'�� �½��ϴ�.");
			}
		}*/
			
		//3��
		/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("�ҵ�ݾ��� �Է��ϼ���. (����: ����)>>");
		int i=Integer.parseInt(scanner.next());
		int total=0;
		if(i<=1200) {
			total=(i*6)/100;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�.");
		}else if(i>1200 && i<=4600) {
			total=((i*15)/100)-108;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�." );
		}else if(i>4600 && i<=8800) {
			total=((i*24)/100)-522;
			System.out.println("�絵�ҵ漼: +total+���� �Դϴ�.");
		}else if(i>8800 && i<=10500) {
			total=((i*35)/100)-1490;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�.");
		}else if(i>10500 && i<=30000) {
			total=((i*38)/100)-1940;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�.");
		}else if(i>30000 && i<=50000) {
			total=((i*40)/100)-2540;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�.");
		}else if(i>50000) {
			total=((i*42)/100)-3540;
			System.out.println("�絵�ҵ漼: "+total+"���� �Դϴ�.");
		}*/
		
		
		
		
		
		
		
		
		
		
	}
}
