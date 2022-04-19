package chapter1.varianta;

import java.util.Arrays;

public class SumAndMultiArgsPrinter {
    public void printNumbers(String[] args) {
        int[] number = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            number[i] = Integer.parseInt(args[i]);
        }
        System.out.println();
        System.out.println("Sum : " + Arrays.stream(number).sum());
        System.out.println("Multi: " + Arrays.stream(number).reduce(1, (a, b) -> a * b));
    }


}

