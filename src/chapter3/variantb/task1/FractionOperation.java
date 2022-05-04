package chapter3.variantb.task1;

import java.util.Arrays;
import java.util.List;

public class FractionOperation {
    private static boolean checkDenominator(Fraction a) {
        boolean denominator;
        denominator = a.getN() != 0;
        return denominator;

    }

    public static int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }


    public void fractionSum(Fraction a, Fraction b) {
        Fraction c;
        if (checkDenominator(a) && checkDenominator(b)) {
            int numerator;
            int denominator;
            if (a.getN() == b.getN()) {
                numerator = (a.getM() + b.getM());
                denominator = a.getN();
            } else {
                numerator = (a.getM()) * b.getN() + (a.getN() * b.getM());
                denominator = (a.getN() * b.getN());
            }
            if (findGcd(numerator, denominator) > 1) {
                int gcd = findGcd(numerator, denominator);
                numerator = numerator / gcd;
                denominator = denominator / gcd;
            }
            c = new Fraction(numerator, denominator);
            System.out.println(c);

        }

    }

    public void fractionMinus(Fraction a, Fraction b) {
        Fraction c;
        if (checkDenominator(a) && checkDenominator(b)) {
            int numerator;
            int denominator;
            if (a.getN() == b.getN()) {
                numerator = (a.getM() - b.getM());
                denominator = a.getN();
            } else {
                numerator = (a.getM()) * b.getN() - (a.getN() * b.getM());
                denominator = (a.getN() * b.getN());
            }
            if (findGcd(numerator, denominator) > 1) {
                int gcd = findGcd(numerator, denominator);
                numerator = numerator / gcd;
                denominator = denominator / gcd;
            }
            c = new Fraction(numerator, denominator);
            System.out.println(c);

        }
    }

    public void fractionMulti(Fraction a, Fraction b) {
        Fraction c;
        int numerator;
        int denominator;
        numerator = a.getM() * b.getM();
        denominator = a.getN() * b.getN();
        if (findGcd(numerator, denominator) > 1) {
            int gcd = findGcd(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }
        c = new Fraction(numerator, denominator);
        System.out.println(c);

    }

    public void fractionDivision(Fraction a, Fraction b) {
        Fraction c;
        int numerator;
        int denominator;
        numerator = a.getM() * b.getN();
        denominator = a.getN() * b.getM();
        if (findGcd(numerator, denominator) > 1) {
            int gcd = findGcd(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }
        c = new Fraction(numerator, denominator);
        System.out.println(c);

    }
}
