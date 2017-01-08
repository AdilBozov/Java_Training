package _JavaCollection.ArrayList;

import java.util.*;

public class ArrayListAddAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		al.addAll(al2);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
