package chapter2.variavtb;

import java.util.Scanner;

public class SquareRootCalculator {
    public void printRoots() {
        Scanner scanner = new Scanner(System.in);
        // ax2 + bx + c = 0
        // determinant = b*b − 4*a*c
        // x = (-b + (-) √determinant)/2a
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double root, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant == 0) {
            root = -b / (2 * a);
            System.out.println(root);
        } else if (determinant > 0) {
            root = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println(root + " " + root2);
        } else {
            System.out.println("no roots");
        }
    }
}