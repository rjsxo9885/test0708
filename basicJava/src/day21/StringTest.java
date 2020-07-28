package day21;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String str1 = new String("abc");
		String str2 = "abc";
		StringBuffer str5 = new StringBuffer("BYE");
		
		
		System.out.println(str1 == str2);
		
		String str = "Gone With The Wind";
		
		System.out.println(str.indexOf("G"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("R"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = str.replace('n', 'm');
		System.out.println(str);
		
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,11));
		
		System.out.println(str.charAt(5));
		
		
	}

}
