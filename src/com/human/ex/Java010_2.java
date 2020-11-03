package com.human.ex;

class Student{
	
	//필드,정적변수,클래스변수,static 변수
	public static int count=0;	//Method Area에 count가 잡힘.
	private String name="홍길동";
	public int kor=50;	
	private int math=50;	
	private int eng=60;
	public Student() {
		this("홍길동",23,56,88);	//this문 위에는 어떤한 것도 작성하지 않는다.
	}
	public Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		Student.count++;
	}
	public int total() {
		return (kor+math+eng);
	}
	public double avg() {
		return (total()/3.);
	}
	@Override
	public String toString() {
		return name+"님의 총점 : "+total()+"\n"+name+"님의 평균 : "+avg();
		//return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor<0) {
			this.kor=0;
		}
		if(kor>100) {
			this.kor=100;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

}

public class Java010_2 {

	public static void main(String[] args) {
		Student st1=new Student("홍길동",23,56,88);
//		System.out.println(st1.name+"님의 총점 : "+st1.total());
//		System.out.println(st1.name+"님의 평균 : "+st1.avg());
		System.out.println(st1);
		Student st2=new Student();
		st2.setKor(2313);	//setter, getter사용이유는 사용자가 음수와 같은 숫자 기입을 막기 위함.
		st2.setName("홍길동2");
//		System.out.println(st2.name+"님의 총점 : "+st2.total());
//		System.out.println(st2.name+"님의 평균 : "+st2.avg());
		System.out.println(st2);
		System.out.println(Student.count);
	}

}
