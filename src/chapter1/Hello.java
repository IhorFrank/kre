package chapter1;

import java.util.Scanner;

public class Hello {
    public  void printHello() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.nextLine());
    }

}
