package dozortsev.day8;

import java.util.function.Function;

public class JavaFunc {
    public static void main(String[] args) {
        int foo = 12;

        Function<Integer, Integer> sum = a -> a + foo;
        assert sum.apply(12) == 24;

//        foo = 24;
        assert sum.apply(12) == 36;
    }
}
