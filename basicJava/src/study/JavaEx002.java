package study;

import java.util.Scanner;

public class JavaEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min,sec,hour;
        sec = sc.nextInt();
        
        min = sec / 60;
        hour = min / 60;
        sec = sec % 60;
        min = min % 60;
		
		System.out.println(hour+"시간"+min+"분"+sec+"초");
	}

}
