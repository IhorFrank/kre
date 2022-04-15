package chapter1;

import java.util.Scanner;

public class Revers {
    public void printRevers (){
        System.out.print("Something write :");
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
