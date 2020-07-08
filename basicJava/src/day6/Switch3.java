package day6;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int kor = 80;
		int eng  = 100;
		int math = 60;
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		char grade;
		
		switch((int)avg/10) {
		case 10: 
			grade = 'S'; break;
		case 9:
			grade = 'A'; break; 
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		default:
			grade = 'F'; break; 
		}
		
		System.out.println("ÃÑÁ¡ :"+sum);
		System.out.printf("Æò±Õ :%.2f\n",avg);
		System.out.println("ÇÐÁ¡ :"+grade);
		
		
		
		
	}

}
