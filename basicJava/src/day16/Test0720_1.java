package day16;

public class Test0720_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str = "JAVA=PROGRAMMING";
		int sum= 0;
		String pro[]  = str.split("");
		
		for(int i=0; i<pro.length; i++) {
		System.out.println(pro[i]);
		}
		
		int index =  pro.length;
		System.out.println(index -1);
		
		for(int i=0; i<pro.length;i++) {
			char ch = pro[i].charAt(0);
			if(ch == 'M') {
				
				++sum;
			}
			
		}
		System.out.println(sum);
	
	
	}

}
