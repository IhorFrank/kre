package chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        OddEvenNumbersPrinter.printNumbers();


        /*System.out.print("Enter number quantity: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
//Ввести с консоли n целых чисел. На консоль вывести:
//1. Четные и нечетные числа.

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Odd numbers: " + numbers[i]);
            } else {
                System.out.println("Even numbers :" + numbers[i]);
            }
        }

//2. Наибольшее и наименьшее число.
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < size; i++)
            if (max < numbers[i])
                max = numbers[i];
        System.out.println("Max chislo : " + max);


        for (int i = 0; i < size; i++)
            if (min > numbers[i])
                min = numbers[i];
        System.out.println("Min chislo : " + min);


//3. Числа, которые делятся на 3 или на 9.

        for (int i = 0; i < size; i++)
            if (numbers[i] % 3 == 0)
                System.out.println("Kratnue 3 ili 9 :" + numbers[i]);


//4. Числа, которые делятся на 5 и на 7.
        for (int i = 0; i < size; i++)
            if (numbers[i] % 5 == 0 && numbers[i] % 7 == 0)
                System.out.println("Delayatsa na 5 i 7 : " + numbers[i]);

        //5. Элементы, расположенные методом пузырька по убыванию модулей.


        boolean sorted = false;
        int obmen;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    sorted = false;

                    obmen = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = obmen;

                }
            }
        }
        System.out.println("Puzuri :" + Arrays.toString(numbers));*/

    }
}
