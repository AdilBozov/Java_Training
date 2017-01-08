package _JavaCollection.ArrayList;

import java.util.*;

public class ArrayList_1_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
 
	}

}
