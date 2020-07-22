package study;

public class Order {

	String number;
	String year ;
	String id ;
	String name ;
	String number1; //상품번호
	String si; //주소
	
	
	
	public void Orderset(String n,String y,String i,String m,String n1,String s) {
		number =n;
		year =y;
		id = i;
		name = m;
		number1 =n1;
		si = s;
	}
	public void disp() {
		
		System.out.println("주문번호는 : "+number);
		System.out.println("주문자 아이디 :"+id);
		System.out.println("주문 날짜 :"+year);
		System.out.println("주문 상품번호 :"+number1);
		System.out.println("배송 주소 :"+si);
		
	}
}
