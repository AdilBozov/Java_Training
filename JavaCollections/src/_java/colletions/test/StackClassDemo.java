package _java.colletions.test;

import java.util.*;

public class StackClassDemo {

	public static void main(String[] args) {
	
		TediBear tedi = new TediBear();
		
		Stack stack = new Stack<>();
		
		//insert into stack
		stack.push(1);
		stack.push("Kiro");
		stack.push(tedi);
		
		
		
		//remove from stack with pop
		/*System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());*/
		
		//System.out.println(stack.pop());
		
		/*System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());*/
		
		/*for (Object object : stack) {
			System.out.println(object);
		}*/
		
		

	}

}


class TediBear{
	
	private String tediName;
	
	
	
}
