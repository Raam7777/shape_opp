package Class1;

import java.util.Comparator;

public class ShapeComparatorByPerimeter implements Comparator<IShape> {

	public int compare(IShape s1, IShape s2){
		if(s1.getPerimeter()>s2.getPerimeter())
			return 1;
		else if(s1.getPerimeter()==s2.getPerimeter())
			return 0;
		else
			return -1;
	}
	
}
