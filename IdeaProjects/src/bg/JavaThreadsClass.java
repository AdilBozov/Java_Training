package bg;

/**
 * Created by Adil Bozov on 27.10.2016 г..
 */
public class JavaThreadsClass {

        public  static void main(String[] args){
            int numbersOfCores = Runtime.getRuntime().availableProcessors();

            TestThreadClass test = new TestThreadClass();

            Thread t1 = new Thread(test);
            Thread t2 = new Thread(new ThreadTestClass2());
          //  Thread t3 = new Thread(new TestThreadClass());

            t1.start();
            t2.start();
           // t3.start();
            System.out.println(numbersOfCores);
        }
}
