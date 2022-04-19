package chapter1.varianta;

import java.util.Scanner;

public class Greeter {
    public void printHello() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.nextLine());
    }

}
