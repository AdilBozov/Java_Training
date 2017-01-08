package _PropartisClassInJava;

import java.util.*;	
import java.io.*;

public class SysemPropertyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties p = System.getProperties();
		Set set = p.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}

	}

}
