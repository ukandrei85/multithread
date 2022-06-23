import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        divisorsWithSingleThreads();
        divisorsWithMultipleThreads();
    }

    public static void divisorsWithSingleThreads() {
        MyThread myThread = new MyThread(1);
        myThread.start();
    }

    public static void divisorsWithMultipleThreads() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 2; i < 12; i++) {
            MyThread myThread = new MyThread(i);
            es.submit(myThread);
        }
        es.shutdown();
    }
}
