package chapter1.variantb;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class IncreaseReductionNumbers {
    public void numbPrinter(int[] number) {
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        Integer[] IntegerNumber = IntStream.of(number).boxed().toArray(Integer[]::new);
        Arrays.sort(IntegerNumber, Collections.reverseOrder());
        System.out.println(Arrays.toString(IntegerNumber));
    }
}
