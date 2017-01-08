package _SortingInCallectionJava;

import java.util.*;

public class SortingCallectionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");
		
		Collections.sort(al);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		ArrayList al2 = new ArrayList();
		
		al2.add(Integer.valueOf(201));
		al2.add(Integer.valueOf(101));
		al2.add(Integer.valueOf(230));
		al2.add(150);
		
		Collections.sort(al2);
		
		Iterator itr2 = al2.iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
				

	}

}
