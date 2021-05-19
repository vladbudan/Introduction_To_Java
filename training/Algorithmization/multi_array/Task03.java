package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Дана матрица. Вывести k-ю строку и р-й столбец матрицы.

public class Task03 {

    public static void main(String[] args) {

        int m = 3;
        int n = 4;

        int k = 1;
        int p = 2;

        int[][] arr = createArr(m, n);

        System.out.println("Начальный массив: ");
        printArr(arr);

        System.out.println("k-я строка и р-й столбец матрицы: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(i == k || j == p) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

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
