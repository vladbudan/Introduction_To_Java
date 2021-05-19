package by.epam.training.Algorithmization.multi_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//                                                                               1     1     1    ...   1     1     1
//                                                                               0     1     1    ...   1     1     0
//                                                                               0     0     1    ...   1     0     0
//                                                                              ...   ...   ...   ...  ...   ...   ...
//                                                                               0     1     1    ...   1     1     0
//                                                                               1     1     1    ...   1     1     1

public class Task06 {

    public static void main(String[] args) {

        int n = 7;

        int[][] arr = new int[n][n];

        for(int i = 0; i < (n / 2 + n % 2); i++) {
            for(int j = 0; j < n; j++) {
                if(j >= i && j < n - i) {
                    arr[i][j] = 1;
                    arr[n - 1 - i][j] = 1;
                } else {
                    arr[i][j] = 0;
                    arr[n - 1 - i][j] = 0;
                }
            }
        }
        System.out.println("Квадратичная матрица порядка n: ");
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
