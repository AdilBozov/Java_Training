package executorservice;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class ThreadPoolMain {

    public  static void main(String [] args){

        Integer i = 12;
        int l = 12;
       System.out.println(i.equals(l));


        String p = "a";
        String c = "b";

        System.out.println(p==c);
        System.out.println(Byte.MAX_VALUE);

        byte num = 127;


/*
        Runnable run = new RunnableInJava();
        ThreadTestClass[] test = new ThreadTestClass[10];
        ExecutorService executor = Executors.newFixedThreadPool(1);

        for (int i = 0; i <10 ; i++) {
            executor.execute(test[i]);
           // executor.submit(new ThreadTestClass());
        }
        executor.shutdown();*/
    }
}
