package day5;
import java.util.Scanner;
public class Asobi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		String words =sc.next();
		
		System.out.println("���ڸ� �Է����ּ���");
		char ch = sc.next().charAt(0);
		
		int i=0;
		int count =0; //ī��Ʈ
		
		for(i=0;i<words.length();i++) {
			if(ch == words.charAt(i)) {
				count += count +1;
				i++;
			}
			System.out.println("�Է��Ͻ� ���ڿ�����"+ch+"�� ��"+count+"�� �ֽ��ϴ�");
		}
		
	}
	}


