package chapter1;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumbersPrinter {
    public void printNumbers(int[] numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (isOdd(number)) oddNumbers.add(number);
            else evenNumbers.add(number);
        }

        System.out.println("Odd numbers: ");
        for (Integer oddNumber : oddNumbers) {
            System.out.print(oddNumber + ", ");
        }

        System.out.println("Even numbers: ");
        for (Integer evenNumber : evenNumbers) {
            System.out.println(evenNumber + ", ");
        }
    }

    private static boolean isOdd(int numbers) {
        return numbers % 2 != 0;
    }
}
