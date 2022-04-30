package chapter2.varianta;

import java.util.ArrayList;

public class PalindromeNumberPrinter {
    public void printPalindrome(String[] input) {
        ArrayList<String> palindromeNumbers = new ArrayList<>();

        for (String number : input) {
            if (isPalindrome(number)) palindromeNumbers.add(number);
        }
        if (palindromeNumbers.isEmpty()) {
            System.out.println("no palindrome number");
        } else System.out.println(palindromeNumbers.get(0));

    }

    private static boolean isPalindrome(String number) {
        int min = 0;
        int max = number.length() - 1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(min) != number.charAt(max)) {
                return false;
            }
            max--;
            min++;
        }

        return true;
    }
}
