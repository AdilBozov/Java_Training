package _MapJavaCollection;

import java.util.*;
import org.apache.commons.lang.time.StopWatch;


public class LinkedHashMapJava {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StopWatch sw  = new StopWatch();
		
		System.out.println("getEventFilterTreeDate :: Start Time : " + sw.getTime());
		sw.start();
				
				LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
				
				hm.put(101, "Amit|");
				hm.put(102, "Vajay");
				hm.put(103, "Rahul");
				
				for(Map.Entry m:hm.entrySet()){
					System.out.println(m.getKey()+ " " + m.getValue());
				}
				
				sw.stop();
				System.out.println("getEventFilterTreeDate :: End Time : " + sw.getTime());
				
				sw.reset();
				System.out.println("getEventFilterTreeDate :: Start Time : " + sw.getTime());
				sw.start();
				
				LinkedHashMap<String, Integer> hmStr = new LinkedHashMap<String, Integer>();
				
				hmStr.put("test101", 101);
				hmStr.put("test102", 102);
				hmStr.put("test103", 103);
			
				
				for(Map.Entry m:hmStr.entrySet()){
					System.out.println(m.getKey()+ " " + m.getValue());
				}
				System.out.println("getEventFilterTreeDate :: End Time : " + sw.getTime());
				sw.stop();
				sw.reset();
				System.out.println("getEventFilterTreeDate :: Start Time : " + sw.getTime());
				sw.start();
				TreeMap<Integer,String> hmTree=new TreeMap<Integer,String>();  
				  
				hmTree.put(100,"Amit");  
				hmTree.put(102,"Ravi");  
				hmTree.put(101,"Vijay");  
				hmTree.put(103,"Rahul");  
				  
				  for(Map.Entry m:hmTree.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  }  
				 
				  System.out.println("getEventFilterTreeDate :: End Time : " + sw.getTime());
				sw.stop();
				sw.reset();
				System.out.println("getEventFilterTreeDate :: Start Time : " + sw.getTime());
				sw.start();
				
				Hashtable<Integer,String> hmHm=new Hashtable<Integer,String>();  
				  
				hmHm.put(100,"Amit");  
				hmHm.put(102,"Ravi");  
				hmHm.put(101,"Vijay");  
				hmHm.put(103,"Rahul");  
				  
				  for(Map.Entry m:hmHm.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  }  
				  
				  System.out.println("getEventFilterTreeDate :: End Time : " + sw.getTime());
					sw.stop();
	}
	
}

