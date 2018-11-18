package Class1;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeContainer {

	private ArrayList<IShape> shapes;
	private ShapeComperatorByArea cmpByArea = new ShapeComperatorByArea(); 
	private ShapeComparatorByPerimeter cmpByPerimeter = new ShapeComparatorByPerimeter(); 
	
	public ShapeContainer(){
		this.shapes = new ArrayList();
	}
	
	public void add(IShape s){
		shapes.add(s);
	}
	
	public void sortByArea(){
		shapes.sort(cmpByArea);
	}
	
	public void sortByPerimeter(){
		shapes.sort(cmpByPerimeter);
	}
	
	public String toString()
	{
		String ans = "";
		Iterator<IShape> it = shapes.iterator();
		
		while(it.hasNext())
		{
			IShape s = it.next();
			ans += s.toString() + "\n" + "\n";
		}
		
		return ans;
	}
}
