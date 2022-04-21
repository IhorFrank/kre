package chapter2;

import chapter2.varianta.MediumLargeDivider;
import chapter2.varianta.ShortLongNumberSeeker;

import static chapter2.helper.UserInputScanner.getStringInput;

public class Runner {
    public static void main(String[] args) {
        String[] array = getStringInput();


        //1 Найти самое короткое и самое длинное число. Вывести найденные числа
        //и их длину.
        MediumLargeDivider mediumLarge = new MediumLargeDivider();
        mediumLarge.printNumber(array);

        //2 Вывести на консоль те числа, длина которых меньше (больше) средней,
        //а также длину.

        ShortLongNumberSeeker shortLongNumberSeeker = new ShortLongNumberSeeker();
        shortLongNumberSeeker.printNumber(array);
    }
}