package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinNumbers {
        public static void printNumber() {
            System.out.print("Enter number quantity: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            System.out.print("Enter numbers: ");

            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            int max = numbers[0];
            int min =numbers[0];

            for (int i = 0; i <size; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }

            }
            System.out.println("Max number: " + max );

            for (int i=0; i<size; i++){
                if (min>numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println("Min number: " + min);

        }

}



