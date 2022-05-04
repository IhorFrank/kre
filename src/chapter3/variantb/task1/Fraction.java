package chapter3.variantb.task1;
//Реализовать методы сложения, вычитания, умножения и деления объектов (для
//тех классов, объекты которых могут поддерживать арифметические действия).
//1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
//Объявить и инициализировать массив из k дробей, ввести/вывести значе-
//ния для массива дробей. Создать массив/список/множество объектов и пе-
//редать его в метод, который изменяет каждый элемент массива с четным
//индексом путем добавления следующего за ним элемента.
public class Fraction {
    private int m;
    private int n;

    Fraction(int m, int n) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }


    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
