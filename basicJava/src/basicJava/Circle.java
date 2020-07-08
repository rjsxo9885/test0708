package basicJava;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 2;
		double b = Math.PI*(2*r);
		double c = (Math.PI*r*r);
		System.out.println("이 원의 반지름은"+r+"입니다.");
		System.out.println("이 원의 둘레는 "+b+"입니다.");
		System.out.println("이 원의 넓이는 "+c+"입니다.");
		System.out.printf("이 원의 둘레는 %.3f입니다\n",b);
		
		
		
	}

}
