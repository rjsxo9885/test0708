package day9;

public class Test0709_1 {
	
	public static int add(int a , int b) {
		return a+b;
	}
	public static char add(char a,char b) {
		
		return (char)(a+b);
	}
	
	
	public static String add(String n,String m) {
		return n+m;
	}
	
	public static double add(double n,double m) {
		return n+m;
	}
	
	//�޼ҵ� �����ε� <--------�޼ҵ� �ߺ�
	//:(�� Ŭ���� ������)
	//�޼ҵ� ���� ����
	//�Ű������� ���� �Ǵ� �ڷ����� �ٸ����
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r1 = add(10,20);
		double r2 = add(1.1,2.2);
		char r3 = add('1','A');
		String r4 = add("Hello","JAVA");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
