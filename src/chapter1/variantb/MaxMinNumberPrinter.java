package chapter1.variantb;

public class MaxMinNumberPrinter {
    public void printNumber(int[] numbers) {

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }

}



