package javaSyntax;
import java.util.Scanner;

public class ConvertFromBase7ToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base - 7 number -");
		String baseNumber = input.next();
		
		try {
			Integer decimalNumber = Integer.valueOf(baseNumber,7);
			System.out.println(decimalNumber);
		} catch (Exception e) {
			System.out.println("ERRoR");
		}
		
		input.close();

	}

}
