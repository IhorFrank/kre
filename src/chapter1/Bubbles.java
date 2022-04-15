package chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubbles {
    public void printNumber(int[] numbers) {
        boolean isShort = false;
        int buf;
        while (!isShort) {
            isShort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    isShort = false;
                    buf = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = buf;
                }
            }

        }
        System.out.println("Bubbles :" + Arrays.toString(numbers));
    }
}