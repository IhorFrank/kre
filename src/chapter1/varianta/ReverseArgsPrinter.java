package chapter1.varianta;

public class ReverseArgsPrinter {
    public void printRevers(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Reverse : " + args[i]);
        }

    }
}
