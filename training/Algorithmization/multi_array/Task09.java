package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class Task09 {

    public static void main(String[] args) {

        int m = 3;
        int n = 5;

        int[][] arr = createArr(m, n);

        System.out.println("Начальная матрица: ");
        printArr(arr);

        int[] sumArray = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sumArray[i] += arr[j][i];
            }
            System.out.print(" " + sumArray[i]);
            if(sumArray[i] > sumArray[max]) {
                max = i;
            }
        }

        System.out.println("\nМаксимальная сумма в столбце: " + max);
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
