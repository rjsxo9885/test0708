package study;

public class Order {

	String number;
	String year ;
	String id ;
	String name ;
	String number1; //��ǰ��ȣ
	String si; //�ּ�
	
	
	
	public void Orderset(String n,String y,String i,String m,String n1,String s) {
		number =n;
		year =y;
		id = i;
		name = m;
		number1 =n1;
		si = s;
	}
	public void disp() {
		
		System.out.println("�ֹ���ȣ�� : "+number);
		System.out.println("�ֹ��� ���̵� :"+id);
		System.out.println("�ֹ� ��¥ :"+year);
		System.out.println("�ֹ� ��ǰ��ȣ :"+number1);
		System.out.println("��� �ּ� :"+si);
		
	}
}
