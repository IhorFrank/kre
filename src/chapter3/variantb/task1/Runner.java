package chapter3.variantb.task1;

public class Runner {
    public static void main(String[] args) {
        RationalFraction[] array = createArray();
        modifyEvenElements(array);
        printElements(array);
    }

    private static void printElements(RationalFraction[] array) {
        for (RationalFraction rationalFraction : array) {
            System.out.println(rationalFraction);
        }
    }

    private static void modifyEvenElements(RationalFraction[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isEvenIndex(array, i)) {
                RationalFraction current = array[i];
                RationalFraction next = array[i + 1];
                RationalFraction newFraction = current.add(next);
                array[i] = newFraction;
            }
        }
    }

    private static boolean isEvenIndex(RationalFraction[] array, int i) {
        return i % 2 == 0 && i + 1 < array.length;
    }

    private static RationalFraction[] createArray() {
        RationalFraction[] array = new RationalFraction[6];
        array[0]= new RationalFraction(2,12);
        array[1]= new RationalFraction(21,3);
        array[2] = new RationalFraction(11,4);
        array[3] = new RationalFraction(23,12);
        array[4] = new RationalFraction(42,44);
        array[5] = new RationalFraction(26,55);
        return array;
    }
}
