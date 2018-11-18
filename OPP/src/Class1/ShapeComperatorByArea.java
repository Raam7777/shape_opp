package Class1;

import java.util.Comparator;

public class ShapeComperatorByArea implements Comparator<IShape> {

	public int compare(IShape s1, IShape s2){
		
		if(s1.getArea()>s2.getArea())
			return 1;
		else if(s1.getArea()==s2.getArea())
			return 0;
		else
			return -1;
		
	}
	
}
