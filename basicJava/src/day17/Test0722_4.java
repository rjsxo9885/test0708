package day17;

	
class MyPoint {
	   int x; 
	   int y;
	   MyPoint(int x, int y)
	   {this.x = x;this.y = y;}
	   /* getDistance() �޼��带 �ۼ��Ͻÿ�*/
	 
     public double  getDistence(int a,int b){
		  return Math.sqrt( Math.pow(x-a, 2)+Math.pow(y-b, 2));
				 
}
}
	
	
	

	class Test0722_4 {
			  
		public static void main(String args[]) { 
			    
			MyPoint p = new MyPoint(1,1); 
			     
			     
			// (1.1)�� (2,2)�� �� �Ÿ��� ���Ѵ�. 
			     
			System.out.println(p.getDistence(2,2)); 
			   
		}
			
	}
	
	