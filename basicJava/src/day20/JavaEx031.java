package day20;
import java.util.Scanner;
public class JavaEx031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
		String tango = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("영어 단어를 입력하세요 ->");
			String s = sc.next();
			
			if(s.equals("exit")) {
				System.out.println("종료");
				return;
			}
			else {
				for(int i=0; i<eng.length; i++) {
					if(s.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					if(i==4) {
						System.out.println("잘못된 단어입니다");
						break;
					}
					}
				}
				
			}
			
			
		}
	}

	

