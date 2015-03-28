package day5;

import java.util.Arrays;

public class JavaAsync {
    public static void main(String[] args) throws Exception {
        final int sleepPriority = 0;
        final int eatPriority = 1;
        final int recreationPriority = 2;

        int[] priorities = { sleepPriority, eatPriority, recreationPriority };
        Arrays.sort(priorities);
        for (int i = priorities.length - 1; 0 <= i; i--) {
            switch (priorities[i]) {
                case sleepPriority:
                    sleep();
                    break;
                case eatPriority:
                    eat();
                    break;
                case recreationPriority:
                    watchTv();
                    break;
            }
        }
    }

    private static void watchTv() {
        System.out.println("watch tv");
    }

    private static void eat() {
        System.out.println("eat");
    }

    private static void sleep() {
        System.out.println("sleep");
    }
}