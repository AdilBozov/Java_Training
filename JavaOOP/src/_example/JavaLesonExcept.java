package _example;

import java.io.*;

public class JavaLesonExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getAFile("./somestuff.txt");

	}
	
	public static void getAFile(String fileName) {
		try
		{
			FileInputStream file = new FileInputStream(fileName);
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Sorry can't find that file");
		}
		catch (IOException e) 
		{
			System.out.println("Unknown IO Error");
		}
		catch (Exception e)
		{
			System.out.println("Some error occurred");
		}
		finally
		{
			System.out.println("Vinagi se izpylnqva");
		}
		
	}

}
