package study;

import java.util.Scanner;



public class MyDate {

	private int day,month,year;
		
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getMyday() {
		return day;
	}
	public void setMyday() {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
		
	}
	public void setMonth() {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear() {
		this.year = year;
	}
		
	public boolean isvalid() {
		
		if(month==2) {
			if(day>28);
			return false;
			
		}else if(day>31||month>12) {
			return false;
			
		}else { 
			return true;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		MyDate mydate1 = new MyDate(30,2,2000);
		System.out.println(mydate1.isvalid()?"유효한숫자입니다":"유효하지않은 날짜입니다");
		MyDate mydate2 = new MyDate(30,3,2020);
		System.out.println(mydate2.isvalid()?"유효한숫자입니다":"유효하지않은 날짜입니다");
	}

}
