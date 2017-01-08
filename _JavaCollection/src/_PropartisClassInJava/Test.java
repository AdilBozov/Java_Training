package _PropartisClassInJava;

import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader("src/_PropartisClassInJava/db.properties");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		

	}

}
