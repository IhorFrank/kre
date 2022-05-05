package chapter2.variavtb;


import java.io.IOException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MonthPrinter {
    public void printMount() {
        System.out.println("Enter number mount");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNext()) try {
            number = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.print("Incorrect number,");
        } finally {
        }
    }
}
