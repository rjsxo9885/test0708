package day7;

public class test0706_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 //���
			int j=0;// ���� ����

			
			for(int i=1; i<=2020; i++) {
				
				if(i%4==0&& i % 100 != 0 || i % 400 == 0) {
					j++;
					
				}else {
					continue;
				}
				
			}
			System.out.println(j);
	}

}
