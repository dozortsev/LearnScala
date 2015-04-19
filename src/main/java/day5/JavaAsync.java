package day5;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JavaAsync {

    private final static ExecutorService executor = Executors.newFixedThreadPool(5);

    public static Future<Boolean> matches(String target, String pattern) {
        long id = Thread.currentThread().getId();
        System.out.println("Thread id: " + id);

        return executor.submit(() -> target.matches(pattern));
    }

    public static void main(String[] args) throws Exception {
        String regex = "moo";
        System.out.println("Matches: " + matches("foo bar moo baz", regex).get());
    }
}