package day5;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 1;
		if(age >8) {
			System.out.println("이 학생은 학교에 다닙니다");
		}
		int month = 7;
		int day =2;
		if(month==1 && day ==1) {
			++age;
		}
		System.out.println(age);
		int number = -5;
		if(number <0) {
			System.out.println("음수입니다");
		}
		if(number >0) {
			System.out.println("양수입니다.");
		}
	}
	

}
