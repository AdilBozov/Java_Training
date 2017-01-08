package com.java.oop;


/***
 * 
 * @author Adil Bozov
 *
 There are many OOP (Object Oriented Programing) languages  - C++, C#, Java 
 In oop languages there are four main principles:
  
 1. Capsulation
 2. Abstraction - klas koito ima pone edin abstrakten metod
 3. Inheritance - nasledqvane
 4. Polymorphism - kogato edin klas se nasledi ot dva ili poveche ot edin clas
 
 */


public class JavaOOPPrinciples {
	
	//Class  - class is something like  pattern(shablon), you can use pattern to create new object; main idea of class is to safe
	// some rewrite of code
	//Class can contains - methods. properties, fields;
	
	//1. Capsulation - Encapsulation
	
	// Each Class has something called fields
	
	//private, protected, public
	// private - are only for this class; 
	//protected - are for all classes include in the package (example com.java.oop)
	//public - all classes can access this variables or methods....
	
	
	
	
	public static  void createCar(){
		
		
		Car mycar = new Car();
		mycar.myProtectedVariable = "test";
		mycar.myPublicVarialbe = "Test2";
		
		Car tsvetanCar = new Car();
		
		String [] colours = {"Black, Yellow, Blue, Red"}; 
		
		mycar.setWindows(colours);
	
		String [] test = mycar.getWindows();
		for (int i = 0; i < colours.length; i++) {
			
			System.out.println(test[i]);
			
				
		}
		
		
		
	
		
		//System.out.println("This is tsvetan car window:" + tsvetanCar.getWindows());
	}
	
	public static void main(String[] args){
		createCar();
	}

}
