package _JavaCollection.LinkedList;

import java.util.*;

public class HashSetCollectionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> al=new HashSet<String>();  
		  al.add("Adil"); 
		  al.add("Cimon");  
		  al.add("Adil");  
		  al.add("Boris");  
		  al.add("Dinko");  
		  al.add("Vijay");  
		  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

	}

