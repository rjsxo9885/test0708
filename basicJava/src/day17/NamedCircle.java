package day17;

class NamedCircle extends Circle{
	
	private String name;
	
	public NamedCircle(int radius,String name) {
		super(0);
		setRadius(radius);
		this.name = name;
	}
	
	public void show() {
		
		System.out.println("반지름 ="+this.getRadius()+"이름은 ="+name);
	}
	
	
	
		
}
