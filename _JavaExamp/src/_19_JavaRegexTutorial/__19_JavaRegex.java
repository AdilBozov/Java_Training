package _19_JavaRegexTutorial;

import java.util.regex.*;

public class __19_JavaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String longString = "Adil Bozov CA AK AR AZ CT iiii AO iiiiii AT 12345 PA (412)555-1212 adilbozov@hotmail.com 412-555-1234 412 555-1234";
		String strangeString = "1Z aaa **** *** {{{ {{ {";
			
		
		// [a-z] - vsichki malki bukvi ot a dp z
			// [A-Z] - vsichki golemi bukvi ot A do Z
			// [A-Za-z] - vsichki malki i golemi bukvi ot a do z
			/*
			 * [0-9] - vsichki cisla ot 0 do 9
			 * [^A-G] - DA NE hvashta bukvite glavnite bukvi v intervala ot A do G
			 * \\s - hvashta prazno mqsto space
			 * \\S - hvashta vsichko bez praznotot mqsto
			 * [0-9]{n} - kydravite skobi pokazvt po kolko simvola da hvashta
			 * [0-9]{n,m} - kyrdavite skobi kazvat po kolko simvola da hvashta primerno mejdi {4,8}
			 * 
			 * PRIMER:[A-Za-z]{2,20} ili  Word that is 2 to 20 characters in length
			 * \w{2,20} - hvashta vsichki bukvi i chisla bez specialni
			 * \W{2,20} - Hvashta vsichko BEZ bukvi i chisla
			 * \d - hvashta vsichki chisla
			 * \D - ne hvashta samo chislata
			 */
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		regexChecker("\\s\\d{5}\\s", longString);
		
		/*
		 * 2 characters that start with a C or A
		 * A[KLRZ]|C[AOT] - tyrsi se mombinaciq ot bukvite A sys slojenite v skobi do neq po podobie e i s C
		 */
		
		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		/*
		 * {1.}-oznachava che trysim neshto povtarqshto se edin ili poveche piti
		 * + - oznachava nameri edin ili poveche pyti ako e povtarq
		 * . ^ * + ? {} [] () \ |
		 * 
		 * \. - namira vsichko chisla bukvi i simvoli i znaci
		 * \* - namira vischki v grupa(hvashta cqla duma dokato + hvashta sledvashtata bukva)
		 * \? - moje da go ima moje i da go nqma
		 */
		
		regexChecker("(\\{{1,})", strangeString);
		regexChecker("(\\{+)", strangeString);
		regexChecker(".{3}", strangeString);
		regexChecker("\\w*", strangeString);
		
		/*
		 * adilbozov@hotmail.com
		 */
		
		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
		
		/*
		 * 1-(412)555-1212 412-555-1234 412 555-1234
		 */
		
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})(|-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
		regexReplace(longString);

	}
	
	public static void regexChecker(String theRegex, String str2Check){
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		System.out.println(regexMatcher);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
	
	public static void regexReplace(String str2Replace){
		Pattern replace = Pattern.compile("\\s");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		System.out.println(regexMatcher.replaceAll(", "));
		
	}

}
