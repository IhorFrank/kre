package chapter1.varianta;

import java.util.Scanner;

public class ReverseArgsPrinter {
    public void printRevers(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Reverse : " + args[i]);
        }

    }
}
