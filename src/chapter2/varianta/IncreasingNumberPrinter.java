package chapter2.varianta;

// //6.Найти число, в котором число различных цифр минимально. Если таких
//          //чисел несколько, найти первое из них.

import java.util.*;

public class IncreasingNumberPrinter {
    public void printNumber(String[] input) {
        ArrayList<String> number = new ArrayList<>();
        for (String num : input) {
            if (isNumber(Integer.parseInt(num))) number.add(num);
        }
        if (number.isEmpty()) {
            System.out.println("not number");
            ;
        } else {
            System.out.println(number.get(0));
        }
    }

    private boolean isNumber(int number) {
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) > s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}








