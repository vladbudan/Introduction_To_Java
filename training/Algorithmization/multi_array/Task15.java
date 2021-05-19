package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {

    public static void main(String[] args) {

        int m = 5;
        int n = 5;

        int[][] arr = createArr(m, n);

        System.out.println("Созданная матрица: ");
        printArr(arr);

        int max = arr[0][0];

        for(int[] line : arr) {
            for(int i : line) {
                if(max < i) {
                    max = i;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }

        System.out.println("Изменнённая матрица: ");
        printArr(arr);

    }

    public static int[][] createArr(int m, int n) {

        Random rand = new Random();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        return arr;
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
