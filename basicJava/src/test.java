import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a1 ;// 처음 잔고
		int a2;// 운임비
		int b ; //지불 회ㅏㅅ수
		int c1 ;//포인트률
		int c2=0;//포인트 합계
		a1 = sc.nextInt();
		b = sc.nextInt();
		
		for(int i=0; i<b;  i++ ) {
			
			
			a2 = sc.nextInt();
			c1 = a2/10;
			a1 = a1 +(- a2);
			
			c2 = c1+(c2);
			{
				
			
			if(c2>a2) {
				c2 = c2-a2-(c1);
				a1 = a1+a2;
			}
			System.out.printf("%d %d\n",a1,c2);   
			}
			
			
		}
		
		
	}

}
