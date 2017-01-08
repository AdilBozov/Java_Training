package _JavaComparableInterface;

import java.util.*;
import java.io.*;

public class SimpleGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentGeneric> al = new ArrayList<StudentGeneric>();
		al.add(new StudentGeneric(101, "Vijay", 23));
		al.add(new StudentGeneric(106, "Ajay", 27));
		al.add(new StudentGeneric(105, "Jai", 21));
		
		System.out.println("Sorting by Name...");
		
		Collections.sort(al, new NameComparatorGeneric());
		for(StudentGeneric st:al){
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		System.out.println("sorting by Age...");
		
		Collections.sort(al, new AgeComparatorGeneric());
		
		for(StudentGeneric st:al){
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
