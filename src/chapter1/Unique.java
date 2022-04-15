package chapter1;

public class Unique {
    public static void printNumber () {
        for (int i = 100; i <= 999; i++) {
            int a = i / 100; // 1-9
            int b = (i / 10)%10; // (11/10) %  10 = 1
            int c = i % 10; // 10 % 10 = 1
            if (a != b && b != c && c != a) {
                System.out.println(i);
            }
        }
    }
}
