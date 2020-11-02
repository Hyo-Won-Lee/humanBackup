package individualProject;

import java.util.Scanner;

public class upperToLower {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
//		대문자  A  -  Z는  65  -  90의  아스키코드값을  가지고  있고,
//		소문자  a  -  z  는  97  -  122의  아스키코드값을  가지고  있습니다.  
//
//		입력  받은  문자열의  하나의  문자를  가져와  대문자와  소문자  사이의  값  32를  이용합니다.  
//
//		문자가  a  -  z인  97  -  122  사이에  속한  문자라면  32를  빼  대문자로  변환하고,
//		A  -  Z인  65  -  90사이에  속한  문자라면  32를  더해  소문자로  변환하시면  됩니다.

		
		//문자열 입력
		String beforeStr="";
		char afterStr[]=new char[100];
		char convert[]=new char[100];
		System.out.println("문자열 입력>>");
		beforeStr=sc.nextLine();
		convert=beforeStr.toCharArray();	//스트링배열-문자배열
		
		for(int i=0;i<convert.length;i++) {	
			if(convert[i]>=97 && convert[i]<=122) {  //소문자면
				afterStr[i]=(char)(convert[i]-32);
			}else if(convert[i]>=65 && convert[i]<=90) {  //대문자면
				afterStr[i]=(char)(convert[i]+32);
			}
		}
		System.out.print(afterStr);
		
		
		
	}

}
