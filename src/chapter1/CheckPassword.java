package chapter1;

import java.util.Scanner;

public class CheckPassword {
    public void chek() {
        System.out.println("Enter your password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        String equals = "Password";
        if (password.equals(equals)) {
            System.out.print("Password ok");
        } else System.out.print("Password wrong");
    }
}
