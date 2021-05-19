package by.epam.training.Algorithmization.multi_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//                                                                           1     1     1    ...   1     1     1
//                                                                           2     2     2    ...   2     2     0
//                                                                           3     3     3    ...   3     0     0
//                                                                           ...  ...   ...   ...  ...   ...   ...
//                                                                           n-1   n-1    0    ...   0     0     0
//                                                                            n     0     0    ...   0     0     0

public class Task05 {

    public static void main(String[] args) {

        int n = 10;

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < n - i) {
                    arr[i][j] = i + 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Матрица порядка n: ");
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
        System.out.println();
    }

}
