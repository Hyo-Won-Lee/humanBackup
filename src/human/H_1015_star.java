package human;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class H_1015_star {

	public static void main(String[] args) {
		int star, a, s1, s11, s2, s3, s4, s5, s6, s7, s8, s9, s10;
		int s88=0;
		Scanner num=new Scanner(System.in);
		
		while (true) {
			
			System.out.println("���� �����ó���?\n1. ��´� 2. ����´�(����)");
			System.out.print("�Է�:: ");
			star=num.nextInt();
			if(star == 2) {
				break;
			}
			
			System.out.println("\n���� �����Ŵٸ� �����ϼ̽��ϴ�.");
			System.out.println("� ����� ���� �������?\n1. ���� 2. �ﰢ�� 3. ���ﰢ�� 4. �ݴ�ﰢ�� 5. �ݴ� ���ﰢ�� \n6. ������ 7. �Ƕ�̵� 8. �𷡽ð� 9. ��Ʈ 10. �����");
			System.out.print("�Է� :: ");
			a=num.nextInt();
			
			switch(a) {
				case 1 :
					System.out.println("\n1.���� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s1=num.nextInt();
					System.out.println("���� �ٸ��� �� ���� �������?");
					System.out.print("�Է� :: ");
					s11=num.nextInt();
					for(int i=0; i<s1;i++) {
						for(int j=0; j<s11; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 2 :
					System.out.println("\n2. �ﰢ�� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s2=num.nextInt();
					for(int i=0; i<s2; i++) {
						for(int j=0; j<=i; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 3 :
					System.out.println("\n3. ���ﰢ�� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s3=num.nextInt();
					for(int i=1; i<=s3;i++) {
						for(int j=0; j<s3-i; j++) {
							System.out.print(" ");
						}
						for(int k=0; k<i; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 4 :
					System.out.println("\n4. �ݴ� �ﰢ�� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s4=num.nextInt();
					for(int i=0; i<=s4; i++) {
						for(int j=0; j<s4-i; j++) {
							System.out.print(" ");
						}
						for(int k=0; k<i; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 5 :
					System.out.println("\n5. �ݴ� ���ﰢ�� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s5=num.nextInt();
					for(int i=0;i<s5; i++) {
						for(int j=1;j<s5;j++) {
							System.out.print(" ");
						}
						for(int k=0;k<s5-i;k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 6 :
					System.out.println("\n6. ������ �����ϼ̽��ϴ�.");
					for (int i =0; i<5; i++) {
						for (int j=4; j>i;j--) {
							System.out.print(" ");
						}
						for(int k=1; k<=i*2+1;k++) {
							System.out.print("*");
						}
						System.out.println("   ");
					}
					for(int i=0; i<4; i++) {
						for (int j =0; j<=i; j++) {
							System.out.print(" ");
						}
						for(int k=7; k>=i*2+1;k--) {
							System.out.print("*");
						}
						System.out.println();
					}
					
				case 7 :
					System.out.println("\n7. �Ƕ�̵� �����ϼ̽��ϴ�.");
					System.out.println("�� �� ������?");
					System.out.print("�Է� :: ");
					s7=num.nextInt();
					for(int i=0;i<s7; i++) {
						for(int j=1;j<s7-i;j++) {
							System.out.print(" ");
						}
						for(int k=0;k<i*2+1;k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 8 :
					System.out.println("\n8. �𷡽ð� �����ϼ̽��ϴ�.\n");
					int input = 5;
			        int st = 0;
			        input = (input % 2 == 0) ? input - 1 : input;
			 
			        for (int line = 0; line < input; line++) {
			            for (int put = 0; put < (input - st); put++) {
			                System.out.print((put >= st) ? "*" : " ");
			            }
			            st = line < (input / 2) ? st + 1 : st - 1;
			            System.out.println();
			        }
					break;
					
				case 9 :
					System.out.println("\n9. ��Ʈ �����ϼ̽��ϴ�.\n");
					for(int i=4;i<10;i+=2) {
						for(int j=0;j<=(10-i);j++) {
							System.out.print(" ");
						}
						for(int j = 0; j <= i * 2; j++ ) {
							System.out.print("*");
						}
						for(int j = 0; j <= (10 - i) * 2; j++ ){
							System.out.print(" ");
						}
						for(int j=0; j<=i*2;j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					for(int i=20;i>=0; i-=2) {
						for(int j=0;j<=20-i; j++) {
							System.out.print(" ");
						}
						for(int j=0; j<=i*2;j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 10 :
					System.out.println("\n10. ���� �����ϼ̽��ϴ�.\n");
					int stop=12, low=1, high=11;
					for(int i =1; i< stop; i++) {
						for(int j =1; j<stop; j++) {
							if(j<=low) {
								System.out.print("*");
							}else if(j>=high) {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}
						}
						if(i>5) {
							low--;
							high++;
						}else if(i<6) {
							low++;
							high--;
						}
						System.out.println();
					}
					break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
