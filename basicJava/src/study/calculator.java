package study;

public class calculator {
	
	private int num1 ;
	private int num2 ;
	
	
	public void setNumber(int n1,int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	
	public int add() {
		return num1+num2;
	}
	
	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public int div() {
		return num1/num2;
	}
}
