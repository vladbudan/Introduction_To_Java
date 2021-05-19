package by.epam.training.Algorithmization.multi_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//                                                                         1     2     3    ...   n
//                                                                         n    n-1   n-2   ...   1
//                                                                         1     2     3    ...   n
//                                                                         n    n-1   n-2   ...   1
//                                                                         ...  ...   ...   ...  ...
//                                                                         n    n-1   n-2   ...   1

public class Task04 {

    public static void main(String[] args) {

        int n = 6;

        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i % 2 == 0) {
                    arr[i][j] = j + 1;
                } else {
                    arr[i][j] = n - j;
                }
            }
        }

        System.out.println("Квадратная матрица порядка n: ");
        printArr(arr);
    }

    static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
        System.out.println();
    }
}
