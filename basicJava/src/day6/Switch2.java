package day6;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//ÁÖ»çÀ§ ´«±ÝÀ»ÀÔ·Â(1~6)
			//È¦¼ö,Â¦¼ö ±¸º°
			//"È¦¼ö´«±Ý ", "Â¦¼ö´«±Ý" Ãâ·Â
		
		int a;
		Scanner sc = new Scanner(System.in);
		a =  sc.nextInt();
		
		switch(a){
			case 1:
				System.out.println("È¦¼ö :1"); break;
			case 2: 
				System.out.println("Â¦¼ö :2"); break;
			case 3:
				System.out.println("È¦¼ö :3"); break;
			case 4:
				System.out.println("Â¦¼ö :4"); break;
			case 5:
				System.out.println("È¦¼ö :5"); break;
			case 6:
				System.out.println("Â¦¼ö :6"); break;
			default:
			    System.out.println("Àß¸ø ÀÔ·ÂÇß½À´Ï´Ù"); break;
			}	
		}
	}


