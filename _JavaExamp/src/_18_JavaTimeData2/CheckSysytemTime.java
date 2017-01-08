package _18_JavaTimeData2;

import java.util.*;
import java.text.DateFormat;

public class CheckSysytemTime implements Runnable{
	
	public void run(){
		
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		String timeOutput;
		
		rightNow = new Date();
		currentLocale = new Locale("en");
		
		timeFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
		timeOutput = timeFormatter.format(rightNow);
		
		System.out.println("Time: " + timeOutput);
		
		
	}

}
