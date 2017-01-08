package _JavaCollection.LinkedList;

import java.util.*;

public class LinkedHashSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> al = new LinkedHashSet<Integer>();
		
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(2);
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		LinkedHashSet<String> alStr = new LinkedHashSet<String>();
		
		alStr.add("Ravi");  
		alStr.add("Vijay");  
		alStr.add("Ravi");  
		alStr.add("Ajay");  
		
		Iterator<String> itrStr = alStr.iterator();
		
		while(itrStr.hasNext()){
			System.out.println(itrStr.next());
		}
	}
}
