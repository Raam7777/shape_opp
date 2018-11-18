
package Class1;

public class Circle implements IShape {

	private double radius;

	public Circle(){
		this.radius = 0;
	}

	public Circle(double r){
		this.radius = r;
	}

	public Circle(Circle other){
		this.radius = other.radius;
	}

	public double getPerimeter(){
		double pi = Math.PI;
		return 2*pi*getRadius();
	}

	public double getArea(){
		double pi = Math.PI;
		return pi*Math.pow(getRadius(),2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString()
	{
		return "Circle Perimeter: " + getPerimeter() + " Circle Area: " + getArea();
	}

}


