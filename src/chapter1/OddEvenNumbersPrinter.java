package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenNumbersPrinter {
    public static void printNumbers() {
        System.out.print("Enter number quantity: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (isOdd(numbers[i])) oddNumbers.add(numbers[i]);
            else evenNumbers.add(numbers[i]);
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
