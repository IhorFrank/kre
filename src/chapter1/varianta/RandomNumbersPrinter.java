package chapter1.varianta;

public class RandomNumbersPrinter {
    public void printRandomNumbers(int quantity) {
        System.out.print("Random numbers: ");
        for (int i = 0; i < quantity; i++) {
            int a = (int) (Math.random() * 2000);
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

