package chapter1.varianta;

import java.util.Scanner;

public class Greeter {
    public void printHello(String[] args) {
        for (int i=0; i<args.length; i++){
        System.out.println("Hello " + args[i]);
    }

}
}
