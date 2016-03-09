package InterfaceExamples;

interface Shape{
	/* Interfaces have methods without any definitions. */
	public void draw();
	public void moveTo(int newX, int newY);
	public double area();
	public double volume();
}

class Circle implements Shape{
	
	private int x, y, radius;
	private final double PI = 3.14159;
	
	public Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	@Override public void draw(){
		System.out.println("Drawing a circle at (" + x + ", " + y +
				"), radius " + radius);
	}
	
	@Override public void moveTo(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	@Override public double area(){
		return PI * (radius * radius);
	}
	
	@Override public double volume(){
		return (4.0/3.0) * PI * (radius * radius * radius);
	}
	
	public void setRadius(int newRadius){
		this.radius = newRadius;
	}
	
	
}

class Point implements Shape{
	
	private int x,y;

	@Override public void draw(){
		System.out.println("Drawing point at: "+ x + ", "+ y);
	}
	
	@Override public void moveTo(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	@Override public double area(){
		return 0;
	}
	
	@Override public double volume(){
		return 0;
	}
}

public class ShapeLib {

	public static void main(String[] args) {
		
		Point pt = new Point();
        pt.moveTo(3, 4);
        pt.draw();
        
        Circle circ = new Circle(5, 10, 7);
        circ.draw();
        circ.moveTo(11, 15);
        circ.draw();
        System.out.println("Volume : "+circ.volume());
        circ.setRadius(9);
        System.out.println("Volume : "+circ.volume());        
	}

}
