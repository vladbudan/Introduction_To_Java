package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {

    public static void main(String[] args) {

        int m = 4;
        int n = 8;

        int[][] arr = createArr(m, n);

        System.out.println("Начальная матрица: ");
        printArr(arr);

        for(int i = 0; i < arr.length; i++) {
            boolean sort = true;
            while(sort) {
                sort = false;
                for(int j = 1; j < arr[i].length; j++) {
                    if(arr[i][j] < arr[i][j - 1]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j - 1];
                        arr[i][j - 1] = temp;
                        sort = true;
                    }
                }
            }
        }

        System.out.println("Отсортированный массив по возрастанию: ");
        printArr(arr);

        for(int i = 0; i < arr.length; i++) {
            boolean sort = true;
            while(sort) {
                sort = false;
                for(int j = 1; j < arr[i].length; j++) {
                    if(arr[i][j] > arr[i][j - 1]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j - 1];
                        arr[i][j - 1] = temp;
                        sort = true;
                    }
                }
            }
        }

        System.out.println("Отсортированный массив по убыванию: ");
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
