package _JavaExamp;

import java.util.Arrays;
import java.util.LinkedList;


public class _12JavaLinkeddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Adil Bozov");
		names.add("Ivailo Ivanov");
		
		names.addFirst("aaaaaaaaaaa");
		names.addLast("bbbbbbbbbbbbb");
		
		names.add(2, "cccccccccccc");
		
		
		for(String i : names){
			System.out.println(i);
		}
		
		names.set(2, "mmmmmmmmmm");
		
		System.out.println();
		
		for(String i : names){
			System.out.println(i);
		}
		
		names.remove(4);
		names.remove("Adil Bozov");
		
		System.out.println();
		
		for(String i : names){
			System.out.println(i);
		}
		
		System.out.println("\nFirst Index: " + names.get(0));
		System.out.println("\nLast Index: " + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println();
		System.out.println("\nnameCopy: " + nameCopy);
		
		
		System.out.println();
		if(names.contains("Ivailo Ivanov")){
			System.out.println("\nIvaili is here");
		}
		
		if(names.containsAll(nameCopy)){
			System.out.println("\nCollection the Some");
			
		}
		
		System.out.println("\nFirst Infex: " + names.indexOf("Ivailo Ivanov"));
		
		System.out.println("\nList Empty: " + names.isEmpty());
		
		System.out.println("\nHow Many: " + names.size());
		System.out.println("\nLook without Error: " + names.peek());
		System.out.println("\nremove first element " + names.poll());
		System.out.println("\nremove first element " + names.pollLast());
		
		System.out.println();
		System.out.println();
		
		
		nameCopy.push("Adil Bozov");
		nameCopy.push("Adil Bozov");
		nameCopy.push("Adil Bozov");
		
		
		
		for(String name : nameCopy){
			System.out.println(name);
		}
		
		
		System.out.println();
		nameCopy.pop();
		
		for(String name : nameCopy){
			System.out.println(name);
		}
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println();
		System.out.println(Arrays.toString(nameArray));
		
		names.clear();

	}

}
