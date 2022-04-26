package chapter2.varianta;

import java.util.ArrayList;

public class DifferentDigitsNumberPrinter {
    public void printNumber (String [] input){
        ArrayList<String> number = new ArrayList<>();
        for (String num : input){
            if(isNumber(Integer.parseInt(num))) number.add(num);
        }
        if(number.isEmpty()){
            System.out.println("not number");;
        } else {
            System.out.println(number.get(0));
        }
    }
    private static boolean isNumber(int numbers) {
        String s = String.valueOf(numbers);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}




