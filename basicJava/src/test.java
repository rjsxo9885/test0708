import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a1 ;// ó�� �ܰ�
		int a2;// ���Ӻ�
		int b ; //���� ȸ������
		int c1 ;//����Ʈ��
		int c2=0;//����Ʈ �հ�
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
