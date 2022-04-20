package chapter1.variantb;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberChecker {
    public void printNumbers(int[] numbers) {
        List<Integer> simpleNumber = new ArrayList<>();
        for (int number : numbers) {
            if (isSimple(number)) simpleNumber.add(number);
        }

        System.out.print("Simple numbers : ");
        for (Integer simple : simpleNumber) {
            System.out.print(simple + " ");
        }
    }

    private static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; number > i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

