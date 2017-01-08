package _JavaComparableInterface;

import java.util.*;

public class NameComperator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		StudentClass s1 =(StudentClass)o1;
		StudentClass s2 =(StudentClass)o2;
		
		return(s1.name.compareTo(s2.name));
	}

}
