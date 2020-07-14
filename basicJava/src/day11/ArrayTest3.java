package day11;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num1 = 30;
			int num2 =50;
			
			System.out.println("교환전 : "+num1+""+num2);
			
			num1 = num2;
			num2 = num1;
			
			System.out.println("교환후:"+num1+""+num2);
			
			int[]n = {30,50};
			n[0]=30;
			n[1]=50;
			System.out.println("교환전:"+n[0]+""+n[1]);
			
			int tmp = n[0];
			n[0]=n[1];
			n[1]=tmp;
			System.out.println("교환후:"+n[0]+""+n[1]);
	}

}
