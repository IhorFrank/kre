package chapter2.varianta;

import java.util.ArrayList;
import java.util.Arrays;

//5. Найти количество чисел, содержащих только четные цифры
public class EvenNumbersPrinter {
    public void printNumber(String[] input) {

        String s = input.toString();
        char[] numbers = s.toCharArray();
        int[] num = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.valueOf(input[i]);
        }

        ArrayList<Character> alc = new ArrayList<>();
        for (char number : numbers) {
            alc.add(number);
        }
        ArrayList<Integer> iL = new ArrayList<>();
        for (int number : num) {
            iL.add(number);
        }
        int evenNumb = 0;
        int quantityEvenNUmb = 0;
        for (int i = 0; i < num.length; i++) {
           dlinna 1 chisla
            for (int j = 0; j < iL.size(); j++) {
                if (alc.get(j) % 2 == 0) quantityEvenNUmb++;
            }
            if (quantityEvenNUmb == dlinna 1 chilsa){
                evenNumb++;
            }
        }
        System.out.println(evenNumb);


    }
}