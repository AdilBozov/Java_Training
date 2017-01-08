package javaSyntax;
import java.util.Scanner;


public class ConvertFromDecimalSystemToBase_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter decimal number - ");
		
		int number = input.nextInt();
		
		System.out.println(Integer.toString(number, 7));
	
		
		/*
		int decimalNum = input.nextInt();
		int number = -1;
		int n = 0;
		int m = 6;
		int i = 0;
		boolean bool = true;
		
				
		while (bool) {
			for (i = n; i <= m; i++) {
				number ++;
				if (decimalNum == number) {
					System.out.println(decimalNum + " - " + i);
					bool = false;
				}
			}
			i = i + 3;
			n = i;
			m = m + 10;
		}
		*/
		input.close();
	}

}
