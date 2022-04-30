package chapter2.varianta;

import java.util.ArrayList;

public class UniqueDigitsNumberPrinter {
    public void printNumber(String[] input) {
        ArrayList<String> number = new ArrayList<>();
        for (String num : input) {
            if (isUniqueDigits(num)) number.add(num);
        }
        if (number.isEmpty()) {
            System.out.println("not number");

        } else {
            System.out.println(number.get(0));
        }
    }

    private static boolean isUniqueDigits(String number) {
        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}




