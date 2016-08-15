package javase01.t03;
import static java.lang.Math.tan;

public class Main {

    public static double retFuncValue(int i){
        return (tan(2 * i) - 3);
    }

    public static void funcValues(int a, int b, int h) {
        while (a <= b) {
            System.out.println("      " + a + "               " + retFuncValue(a));
            a = a + h;
        }
    }

    public static void main(String[] args) {
        System.out.println("Значение аргумента" + "     " + "Значение функции");
        funcValues(3,10,1);
    }
}
