package com.human.dto;

import java.util.Arrays;

public class Java007 {
	
	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
		//1. a배열의 내용을 오른쪽으로 1칸 Shift하는 작업
		//2. moveCount만큼 1칸 shift작업을 반복한다.
		//3. chaneNum을 설정해보자. 0보다 작으면 원래 배열의 수, 아니면 해당 수로 변경
//		for(int j=0;j<moveCount;j++) {
//			int temp=a[a.length-1];
//			if(changeNum>=0) {
//				temp=changeNum;
//			}
//			for(int i=a.length-2;i>=0;i--) {
//				a[i-1]=a[i];		
//			}
//			a[0]=temp;
//		}
		
//		for(int j=0;j<moveCount;j++) {  //2.
//			int temp=a[a.length-1];
//			if(changeNum>=0) {
//				temp=changeNum;
//			}
//			for(int i=a.length-2;i>=0;i--) {
//				a[i-1]=a[i];		
//			}
//			a[0]=temp;
//		}
				
//		int temp=a[a.length-1];  //1.
//		for(int i=a.length-2;i>=0;i--) {
//			a[i-1]=a[i];		
//		}
//		a[0]=temp;
	}
	
	public static void main(String[] args) {
		//문제4) 배열 a[]={12,1,5,3,6,8,5,3}을 만든 다음에
		//배열의 모든 내용을
		//더한 값을 sum에 저장하여 출력하는 코드를 만들어 보자.
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
//		System.out.println(sum);
//		
//		//for(하나의 데이터:[배열이나 컬렉션])
//		sum=0;
//		for(int i:a) { 
//			sum+=i;
//		}
//		System.out.println(sum);
//		
//		//읽기모드
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		//객체의 경우도 읽기 모드?
//		Human aH[]= {
//				new Human("홍1",1,1),
//				new Human("홍2",12,12),
//				new Human("홍3",13,13)
//		};
//		for(Human h:aH) {
//			h.age=100; //실제 데이터가 변경됨
//			h=new Human("홍1",99,99); //실제데이터가 변경되지 않음.
//		}
//		System.out.println(Arrays.toString(aH));
		
		//문제 5) 배열 1,2,3,4,5,6,7,8,9에서
		//이동방향, 이동칸수, 채울숫자를
		//입력받아 배열의 내용을 변경 후 출력해보자.
		int a[]= {1,2,3,4,5,6,7,8,9};
		String direction="";
		int moveCount=3;
		int changeNum=0;
		
		moveFunc(a,direction,moveCount,changeNum);
		//이동 작업
		System.out.println(Arrays.toString(a));
			
		
	}
}
