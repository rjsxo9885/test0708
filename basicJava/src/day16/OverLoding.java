package day16;

public class OverLoding {

	
	public static int add(int num) {
		return num+1;
	}
	
	public static int add(int num1,int num2) {
		return num1 + num2 ;
	}
	
	public static double add(double num1, double num2) {
		return num1 +num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10));
		System.out.println(add(1.1,3.3));
		
	
		
		
	}

}
