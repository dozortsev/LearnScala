package day1;

import static java.util.stream.IntStream.range;

public class JavaApp {
    public static void main(String[] args) {
        range(1, 10)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
    }
}