package javase01.t05;

public class CrossOnesArray {

    int arrMatrix[][];

    CrossOnesArray(int i) {
        int arr[][] = new int[i][i];
        arrMatrix = arr;
    }

    public void makeCrossOnesArray(){
        for (int i = 0; i < arrMatrix.length; i++){
            for (int j = 0; j < arrMatrix.length; j++) {
                if (i == j) {
                    arrMatrix[i][j] = 1;
                    arrMatrix[arrMatrix.length - i - 1][j] = 1;
                    arrMatrix[i][arrMatrix.length - j - 1] = 1;
                }
                System.out.print(arrMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CrossOnesArray obj = new CrossOnesArray(7);
        obj.makeCrossOnesArray();
    }
}