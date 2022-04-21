package chapter2.variana;

import java.util.Scanner;

public class MediumLargeDivider {
    public  void printNumber (String [] array) {

        int medium = 0;
        for (String number : array) {
            medium += number.length();
        }
        if (array.length > 0) {
            medium /= array.length;
        }
        for (String number : array) {
            if (number.length() > medium) {
                System.out.println( "Max : " + number + " quantity charset : " + number.length());
            }
            if (number.length() < medium) {
                System.out.println("Min : " + number + " quantity charset : " + number.length());
            }
        }
    }
}