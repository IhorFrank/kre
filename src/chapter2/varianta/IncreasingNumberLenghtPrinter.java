package chapter2.varianta;

import java.util.ArrayList;
import java.util.Arrays;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений
//их длины.
public class IncreasingNumberLenghtPrinter {

    public void printNumber(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].length() > input[j].length()) {            // (input[i].length() < input[j].length())
                    String buf = input[j];
                    input[j] = input[i];
                    input[i] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(input));


//        for (int i = input.length - 1; i > 0; i--) {
//            for (int j = 0; j < i ; j++) {
//                if (input[j].length() < input[j + 1].length()) {  //(input[j].length() > input[j + 1].length())
//                    String buf = input[j];
//                    input[j] = input[j + 1];
//                    input[j + 1] = buf;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(input));
    }

}




