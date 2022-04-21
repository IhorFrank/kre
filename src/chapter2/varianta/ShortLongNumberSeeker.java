package chapter2.varianta;

public class ShortLongNumberSeeker {
    public  void printNumber (String [] array) {
        int min = array[0].length();
        int max = array[0].length();
        String lenghtMax = null, lenghtMin = null;
        for (String number : array) {
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