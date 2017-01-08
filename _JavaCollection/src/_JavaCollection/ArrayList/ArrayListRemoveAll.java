package _JavaCollection.ArrayList;

import java.util.*;

public class ArrayListRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Ravi");
		al2.add("Hanumat");
		
		al.removeAll(al2);
		
		System.out.println("iterating the elements after removing the elements of al2...");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
