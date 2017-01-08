package java.test2.oopp;

import java.util.Scanner;
import java.util.*;

public class Animalll {
	
	public static final double FAVNUMBER = 1.618;
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userInput = new Scanner(System.in);

	public Animalll() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 * 1 = " + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);
		
		System.out.println("Enter the name : \n");
		
		if (userInput.hasNextLine()) {
			
			this.setName(userInput.nextLine());
			
		}
		
		this.setFavoriteChar();
		this.setUniqueID();
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Uniqe ID set to: " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
		String stringNumber = Long.toString(maxNumber);
		
		int numberString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randimNumber = (int)(Math.random()*126)+1;
		
		this.favoriteChar = (char)randimNumber;
		
		if(randimNumber == 32){
			System.out.println("favorite character set to Space");	
		} else if(randimNumber == 10){
			System.out.println("Favorite character set to Newline");
		} else {
			System.out.println("Favorite character set to" + this.favoriteChar);
		}
		
		if ((randimNumber > 97) && (randimNumber < 122)) {
			System.out.println("Favorite character is a lowercase letter");
		}
		
		if (((randimNumber > 97) && (randimNumber < 122)) || ((randimNumber > 64) && (randimNumber < 91))) {
			System.out.println("Favorite character is a letter");
		}
		
		int whichIsBogger = (50 > randimNumber) ? 50 : randimNumber;
		
		switch (randimNumber) {
		case 8:
			System.out.println("Favorite is character set to back");
			break;
		
		case 10:
		case 11:
		case 12:
			System.out.println("Favorite is character set to back");
			break;

		default:
			System.out.println();
			break;
		}
		
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber){
		
		for (int i = startingNumber; i < 100; i++) {
			if(i == 90) continue;
		}
	}
	
	protected static String printNumbers(int maxNumbers){
		int i = 1;
		
		while (i < (maxNumbers / 2)) {
			System.out.println(i);
			i++;
			
			if(i ==(maxNumbers/2)) break;
		}
		
		Animalll.countTo(maxNumbers/2);
		
		return "End of printNumbers";
	}
	
	protected static void guessMyNumber(){
		int number;
		
		do {
			System.out.println("Guess Number up to 100");
			
			while (!userInput.hasNextLine()) {
				
				String numberEntered = userInput.next();
				System.out.println("%s is not a number\n".equals(numberEntered));
			}
			
			number = userInput.nextInt();
		} while (number != 50);
	}
	
	public String makeSound(){
		return "Grrrr";
	}
	
	public static void speakAnimal(Animalll randAnimal){
		
		System.out.println("Animal says " + randAnimal.makeSound());
		
	}

	public static void main(String[] args) {
		
		Animalll theAnimal = new Animalll();
		
		int[] favoriteNumber = new int[20];
		favoriteNumber[0] = 100;
		
		String[] stringArray = {"Random", "Words", "Here"};
		

}
	}
