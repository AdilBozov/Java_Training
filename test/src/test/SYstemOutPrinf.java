package test;

public class SYstemOutPrinf implements Runnable{

	
	public static void main(String[] args){
		Theread1 th = new Theread1();
		Thread thread = new Thread(th);
		thread.start();
		
		
	}

	@Override
	public void run() {
		Theread1.test();
		System.out.println("asdfasdf");
		
		
	}
	
	
	
	
}



 class Theread1 extends Thread{
	
	public static void test(){
		System.out.println("Print Another Threnad");
	}
	}
	