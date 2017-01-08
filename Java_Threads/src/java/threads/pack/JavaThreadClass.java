package java.threads.pack;

public class JavaThreadClass {
	public  static void main(String[] args){
		int numbersOfCores = Runtime.getRuntime().availableProcessors();
		
		System.out.println(numbersOfCores);
	}
}
