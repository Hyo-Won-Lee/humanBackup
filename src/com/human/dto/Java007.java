package com.human.dto;

import java.util.Arrays;

public class Java007 {
	
	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
		//1. a�迭�� ������ ���������� 1ĭ Shift�ϴ� �۾�
		//2. moveCount��ŭ 1ĭ shift�۾��� �ݺ��Ѵ�.
		//3. chaneNum�� �����غ���. 0���� ������ ���� �迭�� ��, �ƴϸ� �ش� ���� ����
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
		//����4) �迭 a[]={12,1,5,3,6,8,5,3}�� ���� ������
		//�迭�� ��� ������
		//���� ���� sum�� �����Ͽ� ����ϴ� �ڵ带 ����� ����.
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum+=a[i];
//		}
//		System.out.println(sum);
//		
//		//for(�ϳ��� ������:[�迭�̳� �÷���])
//		sum=0;
//		for(int i:a) { 
//			sum+=i;
//		}
//		System.out.println(sum);
//		
//		//�б���
//		for(int i:a) {
//			i=0;
//		}
//		System.out.println(Arrays.toString(a));
//		
//		//��ü�� ��쵵 �б� ���?
//		Human aH[]= {
//				new Human("ȫ1",1,1),
//				new Human("ȫ2",12,12),
//				new Human("ȫ3",13,13)
//		};
//		for(Human h:aH) {
//			h.age=100; //���� �����Ͱ� �����
//			h=new Human("ȫ1",99,99); //���������Ͱ� ������� ����.
//		}
//		System.out.println(Arrays.toString(aH));
		
		//���� 5) �迭 1,2,3,4,5,6,7,8,9����
		//�̵�����, �̵�ĭ��, ä����ڸ�
		//�Է¹޾� �迭�� ������ ���� �� ����غ���.
		int a[]= {1,2,3,4,5,6,7,8,9};
		String direction="";
		int moveCount=3;
		int changeNum=0;
		
		moveFunc(a,direction,moveCount,changeNum);
		//�̵� �۾�
		System.out.println(Arrays.toString(a));
			
		
	}
}
