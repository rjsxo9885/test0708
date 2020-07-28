package day19;

 interface ICalc{
	public abstract int numAdd();
	public int numMin();
	public int numMax();
	public int numDiv();
}

 class Cals implements ICalc{
	 private int x ;
	 private int y;
	 @Override
	public int numMin() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int numMax() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int numDiv() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
	 @Override
	 public int numAdd() {
		 int r = this.x+y;
		 return r;
	 }
	 
	 public Cals() {}
	 public Cals(int x,int y) {
	 super();
	 this.x = x;
	 this.y= y;
	 
	 }
 }


public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cals cal = new Cals();
		System.out.println(cal.numAdd());
		System.out.println(cal.numDiv());
		System.out.println(cal.numMax());
		System.out.println(cal.numMin());
		
		
	}

}
