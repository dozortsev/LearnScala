package dozortsev.day22;

import java.util.concurrent.*;

public class Sample {

    static final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<Integer> task1 = threadPool.submit((Callable<Integer>) () -> {
            sleep(3);
            System.out.printf("task 1 done");
            return 3;
        });
        Future<Integer> task2 = threadPool.submit((Callable<Integer>) () -> {
            sleep(1);
            System.out.println("task 2 done");
            return 1;
        });
        System.out.println("The end");
    }

    static void sleep(long timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
