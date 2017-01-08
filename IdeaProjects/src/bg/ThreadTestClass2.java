package bg;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class ThreadTestClass2 extends Thread {

    @Override
    public void run()   {
        for (int i = 20; i <100 ; i++) {
            System.out.println("Proceess" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
