package _ScannerJava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		String[] lines = new String[n];
		
		for (int i = 0; i < n; i++) {
			lines[i] = input.nextLine();
		}
		
		Arrays.sort(lines);
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

	}

}
