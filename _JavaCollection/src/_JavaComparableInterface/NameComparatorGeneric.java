package _JavaComparableInterface;

import java.util.*;

public class NameComparatorGeneric implements Comparator<StudentGeneric>{

	@Override
	public int compare(StudentGeneric s1, StudentGeneric s2) {
		// TODO Auto-generated method stub
		return  s1.name.compareTo(s2.name);
	}

}
