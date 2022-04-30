package chapter2.variavtb;

//Определить принадлежность некоторого значения k интервалам (n, m], [n,
//m), (n, m), [n, m].
public class BelongingIntervalChecker {
    public void printBelonging() {
        int n = (int) (Math.random() * 2000);
        int m = (int) (Math.random() * n) + n;
        int k = (int) (Math.random() * 2000);
        boolean isInRange1 = k >= n && k < m;
        System.out.println("(" + n + ", " + m + "] " + isInRange1 + " " + k);
        boolean isInRange2 = k > n && k <= m;
        System.out.println("[" + n + ", " + m + ") " + isInRange2 + " " + k);
        boolean isInRange3 = k >= n && k <= m;
        System.out.println("(" + n + ", " + m + ") " + isInRange3 + " " + k);
        boolean isInRange4 = k > n && k < m;
        System.out.println("[" + n + ", " + m + "] " + isInRange4 + " " + k);
    }

}
