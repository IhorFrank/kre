package chapter1.varianta;

import java.util.Scanner;

public class PasswordChecker {
    private static final String REFERENCE = "Password";

    public void check() {
        System.out.println("Enter your password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if (REFERENCE.equals(password)) System.out.print("Password ok");
        else System.out.print("Password wrong");
    }
}
