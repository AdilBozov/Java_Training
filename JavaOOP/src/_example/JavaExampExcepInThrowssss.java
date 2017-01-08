package _example;

import java.io.*;

public class JavaExampExcepInThrowssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			getAFile("./somestuff.txt");
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("An IO Error Occurred");
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("An IO Error Occurred");
			e.printStackTrace();
		}

	}
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException
	{
		FileInputStream file = new FileInputStream(fileName);
	}

}
