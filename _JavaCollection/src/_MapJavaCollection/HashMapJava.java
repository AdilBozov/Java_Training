package _MapJavaCollection;

import java.util.*;

public class HashMapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Amit|");
		hm.put(102, "Vajay");
		hm.put(103, "Rahul");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		HashMap<String, Integer> hmStr = new HashMap<String, Integer>();
		
		hmStr.put("test101", 101);
		hmStr.put("test102", 102);
		hmStr.put("test103", 103);
		hmStr.put("test104", 104);
		hmStr.put("test105", 105);
		
		for(Map.Entry m:hmStr.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
	}

}
