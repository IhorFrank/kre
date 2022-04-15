package chapter1;

import java.util.Scanner;

public class Hello {
    public  void printHello() {
        System.out.print("Enter yor name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.nextLine());
    }

}
