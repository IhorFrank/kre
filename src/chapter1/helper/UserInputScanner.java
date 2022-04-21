package chapter1.helper;

import java.util.Scanner;

public class UserInputScanner {
    public static String [] getStringInput() {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] arr = line.split(" ");
        return arr;
    }
}
