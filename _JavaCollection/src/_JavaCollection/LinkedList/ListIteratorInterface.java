package _JavaCollection.LinkedList;

import java.util.*;
public class ListIteratorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al = new LinkedList<String>();
		//ArrayList<String> al = new ArrayList<String>();
		
		al.add("amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1, "Sachin");
		
		for(String obj:al){
			System.out.println(obj);
		}
		
		System.out.println();
	
		System.out.println("Element at 2nd position: " + al.get(2));
		
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("Traversing elements in forward direction.. ");
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing elements in bachward direction: ... ");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		

	}

}
