package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNumbers {
    void random(int number) {
        System.out.print("Random numbers: ");
        for (int i = 0; i < number; i++) {
            int a = (int) (Math.random() * 2000);
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

