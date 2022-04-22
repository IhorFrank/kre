package chapter2.varianta;

public class ShortLongNumberPrinter {
    public void printNumber(String[] input) {
        int minLength = input[0].length();
        int maxLength = input[0].length();
        String maxVal = null, minVal = null;
        for (String number : input) {
            if (number.length() > maxLength) {
                maxVal = number;
                maxLength = number.length();
            }
            if (number.length() < minLength) {
                minVal = number;
                minLength = number.length();
            }
        }
        System.out.println("Max value: " + maxVal + ", length: " + maxLength);
        System.out.println("Min value: " + minVal + ", length: " + minLength);

    }

}