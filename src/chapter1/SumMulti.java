package chapter1;

import java.util.Arrays;

public class SumMulti {
    public void printNumbers(int[] number) {
        System.out.println();
        System.out.println("Sum : " + Arrays.stream(number).sum());
        System.out.println("Multi: "+ Arrays.stream(number).reduce(1, (a, b) -> a * b));
    }


}

