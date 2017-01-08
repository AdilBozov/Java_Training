package _example;

// java.lang.RunTimeException
// java.lang.Exception

public class ExampExceptionwww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		divideByZero(2);

	}
	
	public static void divideByZero(int a){
		
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		/* ArithmeticException
		 * ClassNotFounException
		 * IllegalArgumentException
		 * IndexOutOfBoudsExceptions
		 * InputMismatchException
		 * IOException
		 */
		{
			System.out.println("You can't do that");
			System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
