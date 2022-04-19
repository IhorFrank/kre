package chapter1.variantb;

import java.util.ArrayList;
import java.util.List;

public class NumbersDivisionPrinter {
    public void printNumber(int[] numbers) {

        List<Integer> is3or9 = new ArrayList<>();
        List<Integer> is5and7 = new ArrayList<>();
        for (int number : numbers) {
            if (isDivision3(number)) is3or9.add(number);
        }
        System.out.print("NumbersDivision 3 or 9: ");
        for (Integer Multi3 : is3or9) {
            System.out.print(Multi3 + " ");
        }
        System.out.println();

        for (int number : numbers) {
            if (isDivision5and7(number)) is5and7.add(number);
        }
        System.out.print("NumbersDivision 5 & 7: ");
        for (Integer Division5and7 : is5and7) {
            System.out.print(Division5and7 + " ");
        }
        System.out.println();


    }

    private static boolean isDivision3(int numbers) {
        return numbers % 3 == 0;
    }

    private static boolean isDivision5and7(int numbers) {
        return numbers % 5 == 0 && numbers % 7 == 0;
    }

}
