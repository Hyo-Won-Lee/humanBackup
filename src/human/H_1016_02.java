package human;

public class H_1016_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFlag1=true, isFlag2=true;
		isFlag1=2>1;isFlag2=1>2;
		
		if(isFlag1==true) {
			if(isFlag2==true) {
				System.out.println("1�� isFlag1�� true isFlag2�� true");
			}else {
				System.out.println("2�� ifFlag1�� true isFlag2�� false");
			}
		}else {
			if(isFlag2==true) {
				System.out.println("3�� isFlag1�� false isFlag2�� true");
			}else {
				System.out.println("4�� isFlag1�� false ifFlag2�� false");
			}
		}
	}

}
