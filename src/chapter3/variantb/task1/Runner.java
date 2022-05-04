package chapter3.variantb.task1;

import chapter3.variantb.task1.Fraction;
import chapter3.variantb.task1.FractionOperation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class Runner {
    public static void main(String[] args) {


        Fraction fraction = new Fraction(11,12);
        Fraction fraction1 = new Fraction(3,13);

        Fraction array1 = new Fraction(12,1);
        Fraction array2 = new Fraction(22,17);
        Fraction array3 = new Fraction(43,11);
        Fraction array4 = new Fraction(12,33);
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(array1);
        fractions.add(array2);
        fractions.add(array3);
        fractions.add(array4);


        Fraction [] array = new Fraction[4];
        array[0]= new Fraction(2,12);
        array[1]= new Fraction(21,3);
        array[2] = new Fraction(11,4);
        array[3] = new Fraction(23,12);


        FractionOperation fractionOperation = new FractionOperation();
        fractionOperation.fractionSum(fraction,fraction1);
        fractionOperation.fractionMinus(fraction,fraction1);
        fractionOperation.fractionMulti(fraction,fraction1);
        fractionOperation.fractionDivision(fraction,fraction1);

    }
}
