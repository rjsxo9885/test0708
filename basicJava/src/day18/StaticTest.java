package day18;

class Pay{
	
	public static String COMPANY = "abcdCom";
	public static double TAX = 0.03;
	public static int SUDANG = 100;
	public static int num = 10;
	//持失切
	//五社球
public void line() {
	System.out.println("--------------");
}
public static void disp() {
	System.out.println("==============");
}

}




public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pay.COMPANY);
		System.out.println(Pay.SUDANG);
		System.out.println(Pay.num);
		System.out.println(Pay.TAX);
		Pay.disp();
		
		Pay money = new Pay();
		money.disp();
		System.out.println(money.COMPANY);
		System.out.println(money.SUDANG);
		System.out.println(money.num);
		System.out.println(money.TAX);
		System.out.println("========================");
		Pay one = new Pay();
		one.SUDANG+=10;
		System.out.println(one.SUDANG);
		
		Pay.SUDANG+= 10;
		one.SUDANG+=10;
		
	}

}
