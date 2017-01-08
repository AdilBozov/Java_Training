package runnable;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class RunMainCLass {

    public static void main(String [] args){
//        RunnableInJava runClass = new RunnableInJava();
//        RunnableInJava runClass2 = new RunnableInJava();
        RunnableInJava [] testArr = new RunnableInJava[10];

        for (int i = 0; i < 10; i++) {
            testArr[i] = new RunnableInJava();
        }

        Thread t2;
        for (int i = 0; i <10 ; i++) {
            t2 = new Thread(testArr[i]);
            t2.start();

        }


    }
}
