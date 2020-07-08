package day5;
import java.util.Scanner;
public class Asobi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		String words =sc.next();
		
		System.out.println("문자를 입력해주세요");
		char ch = sc.next().charAt(0);
		
		int i=0;
		int count =0; //카운트
		
		for(i=0;i<words.length();i++) {
			if(ch == words.charAt(i)) {
				count += count +1;
				i++;
			}
			System.out.println("입력하신 문자열에는"+ch+"가 총"+count+"개 있습니다");
		}
		
	}
	}


