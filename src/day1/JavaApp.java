package day1;

import util.Systems;

import static java.util.stream.IntStream.iterate;
import static java.util.stream.IntStream.range;
import static util.Systems.println;

public class JavaApp {
    public static void main(String[] args) {
        range(1, 10)
                .filter(el -> el % 2 == 0)
                .forEach(Systems::println);

        println(range(1, 10).filter(el -> el % 2 == 1).sum());
        println(iterate(1, i -> i + 2).limit(5).sum());
    }
}