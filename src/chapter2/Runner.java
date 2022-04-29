package chapter2;

import chapter2.varianta.EvenNumbersPrinter;
import chapter2.varianta.IncreasingNumberLenghtPrinter;


import static chapter2.helper.UserInputScanner.getStringInput;

public class Runner {
    public static void main(String[] args) {
        String[] array = getStringInput();


//        //1 Вывести на консоль те числа, длина которых меньше (больше) средней,
//        //а также длину.
//        MediumLargeDivider mediumLarge = new MediumLargeDivider();
//        mediumLarge.printNumber(array);
//
//        //2 Найти самое короткое и самое длинное число. Вывести найденные числа
//        //и их длину.
//
//        ShortLongNumberPrinter shortLongNumberPrinter = new ShortLongNumberPrinter();
//        shortLongNumberPrinter.printNumber(array);
//
//        //3 Ввести число от 1 до 12. Вывести на консоль название месяца, соответству-
//        //ющего данному числу. Осуществить проверку корректности ввода чисел.
//        MountPrinter mountPrinter = new MountPrinter();
//        mountPrinter.printMount();
//
//        MountPrinter2 mountPrinter2 = new MountPrinter2();
//        mountPrinter2.printMount();
//
//
//        //4 Найти корни квадратного уравнения. Параметры уравнения передавать
//        //с командной строкой.
//
//        SquareRootCalculator squareRootCalculator = new SquareRootCalculator();
//        squareRootCalculator.printRoots();
//
//        //5Найти число, состоящее только из различных цифр. Если таких чисел не-
//        //сколько, найти первое из них.
//
//        DifferentDigitsNumberPrinter differentNumbersPrinter = new DifferentDigitsNumberPrinter();
//        differentNumbersPrinter.printNumber(array);
//
//
//        //6.Найти число, цифры в котором идут в строгом порядке возрастания. Если
//        //таких чисел несколько, найти первое из них.
//
//        DifferentDigitsNumberPrinter2 differentDigitsNumberPrinter = new DifferentDigitsNumberPrinter2();
//        differentDigitsNumberPrinter.printNumber(array);

//        //7. //Упорядочить и вывести числа в порядке возрастания (убывания) значений
//        //их длины.
//        IncreasingNumberLenghtPrinter increasingNumberLenghtPrinter = new IncreasingNumberLenghtPrinter();
//        increasingNumberLenghtPrinter.printNumber(array);

        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        evenNumbersPrinter.printNumber(array);

    }


}