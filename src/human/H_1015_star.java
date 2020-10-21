package human;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class H_1015_star {

	public static void main(String[] args) {
		int star, a, s1, s11, s2, s3, s4, s5, s6, s7, s8, s9, s10;
		int s88=0;
		Scanner num=new Scanner(System.in);
		
		while (true) {
			
			System.out.println("별을 찍으시나요?\n1. 찍는다 2. 안찍는다(종료)");
			System.out.print("입력:: ");
			star=num.nextInt();
			if(star == 2) {
				break;
			}
			
			System.out.println("\n별을 찍으신다를 선택하셨습니다.");
			System.out.println("어떤 모양의 별을 찍을까요?\n1. 간단 2. 삼각형 3. 역삼각형 4. 반대삼각형 5. 반대 역삼각형 \n6. 마름모 7. 피라미드 8. 모래시계 9. 하트 10. 별모양");
			System.out.print("입력 :: ");
			a=num.nextInt();
			
			switch(a) {
				case 1 :
					System.out.println("\n1.간단 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
					s1=num.nextInt();
					System.out.println("별은 줄마다 몇 개씩 찍을까요?");
					System.out.print("입력 :: ");
					s11=num.nextInt();
					for(int i=0; i<s1;i++) {
						for(int j=0; j<s11; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 2 :
					System.out.println("\n2. 삼각형 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
					s2=num.nextInt();
					for(int i=0; i<s2; i++) {
						for(int j=0; j<=i; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					
				case 3 :
					System.out.println("\n3. 역삼각형 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
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
					System.out.println("\n4. 반대 삼각형 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
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
					System.out.println("\n5. 반대 역삼각형 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
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
					System.out.println("\n6. 마름모 선택하셨습니다.");
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
					System.out.println("\n7. 피라미드 선택하셨습니다.");
					System.out.println("몇 줄 만들까요?");
					System.out.print("입력 :: ");
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
					System.out.println("\n8. 모래시계 선택하셨습니다.\n");
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
					System.out.println("\n9. 하트 선택하셨습니다.\n");
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
					System.out.println("\n10. 나비 선택하셨습니다.\n");
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
		System.out.println("프로그램 종료");
	}
}
