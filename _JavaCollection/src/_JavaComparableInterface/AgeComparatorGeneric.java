package _JavaComparableInterface;

import java.util.*;

public class AgeComparatorGeneric implements Comparator<StudentGeneric>{

	@Override
	public int compare(StudentGeneric s1, StudentGeneric s2) {
		// TODO Auto-generated method stub
		if(s1.age == s2.age){
			return 0;
		}else if(s1.age > s2.age){
			return 1;
		}else{
		return -1;
		}
	}

}
