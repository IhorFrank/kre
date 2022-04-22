package chapter2.varianta;

public class MediumLargeDivider {
    public void printNumber(String[] input) {

        int midLength = 0;
        int maxLength = 0;
        for (String number : input) {
            maxLength += number.length();
        }
        if (input.length > 0) {
            midLength = maxLength / input.length;
        }

        for (String number : input) {
            if (number.length() > midLength) {
                System.out.println("Max : " + number + " quantity charset : " + number.length());
            }
            if (number.length() < midLength) {
                System.out.println("Min : " + number + " quantity charset : " + number.length());
            }
        }
    }
}