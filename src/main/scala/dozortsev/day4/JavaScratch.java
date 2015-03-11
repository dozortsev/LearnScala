package dozortsev.day4;

import java.util.function.Function;

import static java.lang.System.out;

public class JavaScratch {

    static int sum(Function<Integer, Integer> f, int a, int b) {
        return (a > b) ? 0 : f.apply(a) + sum(f, a + 1, b);
    }

    public static void main(String[] args) {
        out.printf("Sum: %s", sum(v -> {
            final int result = v * v; out.println(result); return result;
        }, 2, 5));
    }
}