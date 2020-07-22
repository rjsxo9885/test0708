package day17;

class RandomDice{
		public int Dice() {
		
		return (int)(Math.random()*3+1);
		}
	
}


public class Test0722_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDice dice1 = new RandomDice();
		int [] a = new int [3];
		
		while(true) {
			
			for(int i =0 ;i<3; i++) {
		a[i]= dice1.Dice();
			
		System.out.printf("%d  ",a[i]);	
			}
			System.out.println();
		if((a[0]==a[1])&&(a[1]==a[2])) {
			System.out.println("¼º°ø");
			
			break;
		 }
		}
		
		}
		
	}


