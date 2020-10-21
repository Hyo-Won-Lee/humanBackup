package human;

public class H_1016_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFlag1=true, isFlag2=true;
		isFlag1=2>1;isFlag2=1>2;
		
		if(isFlag1==true) {
			if(isFlag2==true) {
				System.out.println("1번 isFlag1은 true isFlag2는 true");
			}else {
				System.out.println("2번 ifFlag1은 true isFlag2는 false");
			}
		}else {
			if(isFlag2==true) {
				System.out.println("3번 isFlag1은 false isFlag2는 true");
			}else {
				System.out.println("4번 isFlag1은 false ifFlag2는 false");
			}
		}
	}

}
