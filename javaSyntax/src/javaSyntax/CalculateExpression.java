package javaSyntax;
import java.util.Scanner;

public class CalculateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("a = ");
		float a = input.nextFloat();
		
		System.out.print("b = ");
		float b = input.nextFloat();
		
		System.out.print("c = ");
		float c = input.nextFloat();
		
		double rezult1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2))/(Math.pow(a, 2) - Math.pow(b, 2)),(a + b + c) / Math.sqrt(c));
		
		
		double rezult2 = Math.pow(Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2), a-b);
		
		System.out.format("%.2f%n", rezult1);
		
		System.out.format("%.2f", rezult2);
		
		input.close();

	}

}
