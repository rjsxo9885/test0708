package day17;

	
class MyPoint {
	   int x; 
	   int y;
	   MyPoint(int x, int y)
	   {this.x = x;this.y = y;}
	   /* getDistance() 메서드를 작성하시오*/
	 
     public double  getDistence(int a,int b){
		  return Math.sqrt( Math.pow(x-a, 2)+Math.pow(y-b, 2));
				 
}
}
	
	
	

	class Test0722_4 {
			  
		public static void main(String args[]) { 
			    
			MyPoint p = new MyPoint(1,1); 
			     
			     
			// (1.1)과 (2,2)와 의 거리를 구한다. 
			     
			System.out.println(p.getDistence(2,2)); 
			   
		}
			
	}
	
	