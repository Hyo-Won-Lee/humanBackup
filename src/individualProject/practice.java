package individualProject;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String beforeStr="";
		char afterStr[]=new char[100];
		char convert[]=new char[100];
		System.out.println("문자열 입력>>");
		beforeStr=sc.nextLine();
		convert=beforeStr.toCharArray();
		
		for(int i=0;i<convert.length;i++) {
			if(convert[i]>=97 && convert[i]<=122) {
				afterStr[i]=(char)(convert[i]-32);
			}else if(convert[i]>=65 && convert[i]<=90) {
				afterStr[i]=(char)(convert[i]+32);
			}
		}
		System.out.println(afterStr);
		
		
		
		
	}

}
