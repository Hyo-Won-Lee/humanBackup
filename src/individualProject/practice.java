package individualProject;

import java.util.Scanner;

interface Car{
	void work();
}

interface Cannon{
	void fire();
}

class Tank implements Car,Cannon{
	public void work() {
		System.out.println("��ũ�� ������ �������ϴ�.");
	}
	
	public void fire() {
		System.out.println("��ũ���� ������ �߻��մϴ�.");
	}
	
}

public class practice {

	public static void main(String[] args) {
		Tank tank1=new Tank();
		tank1.work();
		tank1.fire();
		
		
	}

}
