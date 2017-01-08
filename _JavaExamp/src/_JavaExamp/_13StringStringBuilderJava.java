package _JavaExamp;
import java.util.Arrays;

public class _13StringStringBuilderJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String RandomString = "I'm just a random string";
		
		String gotQuote = "He said, \"I'm here\"";
		
		int numTwo = 2;
		
		// \n   \b  \'' \\ - eskeipvane
		
		System.out.println(RandomString + " " + gotQuote);
		System.out.println(RandomString + " " + numTwo);
		
		//You convert primitive types to a string with toString
		/*
		 * String byteStirnag = Byte.toString(bigByte);
		 * String intStirnag = Inateger.toString(bigByte);
		 * 
		 * You convert from String to primitives whit parse
		 * 
		 * int stringToInt = Integer.parseInt(intSring);
		 * 
		 */
		
		String upprcaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(upprcaseStr.equalsIgnoreCase(lowercaseStr)){
			System.out.println("They're equal");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		System.out.println(letters.compareTo(moreLetters));
		
		System.out.println(letters.contains("abc"));
		System.out.println(letters.endsWith("de"));
		System.out.println(letters.indexOf("cd"));
		
		/*
		 * You can also specific the index to start searching from
		 * indexOf(StringToLookFor, IndexStartPosition
		 * 
		 * lastIndexOf() works like indexOf except it starts from the
		 * end of the String you are searching
		 */
		
		System.out.println("Lenght" + letters.length());
		System.out.println(letters.replace("abc", "xy"));
		
		
		
	}

}
