package study;
import java.util.Scanner;
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ�");
		String a = sc.next();
		//930515-1011111
		char c = a.charAt(6);
		String b = a.substring(0,2);
		System.out.println("[��°��]");
		System.out.println("������� :"+a.substring(0,2)+"��"+a.substring(2,4)
		+"��"+a.substring(4,6)+"��");
		if(a.charAt(6)==(char)'1') {
			System.out.println("���� : ����");
		}else if(a.charAt(6)==(char)'2'){
			System.out.println("���� : ����");
		}else if(a.charAt(6)==(char)'3') {
			System.out.println("���� : ����");
		}else if(a.charAt(6)==(char)'4') {
			System.out.println("���� : ����");
		}
	
		if(Integer.parseInt(b)>0&&Integer.parseInt(b)<=20) {
			switch(Integer.parseInt(a.substring(6,7))) {
			case 1 :System.out.println("���� : " +Math.abs((2021-(1900+Integer.parseInt(b))))); break;
			case 2 :System.out.println("���� : " +Math.abs((2021-(1900+Integer.parseInt(b))))); break;
			case 3 :System.out.println("���� : " +Math.abs((21-(Integer.parseInt(b))))); break;
			case 4 :System.out.println("���� : " +Math.abs((21-(Integer.parseInt(b))))); break;
			}
			}
			//System.out.println("���� : " +Math.abs((21-(Integer.parseInt(b)))));}
		else if(Integer.parseInt(b)>20) {
			System.out.println("���� : " +Math.abs((2021-(1900+Integer.parseInt(b)))));
		}
		
		
		//System.out.println("���� : " +Math.abs((20-(Integer.parseInt(b)+1))));
		
	}

}

