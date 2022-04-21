package chapter2;

public class ShortLongNumberSeeker {
    public static void main(String[] arr) {
        int min = arr.length;
        int max = 0;
        String lenghtMax = null, lenghtMin = null;
        for (String number : arr) {
            if (number.length() > max) {
                lenghtMax = number;
                max = number.length();
            }
            if (number.length() < min) {
                lenghtMin = number;
                min = number.length();
            }
        }
        System.out.println("Max lenght : " + lenghtMax + " quantity charset : " + max);
        System.out.println("Min lenght : " + lenghtMin + " quantity charset : " + min);

    }
}