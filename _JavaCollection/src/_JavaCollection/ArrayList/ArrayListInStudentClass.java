package _JavaCollection.ArrayList;

import java.util.*;

public class ArrayListInStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(102, "Hanumat", 25);
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
