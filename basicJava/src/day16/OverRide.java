package day16;

class Over{
	public int sub(int num1,int num2) {
		return num1-num2;
	}
}
class OverSub extends Over{
	public int sub(int num1,int num2) {
	  return num1 > num2 ? num1-num2 : num2-num1;
 }
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Over cal1 = new Over();
		
		System.out.println(cal1.sub(10,20));
		
		OverSub cal2 = new OverSub();
		System.out.println(cal2.sub(10, 20));
		
		
		
		
		
	}

}
