package study;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator t1 = new calculator();
		
		t1.setNumber(100, 20);
		System.out.println(t1.add());
		System.out.println(t1.div());
		System.out.println(t1.mul());
		
	}

}
