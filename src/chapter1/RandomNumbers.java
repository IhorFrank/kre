package chapter1;

import java.util.Scanner;

public class RandomNumbers {
    public void printRandom(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int ignored : numbers) {
            int number = (int) Math.random() * 2000;
            System.out.println(number);
        }
    }
}

