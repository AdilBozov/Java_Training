package __17_JavaDateChek;

public class _17_JavaDateTimeLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread getTime = new GetTime20();
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain =new GetTheMail(20);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();

	}

}
