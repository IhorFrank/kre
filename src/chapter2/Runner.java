package chapter2;

import chapter2.varianta.DifferentDigitsNumberPrinter;
import chapter2.varianta.MediumLargeDivider;
import chapter2.varianta.ShortLongNumberPrinter;
import chapter2.variavtb.MountPrinter;
import chapter2.variavtb.MountPrinter2;
import chapter2.variavtb.SquareRootCalculator;

import static chapter2.helper.UserInputScanner.getStringInput;

public class Runner {
    public static void main(String[] args) {
        String[] array = getStringInput();


        //1 Вывести на консоль те числа, длина которых меньше (больше) средней,
        //а также длину.
        MediumLargeDivider mediumLarge = new MediumLargeDivider();
        mediumLarge.printNumber(array);

        //2 Найти самое короткое и самое длинное число. Вывести найденные числа
        //и их длину.

        ShortLongNumberPrinter shortLongNumberPrinter = new ShortLongNumberPrinter();
        shortLongNumberPrinter.printNumber(array);

        //3 Ввести число от 1 до 12. Вывести на консоль название месяца, соответству-
        //ющего данному числу. Осуществить проверку корректности ввода чисел.
        MountPrinter mountPrinter = new MountPrinter();
        mountPrinter.printMount();

        MountPrinter2 mountPrinter2 = new MountPrinter2();
        mountPrinter2.printMount();


        //4 Найти корни квадратного уравнения. Параметры уравнения передавать
        //с командной строкой.

        SquareRootCalculator squareRootCalculator = new SquareRootCalculator();
        squareRootCalculator.printRoots();

        //5Найти число, состоящее только из различных цифр. Если таких чисел не-
        //сколько, найти первое из них.

        DifferentDigitsNumberPrinter differentNumbersPrinter = new DifferentDigitsNumberPrinter();
        differentNumbersPrinter.printNumber(array);

    }


}