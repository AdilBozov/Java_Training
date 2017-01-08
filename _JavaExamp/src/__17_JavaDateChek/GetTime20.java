package __17_JavaDateChek;

import java.util.*;
import java.text.DateFormat;

public class GetTime20 extends Thread{
	
	public void run(){
		
		Date rightNow;
		Locale currentLocate;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for (int i = 1; i < 20; i++) {
			
			rightNow = new Date();
			currentLocate = new Locale("en");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,currentLocate);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocate);
			
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try{
				Thread.sleep(2000);
			} catch(InterruptedException e){
				
			}
		}
	}

}
