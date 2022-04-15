package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNumbers {
    public void printRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value random numbers: ");
        int size = scanner.nextInt();
        for (int i=0; i<size; i++) {
            int number = (int) (Math.random() * 2000);
            System.out.print(number + " ");
        }
    }


}

