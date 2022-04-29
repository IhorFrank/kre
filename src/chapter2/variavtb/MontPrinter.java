package chapter2.variavtb;


import java.io.IOException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MontPrinter {
    public void printMount() {
        System.out.println("Enter number mount");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNext()) try {
            number = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.print("Incorrect number,");
        } finally {
            if (number > 0 && number < 13) {
                switch (number) {
                    case 1 -> {
                        System.out.println("January");
                    }
                    case 2 -> {
                        System.out.println("February");
                    }
                    case 3 -> {
                        System.out.println("March");
                    }
                    case 4 -> {
                        System.out.println("April");
                    }
                    case 5 -> {
                        System.out.println("May");
                    }
                    case 6 -> {
                        System.out.println("June");
                    }
                    case 7 -> {
                        System.out.println("July");
                    }
                    case 8 -> {
                        System.out.println("August");
                    }
                    case 9 -> {
                        System.out.println("September");
                    }
                    case 10 -> {
                        System.out.println("October");
                    }
                    case 11 -> {
                        System.out.println("November");
                    }
                    case 12 -> {
                        System.out.println("December");
                    }
                }
            } else {
                System.out.println("such a month does not exist");
            }
        }
    }
}
