package com.human.ex;

public class Java007 {
	public static void main(String[] args) {
		int[][] score= {{79,80,99},{95,85,89},{90,65,56},{69,78,77}};
		int[] student=new int[4];
		int[] subject=new int[3];
		String[] stuName= {"A�л�","B�л�","C�л�","D�л�"};
		String[] subName= {"����","����","����"};
		
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<subject.length;j++) {
				student[i]+=score[i][j];
			}
			System.out.println(stuName[i]+"���� : "+student[i]);
		}
		System.out.println("-----------------------");
		for(int i=0;i<subject.length;i++) {
			for(int j=0;j<student.length;j++) {
				subject[i]+=score[j][i];
			}
			System.out.println(subName[i]+"���� : "+subject[i]);
		}
	}
}
