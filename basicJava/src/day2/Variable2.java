package day2;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 65;
		char b = 'a';
		
		
		System.out.println(a);//결과 65
		System.out.println((char)a);//A
		System.out.println(b);//a
		System.out.println((int)b);//97
		System.out.println('A');//A
		System.out.println((int)'A');//65
		char c= '\u0041'; // \ u 유니코드값
		System.out.println(c); //A
		System.out.println((int)'a');
		System.out.println('a'-'A');
		System.out.println((int)'b');
		System.out.println((int)'c');
		System.out.println((int)'B');
		
		String name ="홍길동";
	}

}
