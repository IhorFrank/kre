package chapter1.variantb;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IncreaseReductionNumbers {
    public void numbPrinter(int[] number) {
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        Integer[] IntegerNumber = IntStream.of(number).boxed().toArray(Integer[]::new);
        Arrays.sort(IntegerNumber, Collections.reverseOrder());
        System.out.println(Arrays.toString(IntegerNumber));

        /*List<Integer> inputList = IntStream.of(number).boxed().collect(Collectors.toList());
        Collections.sort(inputList);
        inputList.forEach(System.out::println);
        inputList.sort(Comparator.reverseOrder());
        inputList.forEach(System.out::println);*/
    }
}
