package com.human.ex;

class Dog{
	
	public int age;
	public String name;
	public boolean isVaccin;
	
	public Dog() {}
	public Dog(String name, int age, boolean isVaccin) {
		super();
		this.age = age;
		this.name = name;
		this.isVaccin = isVaccin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVaccin() {
		return isVaccin;
	}
	public void setVaccin(boolean isVaccin) {
		this.isVaccin = isVaccin;
	}
	@Override
	public String toString() {
		return "������ �̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�.";
	}
	public void addAge(int age) {
		this.age+=age;
		System.out.println(this.age);
	}
	public boolean isVaccination() {
		if(age > 5) {
			isVaccin = (isVaccin == false)? true : false;
		}
		return isVaccin;
	}
	
}

class Cat{
	
	public int age;
	public String name;
	public boolean isVaccin;
	
	public Cat() {}
	public Cat(String name, int age, boolean isVaccin) {
		super();
		this.age = age;
		this.name = name;
		this.isVaccin = isVaccin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVaccin() {
		return isVaccin;
	}
	public void setVaccin(boolean isVaccin) {
		this.isVaccin = isVaccin;
	}
	@Override
	public String toString() {
		return "������ �̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�.";
	}
	public void addAge(int age) {
		this.age+=age;
		System.out.println(this.age);
	}	
	public boolean isVaccination() {
		if(age > 5) {
			isVaccin = (isVaccin = false)? true : false;
		}
		return isVaccin;
	}
	
}

class Vaccination{
	
	public static int countVaccination;
	private static Vaccination instance = new Vaccination();
	private Vaccination() {}
	public static Vaccination getInstance(int count) {
		countVaccination = count;
		return instance;
	}
	public static Vaccination getInstance() {
		return instance;
	}
	public void vaccination(Dog dog) {
		
		if(dog.age > 5) {
			if(dog.isVaccin == false) {
				System.out.println(dog.name + "�Կ��� " + this.countVaccination + "��°�� ���������� �Ͽ����ϴ�.");
				dog.isVaccin = true; countVaccination++;
			}else {
				System.out.println(dog.name + "�Կ��� ���������� �̹� �ϼ̽��ϴ�.");
			}
		}else {
			System.out.println(dog.name + "���� ����ڰ� �ƴ�");
		}
			
	}
	public void vaccination(Cat cat) {
		
		if(cat.age > 5) {
			if(cat.isVaccin == false) {
				System.out.println(cat.name + "�Կ��� " + this.countVaccination + "��°�� ���������� �Ͽ����ϴ�.");
				cat.isVaccin = true; countVaccination++;
			}else {
				System.out.println(cat.name + "�Կ��� ���������� �̹� �ϼ̽��ϴ�.");
			}
		}else {
			System.out.println(cat.name + "���� ����ڰ� �ƴ�");
		}
			
	}
	
}


public class Java19 {

	public static void main(String[] args) {
		
		Dog d = new Dog("dog1",10,false);
		Cat c = new Cat("cat1",10,false);
		
		Vaccination v = Vaccination.getInstance(10);
		v.vaccination(d);
		v.vaccination(d);
		v.vaccination(new Dog("dog2",3,false));
		
		Vaccination v2 = Vaccination.getInstance();
		v2.vaccination(c);
		
	}

}
