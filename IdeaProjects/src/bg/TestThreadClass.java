package bg;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class TestThreadClass extends Thread{

    @Override
    public void run()   {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Proceess" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }



}
