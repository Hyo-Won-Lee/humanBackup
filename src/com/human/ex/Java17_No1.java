package com.human.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class MyDate{
	private int day = 0;
	private int month = 0;
	private int year = 0;
	public String date = year+"-"+month+"-"+day; 
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		date = this.year+"-"+this.month+"-"+this.day;
	}
	public void isValid() {
		if(isValid2() == true) System.out.println("유효하지 않은 날짜입니다.");
		else System.out.println("유효한 날짜입니다.");
	}
	public boolean isValid2() {
		SimpleDateFormat isValid = new SimpleDateFormat("yy-MM-dd");
		isValid.setLenient(false);
		System.out.println(date);
		try {
			isValid.parse(date);
			return true;
		}catch(ParseException e){
			return false;
		}
	}
	
}


public class Java17_No1 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30,2,2000);
		date1.isValid();
		MyDate date2 = new MyDate(2,10,2006);
		date2.isValid();
		
	}

}
