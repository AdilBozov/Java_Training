package _JavaExamp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class _11JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Adil Bozow"); // add in list
		names.add("Tcvetan Ivano");
		names.add("Bambi Ivcho");
		
		names.add(2, "Spas s pejoto vmykva imeto na vuyvedenata poziciq"); // insert to 2 position
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.set(0, "Podmenq imeto na vyvedenata poziciq");
		
		
		System.out.println();
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(3);// premahva poziciqta
		
		System.out.println();
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//names.removeRange(0, 1);
		System.out.println();
		
		System.out.println(names);
		
		System.out.println();
		
		for(String  i : names){
			System.out.println(i);
		}
		
		System.out.println();
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext()){
			System.out.println(indivItems.next());
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paulYoung = "Paul toung";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung)){
			System.out.println("contains - proverqva dali se sydyrja v lista tyrsenata duma vryshta booland");
		}
		
		if(names.containsAll(nameCopy)){
			System.out.println("proverqva dali se sydyrja edin kopisran list v drug");
		}
		
		names.clear();
		
		if(names.isEmpty()){
			System.out.println("ArrayList in empty");
		}
		
		Object[] moreName = new Object[4];
		
		moreName = nameCopy.toArray();
		
		System.out.println();
		System.out.println(Arrays.toString(moreName));
		
		
		
		
		
		
		
		
	}

}
