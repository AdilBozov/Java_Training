package _JavaComparableInterface;

import java.util.*;
import java.io.*;

public class TestSortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101, "Vajay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		
		Collections.sort(al);
		
		for(Student st:al){
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
