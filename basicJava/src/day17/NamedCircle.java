package day17;

class NamedCircle extends Circle{
	
	private String name;
	
	public NamedCircle(int radius,String name) {
		super(0);
		setRadius(radius);
		this.name = name;
	}
	
	public void show() {
		
		System.out.println("������ ="+this.getRadius()+"�̸��� ="+name);
	}
	
	
	
		
}
