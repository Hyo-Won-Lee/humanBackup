package com.human.ex;

public class Java5 {
	public static void main(String[] args) {
		//1. 369���� �ش����� ����� ����.
		//1���� ���ʴ�� ���ڸ� ����ϴٰ� ���ڿ� 3,6,9�� �ϳ���
		//���� �ڼ��� ġ��ȴ�.
		//1,2,¦,4,5,¦,7,8,¦,10,11,12,¦,14......
		//�׷��� ���� 33,66���� �� ���� ���� �ڼ��� �� �� ģ��.
		//27,28,¦(29),¦(30),¦(31),¦(32),¦¦(33),......
	
//		for(int i=1;i<=1000;i++) {
//			//100�ڸ���
//			int equation1=i/100; //100�� �ڸ�
//			int equation2=(i-(i/100*100))/10; //10�� �ڸ�
//			int equation3=(i-(i/100*100))-(i-(i/100*100))/10*10; //1�� �ڸ�
//			
//			//10�ڸ���
//			int equation4=i/10; //10�� �ڸ�
//			int equation5=i%10; //1�� �ڸ�
//			if(i<100) {
//				if(i==3 || i==6 || i==9) {
//					System.out.println(i+" ¦");
//				}else if((equation4==3 || equation4==6 || equation4==9) && (equation5==3 || equation5==6 || equation5==9)) {
//					System.out.println(i+" ¦¦");
//				}else if((equation4==3 || equation4==6 || equation4==9) || (equation5==3 || equation5==6 || equation5==9)) {
//					System.out.println(i+" ¦");
//				}else {
//					System.out.println(i);
//				}
//			}else {
//				if((equation1==3 || equation1==6 || equation1==9) && (equation2==3 || equation2==6 || equation2==9) && (equation3==3 || equation3==6 || equation3==9)) {
//					System.out.println(i+" ¦¦¦");
//				}else if(((equation1==3 || equation1==6 || equation1==9) && (equation2==3 || equation2==6 || equation2==9)) || 
//						((equation2==3 || equation2==6 || equation2==9) && (equation3==3 || equation3==6 || equation3==9)) || 
//						((equation1==3 || equation1==6 || equation1==9) && (equation3==3 || equation3==6 || equation3==9))){
//					System.out.println(i+" ¦¦");
//				}else if((equation1==3 || equation1==6 || equation1==9) || (equation2==3 || equation2==6 || equation2==9) || (equation3==3 || equation3==6 || equation3==9)) {
//					System.out.println(i+" ¦");
//				}else {
//					System.out.println(i);
//				}
//			}
//		}
		

		
		
		
		//2. �����ϰ� ����,����,����,������ ������ ���� ����ڰ� ���ߴ� ���α׷��� ������ ����.
		//������ 4�ܰ�� �Ǿ��־� ó������ ���ϱ� ������ �����ٰ� ������ ���Ǹ� ����,����,�������� ���ʴ��
		//�߰��Ͽ� ������ �������� �غ���. 2�ڸ� ���� ���� ��길 ����.
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		//i�� 1�̸� 1�ܰ�, 2�� 2�ܰ�, 3�̸� 3�ܰ�, 4�̸� 4�ܰ�, 5�̸� ���� ����
		for(int i=0,score=0;i<5;) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print("1. 1�ܰ�, 2. 2�ܰ�, 3. 3�ܰ�, 4. 4�ܰ�, 5. ���� ����>>");
			System.out.println();
			i=Integer.parseInt(scanner.nextLine());;
			int rand1=(int)(Math.random()*99)+1;
			int rand2=(int)(Math.random()*99)+1;
			if(i==1) {
				//1�ܰ� ����
				int sum=rand1+rand2;
				System.out.print(rand1+"+"+rand2+"=");
				int a=Integer.parseInt(scanner.nextLine());
				if(a==sum) {
					System.out.println("����!");
					score++;
					System.out.println("����: "+score);
				}else {
					System.out.println("��!");
					score--;
					System.out.println("����: "+score);
				}
			}else if(i==2) {
				//2�ܰ� ����+����
				if(rand1%2==0) {  //����
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else {  //����
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}
			}else if(i==3) {
				//3�ܰ� ����+����+����
				if(rand1>=1 && rand1<=10) { //����
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else if(rand1>10 && rand1 <=20) { //����
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else { //����
					int rand3=(int)(Math.random()*10)+1; //������ 10���ϳ�����(�� �ڸ��������� �������)
					int rand4=(int)(Math.random()*10)+1;
					int mul=rand3*rand4;
					System.out.print(rand3+"x"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==mul) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}
				
			}else if(i==4) {
				System.out.println("4�ܰ�--------->�������� ���������� �Է�");
				//4�ܰ� ����+����+����+������
				if(rand1>=1 && rand1<=10) { //����
					int sum=rand1+rand2;
					System.out.print(rand1+"+"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==sum) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else if(rand1>10 && rand1 <=20) { //����
					int minus=rand1-rand2;
					System.out.print(rand1+"-"+rand2+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==minus) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else if(rand1>20 && rand1<=30){ //����
					int rand3=(int)(Math.random()*10)+1; //������ 10���ϳ�����(�� �ڸ��������� �������)
					int rand4=(int)(Math.random()*10)+1;
					int mul=rand3*rand4;
					System.out.print(rand3+"x"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(a==mul) {
						System.out.println("����!");
						score++;
						System.out.println("����: "+score);
					}else {
						System.out.println("��!");
						score--;
						System.out.println("����: "+score);
					}
				}else if(rand1>30) { //������
					int rand3=(int)(Math.random()*10)+1; //�������� 10���ϳ�����(�� �ڸ��������� �������)
					int rand4=(int)(Math.random()*10)+1;
					System.out.print(rand3+"/"+rand4+"=");
					int a=Integer.parseInt(scanner.nextLine());
					if(rand3>rand4) {
						int div=rand3/rand4;
						if(a==div) {
							System.out.println("����!");
							score++;
							System.out.println("����: "+score);
						}else {
							System.out.println("��!");
							score--;
							System.out.println("����: "+score);
						}
					}else if(rand3<rand4) {
						int div=rand4/rand3;
						System.out.print(rand4+"/"+rand3+"=");
						if(a==div) {
							System.out.println("����!");
							score++;
							System.out.println("����: "+score);
						}else {
							System.out.println("��!");
							score--;
							System.out.println("����: "+score);
						}
					}else {
						int div=rand4/rand3;
						if(a==div) {
							System.out.println("����!");
							score++;
							System.out.println("����: "+score);
						}else {
							System.out.println("��!");
							score--;
							System.out.println("����: "+score);
						}
					}
				}
			}
			System.out.println();
		}
		System.out.println("���� ����");
		
	}
}
