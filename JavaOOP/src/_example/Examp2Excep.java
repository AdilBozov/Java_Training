package _example;

import java.util.*;

public class Examp2Excep {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How old are you? ");
		int age = checkValiAge();
		
		if (age != 0 ) {
			System.out.println("You are " + age + " years old");
		}

	}
	
	public static int checkValiAge(){
		
		try
		{
			return userInput.nextInt();
		}
		catch (InputMismatchException e)
		{
			userInput.nextInt();
			System.out.println("That isn't a whole number");
			return 0;
		}
	}

}
