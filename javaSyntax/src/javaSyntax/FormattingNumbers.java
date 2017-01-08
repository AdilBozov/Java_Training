package javaSyntax;
import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = input.nextInt();
		
		System.out.print("b = ");
		float b = input.nextFloat();
		
		System.out.print("c = ");
		float c = input.nextFloat();
		
		// ima znachenie dali vyvejdash za desetichna zapetaq simvol (,) ili (.) za desetichna zapetaq priema (,)
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		//System.out.println(Integer.toBinaryString(a));
		//System.out.println(Integer.toHexString(a));
		String m = (String)Integer.toHexString(a).toUpperCase();
		String n = Integer.toBinaryString(a);
		int g = Integer.parseInt(n);
		
		System.out.print("|");
		
		//System.out.format("%-10d%n", a);
		System.out.format("%-10s", m);
		
		System.out.print("|");
		
		//System.out.format("%010d%n", a);
		System.out.format("%010d", g);
		
		System.out.print("|");
		System.out.format("%10.2f", b);
		System.out.print("|");
		System.out.format("%-10.3f", c);
		System.out.print("|");
		
		input.close();

	}

}
