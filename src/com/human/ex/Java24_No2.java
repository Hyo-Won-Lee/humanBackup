package com.human.ex;

class Person{
	public String name;
	public int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("��� [�̸� : " + name + ", ���� : " + age + "]");
	}
}


class Student3 extends Person{
	public int undergrad;
	public Student3() {}
	public Student3(String name, int age, int undergrad) {
		super();
		this.name = name;
		this.age = age;
		this.undergrad = undergrad;
	}
	public void show() {
		System.out.println("��� [�̸� : " + name + ", ���� : " + age + ", �й� : " + undergrad + "]");
	}
}


class ForeignStudent extends Student3{
	public String country;
	public ForeignStudent() {}
	public ForeignStudent(String name, int age, int undergrad, String country) {
		super();
		this.name = name;
		this.age = age;
		this.undergrad = undergrad;
		this.country = country;
	}
	public void show() {
		System.out.println("��� [�̸� : " + name + ", ���� : " + age + ", �й� : " + undergrad + 
				", ���� : " + country + "]");
	}
}



public class Java24_No2 {

	public static void main(String[] args) {
		
		Person p0 = new Person("�浿��",22);
		Person p1 = new Student3("Ȳ����",23,100);
		Person p2 = new ForeignStudent("Amy",30,200,"U.S.A");
		
		Person[] arr = new Person[3];
		arr[0]=p0;arr[1]=p1;arr[2]=p2;
		
		for(Person pp : arr) {
			pp.show();
		}
		
	}

}
