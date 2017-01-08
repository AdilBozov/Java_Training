package executorservice;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class ThreadTestClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);

        }
    }
}
