package Class1;

public class Main {

	public static void main(String[] args) {
		
		ShapeContainer c = new ShapeContainer();
		c.add(new Circle(2));
		c.add(new Circle(8));
		c.add(new Circle(4));
		c.add(new Square(1));
		c.add(new Square(3));
		
		System.out.println(c);
		
		System.out.println("sortArea");
		c.sortByArea();
		System.out.println(c);
		
		System.out.println("sortPerimeter");
		c.sortByPerimeter();
		System.out.println(c);

	}

}
