package day7;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		int a = 5;
		for(int i=0; i<a; i++) {
			
			System.out.println((i+1)+"번째 : HI,JAVA");
		    sum = sum+1;
		}
		System.out.println("최종 i :"+sum);
		System.out.println("반복횟수 :"+ a);
		
		/*
		 * while문 : 반복대상을 한번도수행하지 않을수 있다.(반복횟수 0 회 이상)
		 * do~while문 : 반복대상을 무조건 한번은 실행해야한다(반복횟수 0회이상)
		 * 
		 */
		
	}

}


