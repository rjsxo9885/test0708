package day7;

public class test0706_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<10; i++) {
			
			if(i%2 == 0&& i!=0) {
				sum+=1;
				
				
			}else {
				continue;
			}
			
			
		}
		
		System.out.println("짝수의 개수는  :"+sum+"개 입니다");
		
		
	}

}
