package day20;
import java.util.Scanner;
public class JavaEx031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };
		String tango = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("���� �ܾ �Է��ϼ��� ->");
			String s = sc.next();
			
			if(s.equals("exit")) {
				System.out.println("����");
				return;
			}
			else {
				for(int i=0; i<eng.length; i++) {
					if(s.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
					if(i==4) {
						System.out.println("�߸��� �ܾ��Դϴ�");
						break;
					}
					}
				}
				
			}
			
			
		}
	}

	

