package chapter3.variantb.task1;

//Реализовать методы сложения, вычитания, умножения и деления объектов (для
//тех классов, объекты которых могут поддерживать арифметические действия).
//1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//Объявить и инициализировать массив из k дробей, ввести/вывести значе-
//ния для массива дробей. Создать массив/список/множество объектов и пе-
//редать его в метод, который изменяет каждый элемент массива с четным
//индексом путем добавления следующего за ним элемента.
public class RationalFraction {
    private final int numerator;
    private final int denominator;

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Denominator can't be 0");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalFraction add(RationalFraction that) {
        int numerator = this.getNumerator() * that.getDenominator() + this.getDenominator() * that.getNumerator();
        int denominator = this.getDenominator() * that.getDenominator();
        return createSimplified(numerator, denominator);
    }

    public RationalFraction subtract(RationalFraction that) {
        int numerator = this.getNumerator() * that.getDenominator() - this.getDenominator() * that.getNumerator();
        int denominator = this.getDenominator() * that.getDenominator();
        return createSimplified(numerator, denominator);
    }

    public RationalFraction multiply(RationalFraction that) {
        int numerator = this.getNumerator() * that.getNumerator();
        int denominator = this.getDenominator() * that.getDenominator();
        return createSimplified(numerator, denominator);
    }

    public RationalFraction divide(RationalFraction that) {
        int numerator = this.getNumerator() * that.getDenominator();
        int denominator = this.getDenominator() * that.getNumerator();
        return createSimplified(numerator, denominator);
    }

    public static RationalFraction createSimplified(int numerator, int denominator) {
        int gcd = findGcd(numerator, denominator);
        if (gcd < 1) return new RationalFraction(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        return new RationalFraction(numerator, denominator);
    }

    private static int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
