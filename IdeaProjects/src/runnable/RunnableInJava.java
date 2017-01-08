package runnable;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class RunnableInJava implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            dumy();
        }
    }


    public  void dumy(){
        System.out.println("oapskdf");
    }


    public  void dumy2(){
        System.out.println("oapskdf");
    }
}
