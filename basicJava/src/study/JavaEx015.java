package study;

public class JavaEx015 {

	public static double Dice(double a) {
		
		a= Math.random()*6;
	   
		
	    return (int)(a+1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(Dice(1));
	}

}
