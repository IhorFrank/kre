package chapter2.variavtb;

import java.time.Month;
import java.util.Scanner;

public class MontPrinter2 {
    public void printMount() {
        System.out.println("Enter number mount");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 13) {
            Month month = Month.of(number);
            System.out.println(month);
        } else {
            System.out.println("incorrect number of mount");
        }


    }
}


