package study;



public class JavaEx013 {

	public static int Abc(char c) {
		if((c>='A') && (c<='Z')) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Abc('a'));
		System.out.println(Abc('A'));
		
		
		
	}

}
