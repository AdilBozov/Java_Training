package _JavaCollection.ArrayList;

import java.util.*;

public class ArrayList_2_For_eachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		for(String obj:al){
			System.out.println(obj);
		}

	}

}
