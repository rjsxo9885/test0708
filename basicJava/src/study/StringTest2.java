package study;
import java.util.Scanner;
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("주민번호를 입력하시오");
		String a = sc.next();
		//930515-1011111
		char c = a.charAt(6);
		String b = a.substring(0,2);
		System.out.println("[출력결과]");
		System.out.println("생년월일 :"+a.substring(0,2)+"년"+a.substring(2,4)
		+"월"+a.substring(4,6)+"일");
		if(a.charAt(6)==(char)'1') {
			System.out.println("성별 : 남자");
		}else if(a.charAt(6)==(char)'2'){
			System.out.println("성별 : 여자");
		}else if(a.charAt(6)==(char)'3') {
			System.out.println("성별 : 남자");
		}else if(a.charAt(6)==(char)'4') {
			System.out.println("성별 : 여자");
		}
	
		if(Integer.parseInt(b)>0&&Integer.parseInt(b)<=20) {
			switch(Integer.parseInt(a.substring(6,7))) {
			case 1 :System.out.println("나이 : " +Math.abs((2021-(1900+Integer.parseInt(b))))); break;
			case 2 :System.out.println("나이 : " +Math.abs((2021-(1900+Integer.parseInt(b))))); break;
			case 3 :System.out.println("나이 : " +Math.abs((21-(Integer.parseInt(b))))); break;
			case 4 :System.out.println("나이 : " +Math.abs((21-(Integer.parseInt(b))))); break;
			}
			}
			//System.out.println("나이 : " +Math.abs((21-(Integer.parseInt(b)))));}
		else if(Integer.parseInt(b)>20) {
			System.out.println("나이 : " +Math.abs((2021-(1900+Integer.parseInt(b)))));
		}
		
		
		//System.out.println("나이 : " +Math.abs((20-(Integer.parseInt(b)+1))));
		
	}

}

