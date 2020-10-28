package com.human.ex;

public class Java007 {
	public static void main(String[] args) {
		int[][] score= {{79,80,99},{95,85,89},{90,65,56},{69,78,77}};
		int[] student=new int[4];
		int[] subject=new int[3];
		String[] stuName= {"A학생","B학생","C학생","D학생"};
		String[] subName= {"영어","수학","과학"};
		
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<subject.length;j++) {
				student[i]+=score[i][j];
			}
			System.out.println(stuName[i]+"총점 : "+student[i]);
		}
		System.out.println("-----------------------");
		for(int i=0;i<subject.length;i++) {
			for(int j=0;j<student.length;j++) {
				subject[i]+=score[j][i];
			}
			System.out.println(subName[i]+"총점 : "+subject[i]);
		}
	}
}
