package javaSyntax;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Number = ");
		int firstNum = input.nextInt();
		
		//System.out.println();
		
		
		System.out.print("Second number = ");
		int secondNum = input.nextInt();
		
		int rezult = firstNum * secondNum;
		System.out.println("Rezult rectangle " + rezult);
		

	}

}
