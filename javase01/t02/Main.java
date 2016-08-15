package javase01.t02;
import static java.lang.Math.pow;

public class Main {

    public static double returnA(int i) {
        return (1 / pow(i + 1, 2));
    }

    public static void OutValues(int n, double e){

        int j = 1;
        int minIndex;
        double a;

        for (int i = 1; i <= n; i++) {
            a = returnA(i);
            minIndex = i;

            if (a < e) {
                System.out.println("Наименьший номер элемента последовательности с условием a[n] < e: " + minIndex);
                break;
            }
        }

        System.out.println(" ");
        System.out.println("Все значения последовательности:");
        while (j <= n) {
            a = returnA(j);
            System.out.println(a);
            j++;
        }
    }

    public static void main(String[] args) {
        OutValues(10,0.022);
    }
}

