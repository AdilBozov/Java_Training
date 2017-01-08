package _DeffiniceArrayListAndVector;

import java.util.*;

public class DeffiniceArrayListAndVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Sonoo");
		al.add("Michael");
		al.add("James");
		al.add("Andy");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		Vector<String> v = new Vector<>();
		
		v.add("umesh");
		v.addElement("Irfan");
		v.addElement("Kumar");
		
		Enumeration e= v.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}

	}

}
