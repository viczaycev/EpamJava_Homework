package javase01.t04;

public class Main {

    public static void main(String[] args) {

        double array[] = {1.1, 2.1, 3.1, 4.1, 10.466, 10.364, 7.1, 8.1, 9.1, 10.1};
        double max = Double.MIN_VALUE;

        for (int i = 0; i < (array.length / 2); i++) {
            if ((array[i] + array[array.length - i - 1]) > max) {
                max = array[i] + array[array.length - i - 1];
            }
        }

        System.out.print("Максимальное значение пары: " + max);
    }
}
