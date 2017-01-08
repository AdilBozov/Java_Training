package _JavaComparableInterface;

import java.util.*;

public class AgeCimparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentClass s1 =(StudentClass)o1;
		StudentClass s2 =(StudentClass)o2;
		
		if(s1.age == s2.age){
			return 0;
		}else if (s1.age > s2.age){
			return 1;
		}else{
			return -1;
		}
		
	}

}
