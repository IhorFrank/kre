package chapter1;

import java.util.ArrayList;
import java.util.List;

public class NumbersMultiples {
    public void printNumber(int[] numbers) {

        List<Integer> is3or9 = new ArrayList<>();
        List<Integer> is5and7 = new ArrayList<>();
        for (int number : numbers) {
            if (isMulti3(number)) is3or9.add(number);
        }
        System.out.print("NumbersMultiples 3 or 9: ");
        for (Integer Multi3 : is3or9) {
            System.out.print(Multi3 + " ");
        }
        System.out.println();

        for (int number : numbers) {
            if (isMulti5(number)) is5and7.add(number);
        }
        System.out.print("NumbersMultiples 5 & 7: ");
        for (Integer Multi5and7 : is5and7) {
            System.out.print(Multi5and7 + " ");
        }
        System.out.println();


    }

    private static boolean isMulti3(int numbers) {
        return numbers % 3 == 0;
    }

    private static boolean isMulti5(int numbers) {
        return numbers % 5 == 0 && numbers % 7 == 0;
    }

}
