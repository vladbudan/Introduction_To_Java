package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task02 {

    public static void main(String[] args) {

        int n = 3;

        int[][] arr = createArray(n, n);

        System.out.println("Начальный массив: ");
        printArray(arr);

        System.out.println("Элементы, стоящие на диагонали массива: ");
        for(int i = 0, k = arr[i].length - 1; i < arr.length; i++, k--) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j || j == k) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static int[][] createArray(int m, int n) {
        Random rand = new Random();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
        System.out.println();
    }

}
