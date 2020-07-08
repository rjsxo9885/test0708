package day5;
import java.util.Scanner;
public class Asobi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int al = a.length();
		int bl = b.length();
		int cl = c.length();
				
		if(al>bl&&al>cl) {
			System.out.println(al);
		}else if(bl>al&&bl>cl) {
			System.out.println(bl);
		}else if(cl>al&&cl>bl) {
			System.out.println(cl);
		}else if(cl==bl&&bl==al) {
			System.out.println(al);
		}
	}

}
