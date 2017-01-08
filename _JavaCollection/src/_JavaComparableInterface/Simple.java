package _JavaComparableInterface;

import java.util.*;
import java.io.*;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add(new StudentClass(101, "Vijay", 23));
		al.add(new StudentClass(106, "Ajay", 27));
		al.add(new StudentClass(105, "Jai", 21));
		
		System.out.println("Sorting by Name...");
		
		Collections.sort(al, new NameComperator());
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			StudentClass st = (StudentClass)itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		System.out.println("Sorting by age...");
		
		Collections.sort(al, new AgeCimparator());
		
		Iterator itr2 = al.iterator();
		while(itr2.hasNext()){
			StudentClass st = (StudentClass)itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
