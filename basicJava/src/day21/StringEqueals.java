package day21;

public class StringEqueals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
			Integer i1 = new Integer(100);
			Integer i2 = new Integer(100);
			
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));
	}

}