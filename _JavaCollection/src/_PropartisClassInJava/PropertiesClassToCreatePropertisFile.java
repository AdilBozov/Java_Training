package _PropartisClassInJava;

import java.util.*;
import java.io.*;

public class PropertiesClassToCreatePropertisFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		p.setProperty("name", "Sonoo Jaiswal");
		p.setProperty("email", "sonoojaiswal@javatoping.com");
		
		p.store(new FileWriter("info.properties"), "Javatoping Properties Example");

	}

}
