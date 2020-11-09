package com.human.ex;

class Student1{
	public int kor=60;
	public int math=70;
	public int eng=90;
	
	public int score() {
		return (kor+math+eng);
	}	
	public double avg() {
		return ((kor+math+eng)/3);
	}
	public Student1(int kor, int math, int eng) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	public Student1() {}
	@Override
	public String toString() {
		return "Student1 [kor=" + kor + ", math=" + math + ", eng=" + eng +", score="+this.score()+", avg="+this.avg()+"]";
	}
}

class Student2{
	public int kor=60;
	public int math=70;
	public int eng=90;
	
	public int score() {
		return (kor+math+eng);
	}	
	public double avg() {
		return ((kor+math+eng)/3);
	}
	public Student2(int kor, int math, int eng) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	public Student2() {}
	@Override
	public String toString() {
		return "Student2 [kor=" + kor + ", math=" + math + ", eng=" + eng +", score="+this.score()+", avg="+this.avg()+"]";
	}
}

public class Java12 {
	public static void main(String[] arge) {
		Student1 s1=new Student1();
		System.out.println(s1);
		
		Student2 s2=new Student2(50,50,50);
		System.out.println(s2);
		
	}
	
}
