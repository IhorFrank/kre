package chapter1;

import java.util.Arrays;

import static chapter1.helper.UserInputReader.getIntUserInput;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = getIntUserInput();

        //1. Четные и нечетные числа.
        OddEvenNumbersPrinter oddEvenNumbersPrinter = new OddEvenNumbersPrinter();
        oddEvenNumbersPrinter.printNumbers(numbers);

        //2. Наибольшее и наименьшее число.
        MaxMinNumberPrinter maxMinNumberPrinter = new MaxMinNumberPrinter();
        maxMinNumberPrinter.printNumber(numbers);

        //3. Числа, которые делятся на 3 или на 9.
        //4. Числа, которые делятся на 5 и на 7.
        NumbersMultiples numbersMultiples = new NumbersMultiples();
        numbersMultiples.printNumber(numbers);

        //5. Элементы, расположенные методом пузырька по убыванию модулей.
        Bubbles bubbles = new Bubbles();
        bubbles.printNumber(numbers);



        /*System.out.print("Enter number quantity: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

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
