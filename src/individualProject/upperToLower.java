package individualProject;

import java.util.Scanner;

public class upperToLower {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		�빮��  A  -  Z��  65  -  90��  �ƽ�Ű�ڵ尪��  ������  �ְ�,
//		�ҹ���  a  -  z  ��  97  -  122��  �ƽ�Ű�ڵ尪��  ������  �ֽ��ϴ�.  
//
//		�Է�  ����  ���ڿ���  �ϳ���  ���ڸ�  ������  �빮�ڿ�  �ҹ���  ������  ��  32��  �̿��մϴ�.  
//
//		���ڰ�  a  -  z��  97  -  122  ���̿�  ����  ���ڶ��  32��  ��  �빮�ڷ�  ��ȯ�ϰ�,
//		A  -  Z��  65  -  90���̿�  ����  ���ڶ��  32��  ����  �ҹ��ڷ�  ��ȯ�Ͻø�  �˴ϴ�.

		
		//���ڿ� �Է�
		String beforeStr="";
		char afterStr[]=new char[100];
		char convert[]=new char[100];
		System.out.println("���ڿ� �Է�>>");
		beforeStr=sc.nextLine();
		convert=beforeStr.toCharArray();	//��Ʈ���迭-���ڹ迭
		
		for(int i=0;i<convert.length;i++) {	
			if(convert[i]>=97 && convert[i]<=122) {  //�ҹ��ڸ�
				afterStr[i]=(char)(convert[i]-32);
			}else if(convert[i]>=65 && convert[i]<=90) {  //�빮�ڸ�
				afterStr[i]=(char)(convert[i]+32);
			}
		}
		System.out.print(afterStr);
		
		
		
	}

}
