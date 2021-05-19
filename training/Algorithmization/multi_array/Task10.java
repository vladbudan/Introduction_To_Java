package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {

    public static void main(String[] args) {

        int n = 6;

        int[][] arr = createArr(n, n);

        System.out.println("Данная матрица: ");
        printArr(arr);

        System.out.println("Положительные элементы диагонали матрицы: ");
        for(int i = 0; i < n; i++) {
            if(arr[i][i] > 0) {
                System.out.print(" " + arr[i][i]);
            }
        }

    }

    public static int[][] createArr(int m, int n) {

        Random rand = new Random();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(20) - 10;
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                if( n >= 0) {
                    System.out.print("  " + n);
                } else {
                    System.out.print(" " + n);
                }
            }
            System.out.println();
        }
    }

}
