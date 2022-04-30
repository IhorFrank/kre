package chapter2.varianta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class EvenDigitsNumbersPrinter {
    public void printNumber(String[] input) {
        int count = 0;
        for (String number : input) {
            if (isEvenDigits(number)) count++;
        }
        System.out.println(count);
    }

    private static boolean isEvenDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) % 2) != 0) {
                return false;
            }
        }
        return true;
    }
}

