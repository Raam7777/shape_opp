package Class1;

public class Square implements IShape {

	private double rib;
	
	public Square(){
		this.rib = 0;
	}
	
	public Square(double r){
		this.rib = r;
	}
	
	public Square(Square other){
		this.rib = other.rib;
	}

	public double getPerimeter() {
		return 4*getRib();
	}

	public double getArea() {
		return Math.pow(getRib(), 2);
	}
	
	public double getRib(){
		return rib;
	}
	
	public void setRib(double rib){
		this.rib = rib;
	}
	
	public String toString()
	{
		return "Square Perimeter: " + getPerimeter() + " Square Area: " + getArea();
	}
}
